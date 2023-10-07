int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for(int i =0;i < array.length; i++){
            sum = sum + array[i];
        }
        int sumOfNum = n;
        for(int i = 0;i < n; i++){
            sumOfNum = sumOfNum + i;
        }
        return sumOfNum-sum;
    }
