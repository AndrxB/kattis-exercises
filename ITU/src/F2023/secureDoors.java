package F2023;

import java.util.Scanner;
import java.util.*;

public class secureDoors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> house = new HashMap<>();

        for(int i = 0; i<sc.nextInt();i++){
            String[] words = sc.nextLine().split(" ");
            int current = 0;
            String key = words[1];

            String value = words[0];


            if(value.matches("[a-z]{5}")){
                value = "entered";
            } else if(value.matches("[a-z]{4}")){
                value = "exited";
            }

            String word = key + value;

            int preast = house.getOrDefault(key, 0);

            if(1 == 1){

            }


            // to HashSet


        }

    }
}
