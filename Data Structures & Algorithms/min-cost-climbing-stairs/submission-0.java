class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int curr = 0, prev1 = 0, prev2 = 0;

        for(int i = 2; i <= n; i++){
            curr = Math.min(cost[i-1] + prev1, cost[i-2] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}