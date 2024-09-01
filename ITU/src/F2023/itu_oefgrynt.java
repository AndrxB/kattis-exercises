package F2023;

import java.util.Scanner;

class itu_oefgrynt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int counter = 0;
        for(int i = 1; i < n+1; i++){
            if(i % 3 == 0 && i % 15 != 0){
                System.out.println("øf");
            } else if(i % 5 == 0 && i % 15 != 0){
                System.out.println("grynt");
            } else if(i % 15 == 0){
                System.out.println("øfgrynt");
            } else {
                System.out.println(counter);
            }
            counter++;
            if(counter == 100){
                counter = 1;
            }
        }
    }
}
