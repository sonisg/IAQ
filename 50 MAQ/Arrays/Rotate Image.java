class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        
        //Transpose
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int tm = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tm;
            }
        }

//Reverse the numbers
        for(int i =0;i<n;i++){
            int left =0;
            int right =n-1;
            while(left<right){
                int t = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=t;
                left++;
                right--;
            }
        }    
    }
}
