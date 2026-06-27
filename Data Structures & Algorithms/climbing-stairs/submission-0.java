class Solution {
    public int climbStairs(int n) {
        return helper(n);
    }

    public int helper(int n){
        
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        return helper(n-1) + helper(n-2);
    } 
}
