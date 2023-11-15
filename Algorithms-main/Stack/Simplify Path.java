class Solution {
    public String simplifyPath(String path) {
       String[] components = path.split("/");
       Stack <String> stack = new Stack<>();

       for (String c: components){
           if(c.equals("..")){
               if(!stack.isEmpty()){
                   stack.pop();
               }
           } else if(!c.equals("") && !c.equals(".")){
               stack.push(c);
           }
       }

       StringBuilder result = new StringBuilder("/");
        for (String dir : stack) {
            result.append(dir).append("/");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}


// Example 1:

// Input: path = "/home/"
// Output: "/home"
// Explanation: Note that there is no trailing slash after the last directory name.
// Example 2:

// Input: path = "/../"
// Output: "/"
// Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
// Example 3:

// Input: path = "/home//foo/"
// Output: "/home/foo"
// Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
