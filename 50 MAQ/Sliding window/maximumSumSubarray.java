class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
         int i=0,j=0;
        long msum =0; long s =0;
        while(j<N){
            s = s + Arr.get(i);
            if(j-i+1 < K){
                j++;
            } else if(j-i+1 ==K){
                msum = Math.max(msum, s);
                s = s - Arr.get(i);
                i++;
                j++;
            }
        }
        return msum;   
    }
}
