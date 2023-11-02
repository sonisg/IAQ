public List<List<String>> groupAnagrams(String[] strs) {
    // Create a hashmap to group anagrams
    Map<String, List<String>> anagramGroups = new HashMap<>();

    // Iterate through each word in the array
    for (String word : strs) {
        // Sort the characters in the word to create a unique key
        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);
        String sortedWord = new String(wordChars);

        // If the sorted word is already in the hashmap, add the original word to its group
        if (anagramGroups.containsKey(sortedWord)) {
            anagramGroups.get(sortedWord).add(word);
        } else {
            // If the sorted word is not in the hashmap, create a new group with the original word
            List<String> group = new ArrayList<>();
            group.add(word);
            anagramGroups.put(sortedWord, group);
        }
    }

    // Convert the values of the hashmap (anagram groups) to a list of lists
    return new ArrayList<>(anagramGroups.values());
}

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]
// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]
