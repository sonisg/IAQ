class Solution
{
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high) {
        int p = partition(arr, low, high);
        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pv = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pv){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    } 
    
    public static void swap(int arr[], int l, int h) {
    int t = arr[l];
    arr[l] = arr[h];
    arr[h] = t;
}
}

Algo:
The logic is simple, we start from the leftmost element and keep track of the index of smaller (or equal) elements as i. 
While traversing, if we find a smaller element, we swap the current element with arr[i]. Otherwise, we ignore the current element.

TC:
Average Time Complexity: O(n log n)
Worst-case Time Complexity: O(n^2) - This occurs when the pivot selection consistently results in unbalanced partitions.
Best-case Time Complexity: O(n log n) - This occurs when the pivot selection consistently results in well-balanced partitions.
Space Complexity: O(log n) - It is a recursive algorithm, and the space required for the recursion stack is logarithmic.
