package F2023;

import java.util.Scanner;
import java.util.ArrayList;

class findingana {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int inputL = input.length();

        String letter;

        ArrayList<String> word = new ArrayList<>();

        for(int i = 0; i<inputL;i++){

            letter = input.substring(i,i+1);

            word.add(letter);
        }

        int i = 0;
        for(String j : word){
            if(j.equals("a")){
                System.out.println(input.substring(i));
                break;
            }
            i++;
        }

    }
}
