package com.company.sortingalgos;

// Java program for implementation of Bubble Sort
class BubbleSort {

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSortFunction b = new BubbleSortFunction();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        b.bubbleSort(arr);
        System.out.println("Sorted array");
        b.printArray(arr);
    }


}

