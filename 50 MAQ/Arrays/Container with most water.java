class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int min = 0;
        int max = n-1;
        int maxArea =0;
        while(min<max){
            int w = max - min;
            int h = Math.min(height[min],height[max]);
            maxArea = Math.max(maxArea, w * h);
            if(height[min]<height[max]){
                min++;
            }else{
                max--;
            }
        }
        return maxArea;   
        
    }
}
