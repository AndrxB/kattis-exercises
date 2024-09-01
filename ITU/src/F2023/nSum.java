package F2023;

import java.util.Scanner;

public class nSum {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += sc.nextInt();
        }

        System.out.println(sum);
    }
}
