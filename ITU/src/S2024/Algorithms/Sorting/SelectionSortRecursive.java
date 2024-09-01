package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSortRecursive {

    /*
     * 1) Find the smallest item in the array.
     * 2) Find the next-smallest item and exchange it with the second entry.
     */

    // Public method to initiate the sorting process
    public static void sort(Integer[] unsortedArray){
        sort(unsortedArray, 0);
    }

    // Private recursive method to sort the array
    private static void sort(Integer[] array, Integer start){
        if(start < array.length-1){
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = findMinIndex(array, start, start+1);
            // Swap the minimum element with the element at the current start index
            SortHelper.swap(array, start, minIndex);
            // Recursively call sort with the next index to continue sorting
            sort(array, start+1);
        }
    }

    // Method to find the index of the minimum element in a subarray
    private static Integer findMinIndex(Integer[] array, int minIndex, int currentIndex){
        if(currentIndex >= array.length)
            return minIndex;

        // Update the minIndex if the current element is smaller
        if (array[currentIndex] < array[minIndex])
            minIndex = currentIndex;

        // Recursively call findMinIndex with the next index
        return findMinIndex(array, minIndex, currentIndex+1);
    }


    // Main method for example usage
    public static void main(String[] args){
        // Example array to be sorted
        Integer[] unsortedArray1 = new Integer[]{1,7,56,3,10};
        // Sort the array using selection sort
        sort(unsortedArray1);
        // Print the sorted array
        System.out.println(Arrays.toString(unsortedArray1));
    }
}
