class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> seen = new HashMap<>();
        while (n != 1 && !seen.containsKey(n)) {
            seen.put(n, true);
            n = getNext(n);
        }
        return n == 1;
    }

    public int getNext(int n){
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem);
            n = n/10;
        }
        return sum;
    }
}


// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
// Example 2:

// Input: n = 2
// Output: false
