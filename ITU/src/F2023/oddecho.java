package F2023;

import java.util.Scanner;

class oddecho {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            String word = sc.next();
            words[i] = word;
        }
        int i = 0;
        for(String word : words){
            if(i%2 == 0){
                System.out.println(word);
            }
            i++;
        }

    }
}
