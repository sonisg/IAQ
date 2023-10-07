public boolean wordPattern(String pattern, String s) {
  
        HashMap <Character,String> h = new HashMap<>();
        HashMap<String, Character> w = new HashMap<>();
        String[] a = s.split(" ");
        if(pattern.length() != a.length){
            return false;
        }
        for(int i =0; i<pattern.length(); i++){
          
            if(h.containsKey(pattern.charAt(i))){
               if(!h.get(pattern.charAt(i)).equals(a[i])){
                   return false;
               }
            } else{
                h.put(pattern.charAt(i), a[i]);
            }

            if (w.containsKey(a[i])) {
                if (w.get(a[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                w.put(a[i], pattern.charAt(i));
            }
        }
        return true;  
 }


// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
