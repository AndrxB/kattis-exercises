package Flights;


import java.util.*;

public class Airport {
    TreeMap<Integer, Flight> flights;
    String[] operations;
    public Airport(int m_operations){
        flights = new TreeMap<>();
        operations = new String[m_operations];
    }
    public void addOperation(String operation){
        operations[operations.length == 0 ? 0 : operations.length-1] = operation;
    }
    public String nextDeparture(String departure){
        String nextDeparture = "";

        // Find the next departure after the given time
        int departureTime = time2Seconds(departure);
        Map.Entry<Integer, Flight> entry = flights.higherEntry(departureTime);
        if (entry != null) {
            nextDeparture = entry.getValue().getDeparture().toString();
        } else {
            // If no next departure is found, check if there is a departure at the given time
            Flight flight = flights.get(departureTime);
            if (flight != null) {
                nextDeparture = flight.getDeparture().toString();
            }
        }

        return nextDeparture;
    }


    public void queueOperation(String operation){
        String[] newOperation = operation.split(" ");
        try {
            switch (newOperation[0]){
                case "cancel" -> get(newOperation[1]).cancellation();
                case "delay" -> get(newOperation[1]).getDeparture().delays(Integer.parseInt(newOperation[2]));
                case "reroute" -> get(newOperation[1]).reRoute(newOperation[2]);
                case "destination" -> print(get(newOperation[1]));
                case "next" -> System.out.println(nextDeparture(newOperation[1]));
                case "count" -> System.out.println(countFlights(newOperation[1], newOperation[2]));
            }
        } catch (Exception e){
            System.out.println();
        }
    }

    public void print(Flight flight){
        if(flight.getRoute() == null) return;
        else System.out.println(flight);
    }

    public void addFlight(String departure, Flight flight){
        int departureTime = time2Seconds(departure);
        flights.put(departureTime, flight);
    }

    public Flight get(String HHMMSS){
        for(Flight flight : flights.values()){
            if(flight.getDeparture().toString().equals(HHMMSS))
                return flight;
        }

        return new Flight(null, null);
    }

    public int countFlights(String from, String to){
        int count = 0;
        int departureFrom = time2Seconds(from);
        int departureTo = time2Seconds(to);

        for (int time : flights.keySet()) {
            if (time >= departureFrom && time <= departureTo) {
                Flight flight = flights.get(time);
                if (flight.isActive()) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int time2Seconds(String input) {
        String[] in = input.split(":");
        int inSec = Integer.parseInt(in[2]);
        int inMin = Integer.parseInt(in[1]);
        int inHour = Integer.parseInt(in[0]);
        return inHour * 3600 + inMin * 60 + inSec;
    }
}
