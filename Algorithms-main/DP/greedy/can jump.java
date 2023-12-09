package com.company.dp;

class jumpGame {

    public static boolean canJump(int[] nums) {

        int n = nums.length;
        int maxR = 0;
        for (int i = 0; i < n; i++) {

            if (maxR < i) {
                return false;
            }

            maxR = Math.max(maxR, nums[i] + i);

            if (maxR > n - 1) {
                return true;
            }
        }
        return false;
    }

        public static void main(String args[])
        {
            int[] nums = {2,3,1,1,4};
            System.out.println(canJump(nums));
        }
    }

