package F2023;

import java.util.*;

public class hradgreining {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String COV = input.replace("COV", "5");
        Boolean COVcheck = true;

        char[] charList = COV.toCharArray();

        for (char j : charList) {
            if ( j == '5' ) {
                COVcheck = true;
                break;
            } else if ( j != '5'){
                COVcheck = false;
            }
        }

        if(COVcheck == true){
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }




    }
}
