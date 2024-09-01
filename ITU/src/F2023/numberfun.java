package F2023;

import java.util.Scanner;

public class numberfun {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            if(test(a,b,c)){
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }

    public static Boolean test(double a, double b, double c){
        boolean addition1 = (a+b == c); // 5+3 = 1; false

        boolean subtraction1 = (a-b == c); // 5-3 = 1; f
        boolean subtraction2 = (b-a == c); // 3-5 = 1; f

        boolean multiplication = (a*b == c); // 5*3 = 1; f

        boolean division1 = (a/b == c); // 5/3 = 1; f
        boolean division2 = (b/a == c); // 3/5 = 1; f


        if(addition1 || subtraction1 || subtraction2 || multiplication|| division1 ||division2){
            return true;
        } else {
            return false;
        }
    }
}
