class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, n, "", result);
        return result;   
    }

     private static void generateParenthesisHelper(int left, int right, String current, List<String> result) {
        // Base case: if both left and right parentheses are used up, add the current combination to the result
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }

        // Add a left parenthesis if there are remaining left parentheses
        if (left > 0) {
            generateParenthesisHelper(left - 1, right, current + "(", result);
        }

        // Add a right parenthesis if it makes a valid combination
        if (right > left) {
            generateParenthesisHelper(left, right - 1, current + ")", result);
        }
    }
}
