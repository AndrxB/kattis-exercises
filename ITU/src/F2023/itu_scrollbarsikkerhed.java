package F2023;

import java.io.*;
import java.util.Scanner;

public class itu_scrollbarsikkerhed {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int current = 0;

        while(sc.hasNext()){
            String ind = sc.nextLine();

            if(ind.equals("Gæst ind")){
                current++;
            } else if(ind.equals("Gæst ud")){
                if(current == 0){
                    max++;
                } else if(current > 0){
                    current--;
                }
            }

            if(current > max){
                max = current;
            }

            if(ind.equals("c")){
                break;
            }
        }
        System.out.println(max);
    }
}
