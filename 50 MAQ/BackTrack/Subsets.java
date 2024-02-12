class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res = back(nums, 0, new ArrayList<>(), res);
        return res;
    }
    public List<List<Integer>> back(int[] nums, int s, List<Integer> tem, List<List<Integer>> res){
        res.add(new ArrayList<>(tem));
        for(int i = s; i<nums.length;i++){
            tem.add(nums[i]);
            back(nums,i+1,tem,res);
            tem.remove(tem.size()-1);
        }
        return res;
    }
}
