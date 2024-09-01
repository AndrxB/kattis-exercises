package F2023;

import java.util.*;


public class oddities {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        List<Integer> list = new ArrayList<>();

        for(i = 0; i < n; i++) {
            int OoE = sc.nextInt();
            list.add(OoE);
        }
        for(int j : list) {
            if(j % 2 == 0){
                System.out.println(j + " is even");
            } else {
                System.out.println(j + " is odd");
            }
        }
    }
}
