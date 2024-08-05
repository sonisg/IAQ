package coreconceptsprtc;

import java.util.*;

class Solution {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder combination, int index) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = KEYS[digit - '0'];
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(result, digits, combination, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}





    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();

            // Test case 1
            String digits1 = "23";
            List<String> result1 = solution.letterCombinations(digits1);
            System.out.println("Letter combinations for " + digits1 + ": " + result1);

            // You can add more test cases as needed
        }


    }

