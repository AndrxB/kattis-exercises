package F2023;

import java.util.Scanner;
import java.util.ArrayList;

public class skruop {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();


        int currentVolume = 7;

        ArrayList<String> requests = new ArrayList<>();

        for(int i = 0; i < n; i++){
            requests.add(sc.nextLine());
        }

        for(String request : requests){
            if(request.equals("Skru op!")){
                if(currentVolume < 10){
                    currentVolume += 1;
                }
            } else if (request.equals("Skru ned!")){
                if(currentVolume > 0){
                    currentVolume -= 1;
                }
            }
        }
        System.out.println(currentVolume);
    }
}

