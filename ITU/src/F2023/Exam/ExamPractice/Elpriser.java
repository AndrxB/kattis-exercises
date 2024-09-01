package F2023.Exam.ExamPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Elpriser {

    public static void main(){
        test0();
        test1();
        test2();
        test3();
    }

    public static Boolean exceedingBudget(double price){
        if(price > 4.1){
            return true;
        } else {
            return false;
        }
    }

    public static void test0(){
        System.out.println(exceedingBudget(3.1));
        System.out.println(exceedingBudget(4.8));
    }

    public static Boolean exceedingBudget(double price, double max){
        if(price > max){
            return true;
        } else {
            return false;
        }
    }

    public static void test1(){
        double max = 4.5;

        System.out.println(exceedingBudget(1.5, max));
        System.out.println(exceedingBudget(2.6, max));
        System.out.println(exceedingBudget(5.8, max));
    }

    public static double bestPrice(List<Double> prices){
        double cheapestPrice = 1000;
        for(double price : prices){
            if(price < cheapestPrice){
                cheapestPrice = price;
            }
        }

        return cheapestPrice;
    }

    public static void test2(){
        List<Double> prices = new ArrayList<>();
        prices.add(3.2);
        prices.add(1.2);
        prices.add(1.2);
        prices.add(0.9);
        prices.add(5.4);

        System.out.println(bestPrice(prices));
    }

    public static Map<Integer, Double> getMap(){
        Map<Integer, Double> priser = new HashMap<>();
        priser.put(12, 1.2);
        priser.put(13, 1.1);
        priser.put(14, 1.3);
        priser.put(15, 1.5);
        priser.put(16, 1.9);

        return priser;
    }

    public static void test3(){
        Map<Integer, Double> priser = getMap();

        for(int tid : getMap().keySet()){
            double pris = priser.get(tid);
            if(pris == 1.3 || pris == 1.5){
                System.out.println(pris);
            }
        }
    }

}
