package S2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class itu_ksaldas_changebto01 {
    public static void main (String[] args) throws IOException {
        boolean flip = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        for(char output : input) {
            if(output == 'b') {
                if(flip)
                    System.out.print(1);
                else
                    System.out.print(0);
                flip = !flip;
            } else {
                System.out.print(output);
            }
        }
    }
}
