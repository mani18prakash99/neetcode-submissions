class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int startRow = 0;
        int endRow = r-1;
        int startCol = 0;
        int endCol = c-1;

        int total = r*c;
        int count = 0;

        List<Integer> ans = new ArrayList<>();
        while(count < total){
            
            for(int index = startCol; count < total && index <= endCol; index++){
                ans.add(matrix[startRow][index]);
                count++;
            }
            startRow++;

            for(int index = startRow; count < total && index <= endRow; index++){
                ans.add(matrix[index][endCol]);
                count++;
            }
            endCol--;

            for(int index = endCol; count < total && index >= startCol; index--){
                ans.add(matrix[endRow][index]);
                count++;
            }
            endRow--;

            for(int index = endRow; count < total && index >= startRow; index--){
                ans.add(matrix[index][startCol]);
                count++;
            }
            startCol++;
        }

        return ans;
    }
}