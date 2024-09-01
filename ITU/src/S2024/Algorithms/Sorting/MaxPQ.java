package Algorithms.Sorting;


import java.util.ArrayList;
import java.util.List;

public class MaxPQ {
    private List<Comparable> array;
    private boolean isSorted;
    public MaxPQ(){
        this.array = new ArrayList<>();
        isSorted = false;
    }



    private void sort(){





        isSorted = true;
    }

    private void isSorted(){
        if(!isSorted) sort();
    }

    public Comparable max(){
        isSorted();
        return array.get(0);
    }

    public void delMax(){

    }

    private void sink(){

    }

    private void swim(){

    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

    public int size(){
        return array.size();
    }


    public static void main(String[] args){

    }
}
