package F2023;

import java.util.Scanner;

class fizzbuzz {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 2
        int y = sc.nextInt(); // 3
        int n = sc.nextInt()+1; // 7

        for(int i = 1; i<n;i++){
            if(i % x == 0 && i % y == 0){
                System.out.println("FizzBuzz");
            } else if(i % x == 0){
                System.out.println("Fizz");
            } else if(i % y == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
