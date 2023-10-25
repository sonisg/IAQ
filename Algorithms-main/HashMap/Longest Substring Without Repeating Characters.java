class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        int max = 0;
        int start =0;
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i =0; i < s.length(); i++){

            if(h.containsKey(s.charAt(i)) &&  h.get(s.charAt(i)) >= start){
                start =h.get(s.charAt(i))+1;
            }
            h.put(s.charAt(i), i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}


// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
