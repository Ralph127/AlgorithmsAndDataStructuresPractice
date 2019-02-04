package com.company.Sorting;

// O(nlogn) base 2
public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = {2, -2, 10, -44, 25, -77, 66};
        mergeSort(intArray, 0, intArray.length);

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] array, int start, int end) {

        if(end - start < 2) {
            return;
        }

        int mid = (start + end) /2;

        mergeSort(array, start, mid);
        mergeSort(array, mid, end);

        merge(array, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        if(input[mid -1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while(i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
