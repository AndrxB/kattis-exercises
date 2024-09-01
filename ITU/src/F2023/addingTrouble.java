package F2023;

import java.util.Scanner;

public class addingTrouble {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b == c) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }

    }
}