public static void sort012(int[] arr)
    {
        int n0 =0;
        int n1=0;
        int n2=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0)
                n0++;
            else if(arr[i]==1) 
                n1++;
            else
                n2++;       
        }

        for(int i =0; i<n0; i++){
            arr[i]=0;
        }
        for (int i = n0; i<n0+n1; i++){
            arr[i]=1;
        }
        for(int i =n1 + n0; i<n0+n1+n2; i++){
            arr[i]=2;
        }
    }
