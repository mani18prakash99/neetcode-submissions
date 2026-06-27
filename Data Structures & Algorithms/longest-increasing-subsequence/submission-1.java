class Solution {

    int dp[][];
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n+1][n+1];

        for(int i[] : dp) Arrays.fill(i,-1);
        return helper(0,-1,nums);
    }

    public int helper(int i, int p, int[] nums){

        if(i >= nums.length) return 0;

        if(p != -1 && dp[i][p] != -1) return dp[i][p];

        int take = 0;
        if(p == -1 || nums[p] < nums[i]){
            take = 1 + helper(i+1,i,nums);
        }

        int skip = helper(i+1,p,nums);
        
        if(p != -1) dp[i][p] = Math.max(take,skip);

        return Math.max(take,skip);
    }
}