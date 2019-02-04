package com.company.Sorting;


// O(nlogn) base 2
public class QuickSort {

    public static void main(String args[]){
        int[] intArray = {2, -2, 10, -44, 25, -77, 66};

        quickSort(intArray, 0, intArray.length);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex +1, end);
    }

    public static int partition(int[] input, int start, int end){
        // this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j) {

            // Note: empty loop body
            while(i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }
            //Note: empty loop body
            while(i < j && input[++i] <= pivot);
            if(i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;

        return j;
    }
}
