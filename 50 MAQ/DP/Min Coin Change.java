class Solution {
    public int coinChange(int[] coins, int amount) {
       int n = coins.length;
       int dp[] = new int[amount + 1];
       Arrays.fill(dp, amount+1);
       dp[0]=0;
       for(int c: coins){
           for(int i = c;i<=amount;i++){
               dp[i]=Math.min(dp[i],dp[i-c]+1);
           }
       }

       return dp[amount] > amount ? -1 : dp[amount];


    }
}

// Input: coins = [1,2,5], amount = 11
// dp[0] = 0;
// dp[1] = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12];
// dp[2]=[0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6];
// dp[5]= [0, 1, 1, 2, 2, 1, 2, 2, 3, 3, 2, 3, 3]

Algo:

Create an array dp of size amount + 1.
Set all elements in dp to amount + 1, except dp[0] which is set to 0.
For each coin c in the array coins:
Iterate from c to amount:
Update dp[i] by taking the minimum of its current value and dp[i - c] + 1.
Check dp[amount], If dp[amount] is greater than amount, return -1 (impossible to make up the amount).Otherwise, return dp[amount] as the minimum number of coins needed.
  
Example with coins = [1,2,5] and amount = 11:
Dynamic Programming Loop updates dp to represent minimum coins needed for each amount.
The result is dp[11], which is 3 (coins [5, 5, 1]).

Time complexity: O(n * amount).
