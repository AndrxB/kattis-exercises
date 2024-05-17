package Algorithms.Sorting;

import java.util.Random;

import static Algorithms.Sorting.SortHelper.show;

public class QuickSort {

    public static void quickSort(Integer[] unsortedArray){
        
    }

    public static void quickSort(Integer[] array, int partition){

    }





    public static void main(String[] args){
        int bound = 100;
        // Create an array with a random length up to 'bound'
        Integer[] unsortedArray = new Integer[new Random().nextInt(bound)];

        // Fill the array with random integers up to 'bound'
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = new Random().nextInt(bound);
        }

        // Display the unsorted array
        show(unsortedArray);

        quickSort(unsortedArray);
    }
}
