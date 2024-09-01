package F2023;

import java.util.Scanner;

public class apaxianparent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String inputR = input.replace(" ","1");

        int n = inputR.length();

        String[] inputList = new String[n];

        for(int i = 0; i <= n-1; i++){
            inputList[i] = inputR.substring(i,i+1); // insert into inputList
        }

        for(int i = 0;i <= n-1; i++){
            String currentinput = inputList[i];
            if(currentinput.equals("1")){
                if(inputList[i-1].equals("a")||inputList[i-1].equals("e")||inputList[i-1].equals("i")||inputList[i-1].equals("o")||inputList[i-1].equals("u")){
                    currentinput = currentinput.replace(inputList[i-1],"ex");
                }
            }
        }
    }


}
