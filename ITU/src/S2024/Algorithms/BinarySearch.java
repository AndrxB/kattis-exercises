package Algorithms;

import java.util.Arrays;

/**
 * BINARY SEARCH
 * Given a sorted array and a key, find index of the key in the array
 */
public class BinarySearch {
    public static int search(int [] sortedArray, int key){
        return search(sortedArray, key, 0, sortedArray.length-1);
    }

    private static int search(int [] sortedArray, int target, int low, int high) {
        if(low > high)
            return -1; // base case: target not found

        int mid = (high+low)/2; // this will floor due to java

        if(sortedArray[mid] == target){
            return mid; // Base case: target found
        } else if(sortedArray[mid] < target){
            return search(sortedArray, target, mid+1, high);
        } else {
            return search(sortedArray, target, low, mid-1);
        }
    }


    public static void main(String[] args) {
        int[] sortedArray1 = new int[]{1,2,3,4,10};
        int[] sortedArray2 = new int[]{0,45,100,600,1000};

        System.out.println("Task:" +
                "BINARY SEARCH\n" +
                "Given a sorted array and a key, find index of the key in the array");
        System.out.println();
        System.out.println(Arrays.toString(sortedArray1));
        System.out.println("searching for 10: " + search(sortedArray1, 10)); // expected 4
        System.out.println("searching for 3: " + search(sortedArray1, 3)); // expected 2
        System.out.println("searching for -1: " + search(sortedArray1, -1)); // expected -1
        System.out.println("------------------------");

        System.out.println(Arrays.toString(sortedArray2));
        System.out.println("searching for 600: " + search(sortedArray2, 600)); // expected 3
        System.out.println("searching for 1000: " + search(sortedArray2, 1000)); // expected 4
        System.out.println("searching for -1: " + search(sortedArray2, -1)); // expected -1
        System.out.println("------------------------");

    }
}
