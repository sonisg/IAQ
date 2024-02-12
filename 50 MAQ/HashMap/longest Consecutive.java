class Solution {
    public int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> h = new HashSet<>();
        for (int num: nums){
            h.add(num);
        }
        int longestStreak = 0;
        for(int num: nums){
            if(!h.contains(num-1)){
                int c = num;
                int cs=1;
                while(h.contains(c+1)){
                    c++;
                    cs++;
                }
                longestStreak = Math.max(longestStreak, cs);
            }
        }
        return longestStreak;
    }
}
