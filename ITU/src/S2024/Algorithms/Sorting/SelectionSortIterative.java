package Algorithms.Sorting;

import static Algorithms.Sorting.SortHelper.*;

/**
 * not working
 */
public class SelectionSortIterative {

    /*
     * 1) Find the smallest item in the array.
     * 2) Find the next-smallest item and exchange it with the second entry.
     */

    public static void sort(Integer[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(less(array[j], min))
                    min = array[j];
            }

            if(array[i] <= array[min]){
                swap(array, i, min);
            }
        }


    }



    public static void main(String[] args){
        Integer[] array = new Integer[]{0,5,4,8,2};
        System.out.println("Before sort:");
        show(array);
        System.out.println();

        System.out.println("After sort");
        sort(array);
        show(array);
    }
}
