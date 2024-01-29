class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        if(m==0 || n==0){
            return 0;
        }

        int [][] dp = new int[m+1][n+1];
        for(int i =1;i<=m;i++){
            for(int j =1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
        
    }
}

Algo:
text1: abcd,  text2: abde

Check from end and if equal then check for next char, if not either choice next char for text1 or text2 and take the max result of that.
Do it recursively.

TC: O(m * n), where "m" is the length of text1 and "n" is the length of text2
