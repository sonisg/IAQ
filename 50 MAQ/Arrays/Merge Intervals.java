public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals based on their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Merge overlapping intervals
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            // Check for overlap
            if (currentInterval[1] >= nextInterval[0]) {
                // Merge intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // Add the non-overlapping interval to the result
                result.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last interval
        result.add(currentInterval);

        // Convert the list to an array
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(intervals);

        // Output the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

The time complexity of the provided solution is O(n log n)
