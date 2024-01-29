class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> h = new HashMap<>();
        List<Integer> a = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }else{
                h.put(nums[i],1);
            }
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Create the result array
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }

        return result;    
    }
}

TC: O(K log n);
