public boolean isSubsequence(String s, String t) {
        int tm = 0;
        if(tm == s.length()){
            return true;
        }

        for(int i =0; i< t.length(); i++){
            if(s.charAt(tm) == t.charAt(i)){
                tm++;
            }
            if(tm==s.length()){
                return true;
            }
        }
        return false;
    }

// Input: s = "abc", t = "ahbgdc"
// Output: true
