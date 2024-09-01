package Algorithms.Sorting;

import java.util.Random;

import static Algorithms.Sorting.SortHelper.isSorted;
import static Algorithms.Sorting.SortHelper.show;

/**
 * The MergeSort class provides static methods for sorting an array
 * of integers using the merge sort algorithm.
 */
public class MergeSort {

    /**
     * Sorts the given array using the merge sort algorithm.
     *
     * @param unsortedArray the array to be sorted
     */
    public static void mergeSort(Integer[] unsortedArray) {
        mergeSort(unsortedArray, unsortedArray.length);
    }

    /**
     * Recursively splits and sorts the array.
     *
     * @param array the array to be sorted
     * @param n the length of the array
     */
    private static void mergeSort(Integer[] array, int n) {
        // Base case: if the array has less than 2 elements, it is already sorted
        if (n < 2)
            return;

        // Find the midpoint of the array
        int mid = n / 2;

        // Create left and right subarrays
        Integer[] l = new Integer[mid];
        Integer[] r = new Integer[n - mid];

        // Copy the first half of the array into the left subarray
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        // Copy the second half of the array into the right subarray
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        // Recursively sort the left and right subarrays
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        // Merge the sorted subarrays
        merge(array, l, r, mid, n - mid);
    }

    /**
     * Merges two sorted subarrays into a single sorted array.
     *
     * @param array the original array to be sorted
     * @param l the left sorted subarray
     * @param r the right sorted subarray
     * @param left the length of the left subarray
     * @param right the length of the right subarray
     */
    private static void merge(Integer[] array, Integer[] l, Integer[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        // Merge elements from l and r into array in sorted order
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }
        // Copy any remaining elements from l into array
        while (i < left) {
            array[k++] = l[i++];
        }
        // Copy any remaining elements from r into array
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    /**
     * The main method generates a random array, sorts it using merge sort,
     * and prints the results.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int bound = 100;
        // Create an array with a random length up to 'bound'
        Integer[] unsortedArray = new Integer[new Random().nextInt(bound)];

        // Fill the array with random integers up to 'bound'
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = new Random().nextInt(bound);
        }

        // Display the unsorted array
        show(unsortedArray);
        // Sort the array using merge sort
        mergeSort(unsortedArray);
        // Display the sorted array
        show(unsortedArray);
        // Check and print if the array is sorted
        System.out.println(isSorted(unsortedArray));
    }
}
