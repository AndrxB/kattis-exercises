package F2024;

import java.util.Scanner;

/***
 * I wanted to send the whole Shrek script into a discord server,
 * so I made this script to read .txt-file and make bite-sized output
 * in the console of ~2000 chars.
 * On second thought I could've used StringBuilder instead of charArrays
 */
public class charCount {
    public static char limit = 2000; // char limit in disc messages.
    public static void main(String[] args){
        char[] chars = new char[limit];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (sc.hasNext()) {
            String word = sc.next();

            if (count == limit || word.length() + count >= limit) {
                chars = newAndPrint(chars);
                count = 0;
            }


            chars[count] = ' ';
            count++;

            for (int j = 0; j < word.length(); j++) {
                char[] tempCharArr = word.toCharArray();
                chars[count] = tempCharArr[j];
                count++;
            }
        }


        newAndPrint(chars);
    }

    static char[] newAndPrint(char[] chars){
        for(char c : chars){
            System.out.print(c);
        }
        System.out.println();
        System.out.println();

        return new char[limit];
    }
}
