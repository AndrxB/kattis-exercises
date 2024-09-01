package F2023;

import java.util.Scanner;

public class cprnummer {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().replace("-",""); //070761-4285
        int[] keys = new int[10];

        int yield = 0;

        for(int i = 0; i<10;i++){
            keys[i] = Integer.parseInt(n.substring(i,i+1));
        }

        int[] values = new int[10];
        values[0] = 4;
        values[1] = 3;
        values[2] = 2;
        values[3] = 7;
        values[4] = 6;
        values[5] = 5;
        values[6] = 4;
        values[7] = 3;
        values[8] = 2;
        values[9] = 1;

        int i = 0;

        for(int key : keys){
            yield += key * values[i];
            i++;
        }

        if((yield % 11) == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }




    }
}
