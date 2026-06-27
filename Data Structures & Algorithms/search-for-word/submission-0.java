class Solution {
    public boolean exist(char[][] board, String word) {
        int ROWS = board.length;
        int COLS = board[0].length;

        boolean vis[][] = new boolean[ROWS][COLS];

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(dfs(board,word,r,c,0,ROWS,COLS,vis)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char grid[][], String word, int r, int c, int i, int rows, int cols, boolean vis[][]){
        if(i == word.length()){
            return true;
        }

        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != word.charAt(i) || vis[r][c] == true){
            return false;
        }

        vis[r][c] = true;

        boolean found = dfs(grid,word,r+1,c,i+1,rows,cols,vis) || dfs(grid,word,r-1,c,i+1,rows,cols,vis) || dfs(grid,word,r,c+1,i+1,rows,cols,vis) || dfs(grid,word,r,c-1,i+1,rows,cols,vis);

        vis[r][c] = false;

        return found;
    }
}