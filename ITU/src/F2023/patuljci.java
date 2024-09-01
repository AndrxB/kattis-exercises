package F2023;

import java.util.ArrayList;
import java.util.Scanner;

public class patuljci {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            int input = sc.nextInt();
            list.add(input);
        }

        for(int i = 0; i < 8; i++){
            System.out.println(list.get(i));
        }
    }
}
