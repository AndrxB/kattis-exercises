package F2023;

import java.util.Scanner;
import java.util.ArrayList;

class guess {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        Boolean even = (number % 2 == 0);

        int[] list = new int[500];
        int n = 0;

        if(even){
            for(int i = 0; i < 1000; i++){
                if(i%2 == 0){
                    list[n]=i;
                    n++;
                }
            }
        } else {
            for(int i = 0; i < 1000; i++){
                if(i%2 == 1){
                    list[n]=i;
                    n++;
                }
            }
        }

        for(int j : list){
            if(j == number){
                System.out.println("correct");
            }
        }
    }
}
