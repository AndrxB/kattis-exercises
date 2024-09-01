package Flights;

import java.time.LocalTime;
import java.util.*;


public class Airport {
    public static TreeMap<Integer, String> flights = new TreeMap<>();
    public static Map<String, Integer> input2Seconds = new HashMap<>();
    public static void cancel(String time){
        flights.remove(timeConvert(time));
    }

    public static int timeConvert(String str) {
        if (!input2Seconds.containsKey(str)) {
            input2Seconds.put(str, LocalTime.parse(str).toSecondOfDay());
        }
        return input2Seconds.get(str);
    }
    public static void delay(String str, String delay) {
        int originalTime = timeConvert(str);
        String flight = Airport.flights.remove(originalTime);
        if (flight != null) {
            Airport.flights.put(originalTime + Integer.parseInt(delay), flight);
        }
    }

    public static String count(String time1, String time2) {
        return String.valueOf(Airport.flights.subMap(timeConvert(time1), true, timeConvert(time2), true).keySet().size());
    }

    public static void reroute(String time, String location) {
        Airport.flights.put(timeConvert(time), location);
    }

    public static String destination(String str) {
        String output = Airport.flights.get(timeConvert(str));
        return output == null ? "-" : output;
    }

    public static String next(String time) {
        Integer value = Airport.flights.ceilingKey(timeConvert(time));
        return value == null ? "-" : formatSecondsToHMS(value) + " " + Airport.flights.get(value);
    }

    public static String formatSecondsToHMS(long totalSeconds) {
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
