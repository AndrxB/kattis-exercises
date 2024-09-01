package Algorithms;

public class Stopwatch {
    private static long start;

    public static void start(){
        start = System.currentTimeMillis();
        System.out.println("Stopwatch starting");
    }

    public static void display(){
        int runtime = (int) (System.currentTimeMillis() - start)/1000;

        System.out.println(runtime + " ms");
    }
}
