package F2023;

import java.util.*;

class itu_huskeseddel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] inputList = new String[4];
        int o = 0;

        String n = sc.nextLine();

        n = n.substring(0,3) + Integer.toString(Integer.parseInt(n.substring(3, 4))+1);

        Boolean addOne = false;

        for(int i = 3; i >= 0; i--){
            if(i == 3){
                inputList[o] = n.substring(i);
            } else{
                inputList[o] = n.substring(i, i+1);
            }
            o++;
        }

        for(String j : inputList){
            int jI = Integer.parseInt(j);
            if(addOne){
                jI += 1;
            }
            if(jI == 10){
                jI = 0;
                addOne = true;
                System.out.print(jI);
                continue;
            }

            System.out.print(jI);
            addOne = false;

        }

    }
}
