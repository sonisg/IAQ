class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
        
    }
    public String backspace(String s){
        Stack<Character> sp = new Stack();
         for (char c : s.toCharArray()) {
             if(c == '#' && !sp.isEmpty()){
                 sp.pop();
             } else if (c != '#'){
                 sp.push(c);
             }
         }
        StringBuilder result = new StringBuilder();
        for (char c : sp) {
            result.append(c);
        }
        return result.toString();
    }
}


// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".
// Example 2:

// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".
// Example 3:

// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".
