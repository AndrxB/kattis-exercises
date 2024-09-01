package F2023;

import java.util.Scanner;

class ladder{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double h = sc.nextInt(); // højde
        double v = sc.nextInt(); // sinus grader
        double x = (h / Math.sin(v));

        System.out.println(x);
    }
}