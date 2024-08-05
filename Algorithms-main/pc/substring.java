package pc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class substring {

    public static void main(String[] args) {
        String a = "abcda";
        int l = a.length();
        List<String> s = new ArrayList<>();

        for(int i=0;i<=l;i++){
            for(int j=i+1;j<=l;j++){
                String sp = a.substring(i,j);

                if (!hasRepeatingCharacters(sp)) {
                    s.add(sp);
                }
            }
        }
        System.out.println(s);
        System.out.println( s.size());
    }

    public static boolean hasRepeatingCharacters(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return true;
            }
            set.add(ch);
        }
        return false;
    }
}
