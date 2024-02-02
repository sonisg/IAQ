class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i =0;i<s.length();i++){
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j =0;j<t.length();j++){
            if(!h.containsKey(t.charAt(j))){
                return false;
            }
            else{
                h.put(s.charAt(j),h.getOrDefault(s.charAt(j),0)-1);
            }
        }

        Set<Character> keys= h.keySet();
        for(Character k:keys){
            if(h.get(k)!=0){
                return false;
            }
        }

        return true;
        
    }
}
