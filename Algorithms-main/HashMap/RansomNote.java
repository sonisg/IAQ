public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> f = new HashMap<>();
        for (char c : magazine.toCharArray()) {
           f.put(c, f.getOrDefault(c, 0) + 1);
        }

        for(char ch: ransomNote.toCharArray()){
            if(!f.containsKey(ch) || f.get(ch)==0){
                return false;
            } else {
                f.put(ch, f.get(ch)-1);
            }
        }
        return true;
    }



// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true
