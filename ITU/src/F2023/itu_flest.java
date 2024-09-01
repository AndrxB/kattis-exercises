package F2023;

import java.util.*;
import java.io.*;

public class itu_flest {
    public static void main(String[] args) throws IOException{
        Map<Integer, String> lineWinners = new HashMap<>();
        Map<String, Integer> score = new HashMap<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // split the string by space
        String[] coffees = bf.readLine().split(" ");

        int n = Integer.parseInt(bf.readLine()); // ignore this

        // convert array to the List using asList method
        List<String> coffeeList = Arrays.asList(coffees);

        // create HashSet from the List using constructor
        HashSet<String> coffeesH = new HashSet<String>(coffeeList);
        Map<String, Integer> coffeeMenu = new HashMap<>();

        for(int i = 0; i<n; i++){
            String[] words = bf.readLine().toLowerCase().replace("?","").replace("!", "").replace(".", "").replace(",", "").split(" ");
            int result = 0;
            String winner = "";

            for(String word : words){
                if(coffeesH.contains(word)){
                    coffeeMenu.put(word, coffeeMenu.getOrDefault(word, 0)+1);
                    int currentScore = coffeeMenu.get(word);
                    if(currentScore > result){
                        result = currentScore;
                        winner = word;
                    }
                }
            }
            lineWinners.put(i, winner);
            coffeeMenu.clear();
        }

        for(String coffee : coffeesH){
            score.put(coffee, 0);
        }

        for(int line : lineWinners.keySet()){
            String winner = lineWinners.get(line);

            score.put(winner, score.getOrDefault(winner, 0)+1);

        }

        print(score);
    }

    public static void print(Map<String, Integer> score){
        ArrayList<String> winners = new ArrayList<>();
        int max = 0;

        for(String j : score.keySet()){
            if(score.get(j) > max){
                max = score.get(j);
            }
        }

        for(String j : score.keySet()){
            if(score.get(j) == max){
                winners.add(j);
            }
        }

        Collections.sort(winners);
        for(String j : winners){
            System.out.println(j);
        }
    }
}
