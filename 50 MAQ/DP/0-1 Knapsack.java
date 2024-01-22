class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int dp[][]=new int [n+1][W+1];
         
         for(int i =0;i<=n;i++){
             for(int j =0;j<=W;j++){
                 if(i==0||j==0){
                     dp[i][j]=0;
                 } else if(wt[i-1]<=j){
                     dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                 } else{
                     dp[i][j]=dp[i-1][j];
                 }
             }
         }
         
        return dp[n][W];
    } 
}

Algo:
Create a 2D array dp of size (n + 1) x (W + 1) where n is the number of items and W is the knapsack capacity.
Set dp[i][0] = 0 for all i (when the knapsack capacity is 0, the maximum value is 0).
Set dp[0][j] = 0 for all j (when there are no items, the maximum value is 0).
Iterate through each item i from 1 to n:
For each capacity j from 1 to W:
If the weight of the current item wt[i-1] is less than or equal to j:
dp[i][j] = max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j])
Else:
dp[i][j] = dp[i-1][j]
The maximum value is stored in dp[n][W]

Input:
N = 3
W = 4
values[] = {1,2,3}
weight[] = {4,5,1}
Output: 3
Explanation: Choose the last item that weighs 1 unit and holds a value of 3. 
  
Time Complexity:  O(n * W), where "n" is the number of items and "W" is the knapsack capacity.
