package Algorithms.Sorting;


public class SortHelper {

    // Returns true if v is less than w
    public static <T extends Comparable<? super T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    public static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static <T> void show(T[] a) {
        for (T element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<? super T>> boolean isSorted(T[] a) {
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
