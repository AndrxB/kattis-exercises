package F2023;

import java.util.Scanner;

public class nastyhacks {
    //r, is the expected revenue if you do not advertise
    //e, is the expected revenue if you do advertise
    //c, is the cost of advertising

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r;
        int e;
        int c;

        for(int i = 0; i < n; i++){
            r = sc.nextInt();
            e = sc.nextInt();
            c = sc.nextInt();
            if(r < (e-c)){
                System.out.print("advertise");
            } else if(r > (e-c)){
                System.out.print("do not advertise");
            } else {
                System.out.print("does not matter");
            }
        }
    }
}
