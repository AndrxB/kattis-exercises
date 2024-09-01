package F2023;

import java.util.Scanner;
import java.util.*;

class engineeringenglish {
    public static void main(String[] args){
        HashSet<String> dictionary = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String j = sc.next();
            String lowerCaseWord = j.toLowerCase();

            if(dictionary.contains(lowerCaseWord)){
                System.out.print(". ");
            } else{
                System.out.print(j + " ");
                dictionary.add(lowerCaseWord);
            }
        }
    }
}
