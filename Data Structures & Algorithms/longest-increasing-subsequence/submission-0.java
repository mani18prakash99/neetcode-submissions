class Solution {
    public int lengthOfLIS(int[] nums) {
        
        return helper(0,-1,nums);
    }

    public int helper(int i, int p, int[] nums){

        if(i >= nums.length) return 0;

        int take = 0;
        if(p == -1 || nums[p] < nums[i]){
            take = 1 + helper(i+1,i,nums);
        }

        int skip = helper(i+1,p,nums);

        return Math.max(take,skip);
    }
}