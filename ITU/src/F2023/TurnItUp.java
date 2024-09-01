package F2023;

import java.util.Scanner;

public class TurnItUp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for(int i=0; i<n; i++){
            String m = sc.nextLine();

            if(m.equals("Skru op!")){
                System.out.println(8);
            } else if(m.equals("Skru ned!")){
                System.out.println(6);
            }
        }
    }
}
