package F2023;

import java.util.*;

class vidsnuningur{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] sInput = input.split("");


        for(int i = sInput.length; i > 0; i--){
            System.out.print(sInput[i-1]);
        }
    }
}
