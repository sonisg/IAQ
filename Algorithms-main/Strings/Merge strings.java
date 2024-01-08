class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder s = new StringBuilder();
        int l = word1.length() + word2.length();
        int fi=0, si=0;
        for(int i =0;i<l;i++){
            if(i%2==0){
                if(fi<word1.length()){
                    s.append(word1.charAt(fi++));
                }else{
                 s.append(word2.charAt(si++));
                }
            } else {
                if(si<word2.length()){
                     s.append(word2.charAt(si++));
                }else{
                    s.append(word1.charAt(fi++));
                }
            }
        }
        return s.toString();
        
    }
}
