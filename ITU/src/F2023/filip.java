package F2023;

import java.util.*;

public class filip
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = reverse(sc.nextInt());
        int b = reverse(sc.nextInt());

        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);


    }

    public static int reverse(int a)
    {
        String[] list = Integer.toString(a).split("");
        String s = "";

        for(int i = list.length-1; i>-1; i--)
            s = s + list[i];




        return Integer.parseInt(s);
    }
}
