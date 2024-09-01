package F2023;

import java.util.Scanner;

class ofugsnuid{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] sorted = new int[n];

        for(int i = n-1; i >= 0; i--){
            sorted[i] = sc.nextInt();
        }

        for(int j : sorted){
            System.out.println(j);
        }
    }
}
