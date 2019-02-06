package com.company.Sorting;

import java.util.Arrays;

public class JDKsorting {

    public static void main(String args[]){
        int[] intArray = {2, 34, -1, -5, -3};

        // uses a duel pivot quick sort
        Arrays.sort(intArray);
        // can pass an index to an end index to only sort to a certain index
        Arrays.sort(intArray, 0, intArray.length-1);
        // parallel sort-merge, breaks array into sub arrays. Uses Threads
        Arrays.parallelSort(intArray);

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
}
