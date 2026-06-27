class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length()-1;
        int m = text2.length()-1;

        dp = new int[n+2][m+2];

        for(int i[] : dp){
            Arrays.fill(i,-1);
        }

        return lcs(n,m,text1,text2);
    }

    public int lcs(int n, int m, String s1, String s2){

        if(n < 0 || m < 0){
            return 0;
        }

        if(dp[n][m] != -1) return dp[n][m];

        if(s1.charAt(n) == s2.charAt(m)){
            return dp[n][m] = 1 + lcs(n-1,m-1,s1,s2);
        }else{
            return dp[n][m] = Math.max(lcs(n-1,m,s1,s2),lcs(n,m-1,s1,s2));
        }
    }
}