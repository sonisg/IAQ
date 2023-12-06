class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        backT(res, new ArrayList<>(), s, 0 );
        return res;
    
    }

    private void backT(List<List<String>> res, List<String> cur, String s, int index){
        if(index==s.length()){
            res.add(new ArrayList<>(cur));
        }
        
        for(int end = index+1;end<=s.length();end++){
            String t = s.substring(index, end);
            if(isPalindrome(t)){
                cur.add(t);
                backT(res, cur, s, end);
                cur.remove(cur.size()-1);
            }
         }
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


// Given a string s, partition s such that every 
// substring
//  of the partition is a 
// palindrome
// . Return all possible palindrome partitioning of s.

 

// Example 1:

// Input: s = "aab"
// Output: [["a","a","b"],["aa","b"]]
// Example 2:

// Input: s = "a"
// Output: [["a"]]
