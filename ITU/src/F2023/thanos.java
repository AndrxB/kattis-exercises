package F2023;

import java.io.*;
import java.util.*;

class thanos {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int noOfPlanets = Integer.parseInt(bf.readLine());

        for (int i = 0; i < noOfPlanets; i++) {

            List<String> line = Arrays.asList(bf.readLine().split(" "));

            int pop = Integer.parseInt(line.get(0));

            int popGrowth = Integer.parseInt(line.get(1));

            int foodProduction = Integer.parseInt(line.get(2));



            int yearsBeforeDepletion = calculateYearsBeforeDepletion(pop, popGrowth, foodProduction);



            System.out.println(yearsBeforeDepletion);

        }
    }

    private static int calculateYearsBeforeDepletion(int pop, int popGrowth, int foodProduction) {
        int yearsBeforeDepletion = 0;

        while (pop < foodProduction) {

            pop *= popGrowth;

            yearsBeforeDepletion++;

        }

        return yearsBeforeDepletion;
    }
}
