package F2023.Exam.Exam1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lotteri {
    public static void main(){
        test0();
        test1();
        test2();
        test3();
        test4();
    }

    public static boolean calculate(int number){
        return number == 10;
    }

    public static void test0(){
        System.out.println(calculate(10));
        System.out.println(calculate(5));
    }

    public static boolean calculate(int number, int winner, int joker){
        return number == winner || number == joker;
    }

    public static void test1(){
        System.out.println(calculate(4,8,16));
        System.out.println(calculate(8,8,16));
        System.out.println(calculate(16,8,16));
    }

    static int getWinnerAmount(List<Integer> numbers, int winner, int joker){
        int winners = 0;

        for(int number : numbers){
            if(calculate(number, winner, joker)){
                winners += 1;
            }
        }

        return winners;
    }

    static void test2(){
        List<Integer> contestants = new ArrayList<>();
        contestants.add(10);
        contestants.add(5);
        contestants.add(60);
        contestants.add(7);
        contestants.add(25);
        contestants.add(10);

        System.out.println(getWinnerAmount(contestants, 10, 25));
    }

    static Map<String, Integer> getMap(){
        HashMap<String, Integer> getMap = new HashMap<>();
        getMap.put("Sebastian", 5);
        getMap.put("Claus", 10);

        return getMap;
    }

    static void test3(){
        for(String key : getMap().keySet()){
            System.out.print(getMap().get(key) + " ");
        }
    }

    static void print(Map<String, Integer> contestants, int winner, int joker){
        List<String> results = new ArrayList<>();

        for(String j : contestants.keySet()){
            if(calculate(contestants.get(j), winner, joker)){
                results.add(j + " vandt! :DDD");
            } else {
                results.add(j + " tabte. :(");
            }
        }

        for(String result : results){
            System.out.println(result);
        }
    }

    static void test4(){
        print(getMap(), 2, 5);
    }


}
