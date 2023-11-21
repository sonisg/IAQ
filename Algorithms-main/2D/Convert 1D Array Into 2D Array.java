class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];

        if (original.length != m * n) {
            return new int[0][0];
        }

        for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                int ind = i * n + j;
                res[i][j] = original[ind];
            }
        }
        return res;
    }
}

// Input: original = [1,2,3,4], m = 2, n = 2
// Output: [[1,2],[3,4]]
