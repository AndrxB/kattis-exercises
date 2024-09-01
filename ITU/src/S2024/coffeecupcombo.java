package S2024;

import java.util.*;

public class coffeecupcombo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] line = sc.nextLine().split("");
        int coffees = 0;
        int attended_lectures = 0;

        for(int i = 0; i<n; i++)
        {
            if(line[i].equals("0") && coffees > 0) {
                attended_lectures++;
                coffees--;

            } else if(line[i].equals("1")){
                if(coffees < 2 && coffees >= 0)
                    coffees = 2;

                attended_lectures++;
            }
        }
        System.out.println(attended_lectures);
    }
}
