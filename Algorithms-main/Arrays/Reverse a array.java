public void reverse (int[] a, int s, int e)
    {
      while (s<e){
        int t = a[s];
        a[s]=a[e];
        a[e]=t;
        s++;
        e--;
        }
    }
