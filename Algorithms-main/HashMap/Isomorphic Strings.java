class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i =0 ; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }

            if(map2.containsKey(t.charAt(i))){
                if(map2.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            } else {
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}


// Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true
