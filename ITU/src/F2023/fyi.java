package F2023;

import java.util.Scanner;

class fyi{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        String prefix = number.substring(0,3);

        if(prefix.equals("555")){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
