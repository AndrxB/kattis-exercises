package F2023;

import java.util.Scanner;

public class leggjasaman {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
