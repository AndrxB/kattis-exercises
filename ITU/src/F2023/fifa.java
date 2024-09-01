package F2023;

import java.util.Scanner;

public class fifa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int year = 2023;

        int yearsSince = a/b;

        year += yearsSince;

        System.out.println(year);
    }
}
