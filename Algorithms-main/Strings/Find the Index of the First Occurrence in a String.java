public int strStr(String haystack, String needle) {
    if (needle.isEmpty()) {
        return 0;
    }

    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        int j;
        for (j = 0; j < needle.length(); j++) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                break;
            }
        }
        if (j == needle.length()) {
            return i; // Complete match found
        }
    }

    return -1; // No match found
}

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
