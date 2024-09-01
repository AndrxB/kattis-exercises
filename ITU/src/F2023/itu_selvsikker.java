package F2023;

import java.util.Scanner;

public class itu_selvsikker{
    static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String to = sc.next();
        to = to.toLowerCase();

        String etraw = sc.next();
        String etsplit = etraw.substring(0,1);
        String etrest = etraw.substring(1);
        String etupper = etsplit.toUpperCase();

        String et = etupper + etrest;

        String restraw = sc.nextLine();
        String rest = restraw.replace("?", "!");

        System.out.print(et + " " + to + rest);
    }
}
