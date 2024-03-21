import edu.princeton.cs.algs4.*;



public class Main {

    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1 + " " + string2);
    }
}