package pc;

import java.util.ArrayList;
import java.util.List;

public class PER {
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            backtrack( res, new ArrayList<>(), nums);
            System.out.println(res);
            return res;
        }

        private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
            if(tempList.size() == nums.length){
                list.add(new ArrayList<>(tempList));
            }
            for(int i =0;i<nums.length;i++){
                if(tempList.contains(nums[i])) {
                    continue;
                }
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size()-1);
            }
        }

        public static void main(String args[]){
            int[] a = {1,2,3};
            permute(a);
        }


}
