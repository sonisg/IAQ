class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);
            if(hash.containsKey(sortedWord)){
                hash.get(sortedWord).add(s);      
            } else {
                List<String> w = new ArrayList<>();
                w.add(s);
                hash.put(sortedWord,w);
            }
        }
        return new ArrayList<>(hash.values());
        
    }
}


Algo:

The algorithm uses a HashMap to store groups of anagrams. 
The key is the sorted representation of each word, and the value is a List of original unsorted words that are anagrams of each other.
For each input string s, the algorithm converts it into a char array, sorts the array, and then converts it back to a string (sortedWord). 
This ensures that anagrams have the same sorted representation.
The algorithm checks if the sorted word is already a key in the HashMap.
If yes, it adds the original unsorted word to the corresponding group. If not, it creates a new group and adds the unsorted word to it.
Finally, the values of the HashMap (groups of anagrams) are converted to a List, and the list is returned.

Time Complexity: O(N * K * log(K)), where N is the number of strings in the input array, and K is the length of the longest string.
