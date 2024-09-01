package S2024;

import java.util.Scanner;

public class itu_balance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split("");

        int square = 0;
        int smooth = 0;

        if(input.length % 2 != 0)
            System.out.println(0);
        else
        {
            for(int i = 0; i<input.length-1;i++)
            {
                switch (input[i])
                {
                    case "(":
                        smooth++;
                        System.out.println(smooth);
                    case ")":
                        smooth--;
                    case "]":
                        square++;
                    case "[":
                        square--;
                }
            }
        }

        if(smooth == 0 && square == 0) System.out.println(1);
        else System.out.println(0);
        System.out.println(smooth + " " + square);
    }
}
