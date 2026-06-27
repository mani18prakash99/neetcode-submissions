class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n < 2) return nums[0];

        int dp1[] = new int[n+1];
        int dp2[] = new int[n+1];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int firstIdx = helper(0,n-1,nums,dp1);
        int secondIdx = helper(1,n,nums,dp2);

        return Math.max(firstIdx,secondIdx);
    }

    public int helper(int i, int n, int[] nums, int[] dp){

        if(i >= n) return 0;

        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max(nums[i] + helper(i+2,n,nums,dp), helper(i+1,n,nums,dp));
    }
}