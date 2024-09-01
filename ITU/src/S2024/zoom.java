package S2024;

import java.util.Scanner;

public class zoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        String[] line = sc.nextLine().split(" ");

        for(int i = 0; i<n;i++){
            if((i+1) % k == 0) System.out.println(line[i]);
        }
    }
}
