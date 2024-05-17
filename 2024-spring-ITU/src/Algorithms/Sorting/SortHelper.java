package Algorithms.Sorting;

import Algorithms.Sorting.SelectionSortRecursive;

public class SortHelper {

    // Returns true if v is less than w
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // Swaps elements at indices i and j in array a
    public static void swap(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // Prints all elements in array a
    public static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
        System.out.println();
    }

    // Returns true if the array a is sorted
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    // Example usage in a main method
    public static void main(String[] args) {
        Integer[] array = {64, 25, 12, 22, 11};

        // Example usage of the utility methods
        System.out.println("Array before sorting:");
        show(array);

        // Assuming a sorting method like selectionSort exists
        // selectionSort(array);

        System.out.println("Array after sorting:");
        SelectionSortRecursive.sort(array);
        show(array);

        System.out.println("Is array sorted? " + isSorted(array));
    }
}
