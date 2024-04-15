package Flights;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class Departure {
    int sec, min, hour;
    public Departure(String HHMMSS){
        String[] j = HHMMSS.split(":");
        hour = Integer.parseInt(j[0]);
        min = Integer.parseInt(j[1]);
        sec = Integer.parseInt(j[2]);
    }

    public void delays(int seconds){
        sec += seconds;

        int extraMinutes = sec / 60;
        sec %= 60;

        int extraHours = (min + extraMinutes) / 60;
        min = (min + extraMinutes) % 60;

        hour = (hour + extraHours) % 24;
    }


    private String set(int s){
        return (s < 10 ? "0" : "") + s;
    }

    public boolean compare(String compare, int operator){
        String[] in = compare.split(":");
        int inSec = Integer.parseInt(in[2]);
        int inMin = Integer.parseInt(in[1]);
        int inHour = Integer.parseInt(in[0]);

        int depTotalSeconds = time2Seconds();
        int compTotalSeconds = time2Seconds(compare);

        // dep is this, comp is input
        return operator == 1 ? depTotalSeconds > compTotalSeconds : depTotalSeconds < compTotalSeconds;
    }

    public int time2Seconds(){
        return hour * 3600 + min * 60 + sec;
    }
    public static int time2Seconds(String input){
        String[] in = input.split(":");
        int inSec = Integer.parseInt(in[2]);
        int inMin = Integer.parseInt(in[1]);
        int inHour = Integer.parseInt(in[0]);
        return inHour * 3600 + inMin * 60 + inSec;
    }

    @Override
    public String toString(){

        return set(hour) + ":" + set(min) + ":" + set(sec);
    }
}
