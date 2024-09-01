package F2023;

import java.util.Scanner;

class greetings2{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String inputR = input.replace("h","").replace("y","");
        int count = inputR.length();
        int greetingCount = count*2;

        String[] counter = new String[greetingCount];

        for(int i = 0; i < greetingCount; i++){
            counter[i] = "e";
        }
        System.out.print("h");
        for(String j : counter){
            System.out.print(j);
        }
        System.out.print("y");
    }
}
