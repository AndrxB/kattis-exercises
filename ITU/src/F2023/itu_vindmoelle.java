package F2023;

import java.util.Scanner;

public class itu_vindmoelle{
    public static void main(String[] arg){
        // 2 tal - mindst 0 og højst 359
        Scanner sc = new Scanner(System.in);

        int current = sc.nextInt(); //input 270
        int mål = sc.nextInt(); //hvor vil man hen til 180
        int rotation = ((360 - current) + mål)%360;

        if(rotation > 180){
            rotation = rotation-360;
            System.out.println(rotation);
        } else {
            System.out.println(rotation);
        }
    }
}

