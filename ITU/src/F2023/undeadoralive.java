package F2023;

import java.util.Scanner;

class undeadoralive{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().replace("1","").replace("0","").replace(":)","1").replace(":(","0").replace(" ","");

        Boolean undead = false;
        Boolean alive = false;

        char[] inputList = input.toCharArray();

        for(char j : inputList){
            if(j == '0'){
                undead = true;
            } else if(j == '1'){
                alive = true;
            }
        }

        if(undead == true && alive == true){
            System.out.println("double agent");
        } else if(undead == false && alive == true){
            System.out.println("alive");
        } else if(undead == true && alive == false){
            System.out.println("undead");
        } else if(undead == false && alive == false){
            System.out.println("machine");
        }

    }
}
