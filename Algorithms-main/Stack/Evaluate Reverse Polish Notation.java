class Solution {
 public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(a + b);
            } else if (tokens[i].equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b - a);
            } else if (tokens[i].equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(a * b);
            } else if (tokens[i].equals("/")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b / a);
            } else {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}

// Example 1:

// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9
// Example 2:

// Input: tokens = ["4","13","5","/","+"]
// Output: 6
// Explanation: (4 + (13 / 5)) = 6
