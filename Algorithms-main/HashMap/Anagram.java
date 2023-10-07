public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            }else{
                hash.put(s.charAt(i), 1);
            }
        }

        for(int i =0; i < t.length(); i++){
            if(hash.containsKey(t.charAt(i))){
                hash.put(t.charAt(i), hash.get(t.charAt(i)) - 1);
            }else{
                return false;
            }
        }

        Set<Character> keys = hash.keySet();
        for (Character key : keys) {
            if (hash.get(key) != 0) {
                return false;
            }
        }
        return true;    
    }


// Example 1 :

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2 :

// Input: s = "rat", t = "car"
// Output: false
