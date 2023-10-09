package com.company.sortingalgos;

public class sort012 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 2, 0, 0, 1};

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sortArray(arr);

        System.out.print("\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void sortArray(int[] arr) {
        int low =0;
        int high = arr.length -1 ;
        int mid =0;
        int temp;
        while( mid <=high){
            switch(arr[mid]){
                case 0:
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }

        }
    }
}
