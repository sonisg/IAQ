class Solution {
    static int[][] dp;

    static int palindromicPartition(String s) {
        int n = s.length();

        // dp[i][j] represents the minimum number of cuts needed for palindrome partitioning of s[i..j]
        dp = new int[n][n];

        // Initialize the dp matrix
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Initialize the base cases
        return solve(0, n - 1, s);
    }

    private static boolean isPalindrome(int i, int j, String str) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static int solve(int i, int j, String str) {
        if (i >= j) {
            return 0;
        }

        if (isPalindrome(i, j, str)) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int tempAns = solve(i, k, str) + solve(k + 1, j, str) + 1;
            ans = Math.min(ans, tempAns);
        }

        return dp[i][j] = ans;
    }
}
