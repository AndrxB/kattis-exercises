package F2023;

import java.util.*;

public class countthevowels {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] charList = input.toCharArray();

        String output = "";

        for (char j : charList) {
            if ( j == 'a' ||j == 'e'||j == 'i'||j == 'o'||j == 'u'||j == 'A' ||j == 'E'||j == 'I'||j == 'O'||j == 'U'  ) {
                output += j;
            }
        }

        System.out.println(output.length());
    }
}
