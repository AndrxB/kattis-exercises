package Flights;


import java.util.Scanner;

public class FlightsMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n_flight = sc.nextInt();
        int m_operations = sc.nextInt();
        Airport airport = new Airport(m_operations);
        sc.nextLine();

        for (int i = 0; i<n_flight; i++) {
            String HHMMSS= sc.next();
            String route = sc.next();
            airport.addFlight(HHMMSS, new Flight(HHMMSS, route));
            sc.nextLine();
        }
        for (int i = 0; i<m_operations; i++){
            String operation = sc.nextLine();
            airport.queueOperation(operation);
        }

    }

}
