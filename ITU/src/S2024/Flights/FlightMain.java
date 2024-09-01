package S2024.Flights;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

import static Flights.Airport.*;

public class FlightMain {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out); // Auto-flush disabled
        for (String e : solve(br)) {
            pw.println(e);
        }
        pw.flush();
        pw.close();
        br.close();
    }

    public static String[] solve(BufferedReader br) throws IOException {
        String[] startInfo = br.readLine().split("\\s+");
        int numberOfFlights = Integer.parseInt(startInfo[0]);
        int numberOfOperations = Integer.parseInt(startInfo[1]);


        for (int i = 0; i < numberOfFlights; i++) {
            String[] input = br.readLine().split("\\s+");
            Flights.Airport.flights.put(timeConvert(input[0]), input[1]);
        }

        List<String> output = new ArrayList<>(numberOfOperations); // Initialize with expected size
        for (int i = 0; i < numberOfOperations; i++) {
            String[] operation = br.readLine().split("\\s+");



            switch (operation[0]) {
                case "cancel"-> Flights.Airport.cancel(operation[1]);
                case "destination"-> output.add(destination(operation[1]));
                case "delay"-> delay(operation[1], operation[2]);
                case "reroute"-> reroute(operation[1], operation[2]);
                case "next"-> output.add(next(operation[1]));
                case "count"-> output.add(count(operation[1], operation[2]));

            }
        }

        return output.toArray(new String[0]);
    }


}