package Algorithms.Sorting;

import Algorithms.Stopwatch;

import java.util.Random;

import static Algorithms.Sorting.SortHelper.*;
public class QuickSort {

    /**
     * Public method to perform quicksort on an array.
     * @param unsortedArray the array to be sorted.
     */
    public static void quickSort(Integer[] unsortedArray){
        quickSort(unsortedArray, 0, unsortedArray.length - 1);
    }

    /**
     * Recursive quicksort method.
     * @param array the array to be sorted.
     * @param low the starting index.
     * @param high the ending index.
     */
    private static void quickSort(Integer[] array, int low, int high){
        if(low < high){
            // Partition index
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    /**
     * Partition method to place the pivot element in the correct position.
     * @param array the array to be partitioned.
     * @param low the starting index.
     * @param high the ending index.
     * @return the index of the pivot element.
     */
    private static int partition(Integer[] array, int low, int high) {
        /*
         * This function takes last element as pivot,
         * places the pivot element at its correct position
         * in sorted array, and places all smaller to left
         * of pivot and all greater elements to right of pivot
         */

        int pivot = array[high]; // Choose the pivot element
        int i = low - 1; // Index of smaller element

        // Traverse the array and swap elements smaller than pivot
        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;
                swap(array, i, j);
            }
        }

        // Swap the pivot element with the element at i+1
        swap(array, i + 1, high);

        return i + 1;
    }

    public static void main(String[] args){
        int bound = 100000000;
        int size = new Random().nextInt(bound);
        // Create an array with a random length up to 'bound'
        Integer[] unsortedArray = new Integer[size];

        // Fill the array with random integers up to 'bound'
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = new Random().nextInt(bound);
        }

        // Display the unsorted array
        //show(unsortedArray);

        System.out.println("Heap-size: " + size);
        Stopwatch.start();
        // Sort the array using quicksort
        quickSort(unsortedArray);
        Stopwatch.display();

        // Display the sorted array
        // show(unsortedArray);

        // Verify if the array is sorted
        System.out.println(isSorted(unsortedArray));
    }
}
