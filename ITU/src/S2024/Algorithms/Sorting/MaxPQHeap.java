package Algorithms.Sorting;

import java.util.Arrays;

public class MaxPQHeap {
    private Comparable[] heap;
    private int size;

    public MaxPQHeap(int capacity) {
        this.heap = new Comparable[capacity + 1]; // Index 0 is not used
        this.size = 0;
    }

    public void insert(Comparable key) {
        if (size == heap.length - 1) {
            resize(2 * heap.length);
        }
        heap[++size] = key;
        swim(size);
    }

    public Comparable max() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return heap[1];
    }

    public Comparable delMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        Comparable max = heap[1];
        swap(1, size--);
        sink(1);
        heap[size + 1] = null; // Avoid loitering
        if ((size > 0) && (size == (heap.length - 1) / 4)) {
            resize(heap.length / 2);
        }
        return max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void swim(int k) {
        while (k > 1 && less(parent(k), k)) {
            swap(k, parent(k));
            k = parent(k);
        }
    }

    private void sink(int k) {
        while (leftChild(k) <= size) {
            int j = leftChild(k);
            if (j < size && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        return heap[i].compareTo(heap[j]) < 0;
    }

    private void swap(int i, int j) {
        Comparable temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private int parent(int k) {
        return k / 2;
    }

    private int leftChild(int k) {
        return 2 * k;
    }

    private int rightChild(int k) {
        return 2 * k + 1;
    }

    private void resize(int capacity) {
        Comparable[] temp = new Comparable[capacity];
        System.arraycopy(heap, 1, temp, 1, size);
        heap = temp;
    }

    public void show() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxPQHeap pq = new MaxPQHeap(10);

        pq.insert("S");
        pq.insert("Q");
        pq.insert("E");
        pq.insert("K");
        pq.insert("I");
        pq.insert("P");

        pq.show(); // should show elements in the heap

        System.out.println("Max: " + pq.delMax());
        pq.show(); // should show remaining elements in the heap

        System.out.println();
        System.out.println();

        MaxPQHeap pqInt = new MaxPQHeap(10);

        pqInt.insert(1);
        pqInt.insert(2);
        pqInt.insert(7);
        pqInt.insert(4);
        pqInt.insert(10);
        pqInt.insert(6);
        pqInt.insert(-1);


        System.out.println("Max: " + pqInt.delMax());
        pqInt.show();
        System.out.println("Max: " + pqInt.delMax());
        pqInt.show();
        System.out.println("Max: " + pqInt.delMax());
        pqInt.show();
        System.out.println("Max: " + pqInt.delMax());
        pqInt.show();
        System.out.println("Max: " + pqInt.delMax());
        pqInt.show();
        System.out.println("Max: " + pqInt.delMax());
        pqInt.show();
        System.out.println("Max: " + pqInt.delMax());
        pqInt.show();
    }
}
