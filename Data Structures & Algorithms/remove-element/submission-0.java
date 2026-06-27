class Solution {
    public int removeElement(int[] nums, int val) {
        
        List<Integer> tmp = new ArrayList<>();
        for(int i : nums){
            if(i != val){
                tmp.add(i);
            }
        }

        for(int i = 0; i < tmp.size(); i++){
            nums[i] = tmp.get(i);
        }

        return tmp.size();
    }
}