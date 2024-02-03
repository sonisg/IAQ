class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max =0;
        int i =0;
        HashMap<Character,Integer> h = new HashMap<>();

        int n = s.length();
        for(int j =0;j<n;j++){
           if(h.containsKey(s.charAt(j)) && h.get(s.charAt(j)) >= i){
              i = h.get(s.charAt(j))+1;
           }
           h.put(s.charAt(j), j);
           max = Math.max(max, j-i+1);
        }
       return max;
      
    }
}
