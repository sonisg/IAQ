package pc;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
        public static void main(String[] args) {
            String a = "abcda";
            List<String> s = findSubstringsWithoutRepeatingCharacters(a);
            System.out.println(s);
            System.out.println(s.size());
        }

        public static List<String> findSubstringsWithoutRepeatingCharacters(String str) {
            List<String> substrings = new ArrayList<>();
            int n = str.length();
            int start = 0;
            int end = 0;
            Set<Character> seen = new HashSet<>();

            while (end < n) {
                char ch = str.charAt(end);
                if (!seen.contains(ch)) {
                    seen.add(ch);
                    end++;
                } else {
                    substrings.add(str.substring(start, end));
                    while (str.charAt(start) != ch) {
                        seen.remove(str.charAt(start));
                        start++;
                    }
                    start++;
                    end++;
                }
            }
            substrings.add(str.substring(start, end)); // Add the last substring
            return substrings;
        }
    }


