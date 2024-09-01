package F2023;

import java.util.*;
import java.io.*;

public class apaxiaaans{
    public static void main(String[] arg) throws IOException {
        ArrayList<String> nameSpace = new ArrayList<>();
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));

        String input = sb.readLine();

        String a = input.substring(0,1);
        nameSpace.add(a);

        String b = input.substring(1);

        for(int i = 0; i < b.length(); i++){
            String currentL = b.substring(i,i+1);

            if(!currentL.equals(nameSpace.get(nameSpace.size()-1))){
                nameSpace.add(currentL);
            }
        }

        for(String j:nameSpace){
            System.out.print(j);
        }

    }
}
