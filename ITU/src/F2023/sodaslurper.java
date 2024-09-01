package F2023;

import java.util.*;

public class sodaslurper{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // antal i possesion: 9

        int b = sc.nextInt(); // antal fundet: 0

        int c = sc.nextInt(); // pris: 3

        int n = a+b/c; // flasker rn

        double rest;

        int result = 0;


        for(int i = 0; i > n; i++){
            rest = n%c; // rest

            result += n;
        }

        System.out.println(result);
    }

}
