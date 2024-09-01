package F2023;

import java.util.Scanner;

class eyeofsauron {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int n = input.length();
        int left = 0;
        int right = 0;

        int rest = 0;
        for(int i= 0; i<n; i++){
            String currentIn = input.substring(i,i+1);
            if(!currentIn.equals("(")){
                left++;
            } else if (currentIn.equals("(")){
                break;
            }
            rest++;
        }
        rest += 2;

        for(int i = rest; i< n; i++){
            String currentIn = input.substring(i,i+1);
            right++;
        }

        if(left == right){
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }
}
