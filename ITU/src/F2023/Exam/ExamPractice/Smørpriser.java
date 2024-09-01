package F2023.Exam.ExamPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Smørpriser {

    public static void main(){
        test0();
        test1();
        test2();
        test3();
    }

    static Boolean isReasonablePrice(int price){
        if(price<20){
            return true;
        } else{
            return false;
        }
    }

    static void test0(){
        System.out.println(isReasonablePrice(15));
        System.out.println(isReasonablePrice(22));
    }

    static Boolean isReasonablePrice(int price, int low, int high){
        return price > low && price < high;
    }

    static void test1(){
        System.out.println(isReasonablePrice(8, 9, 25));
        System.out.println(isReasonablePrice(16, 9, 25));
        System.out.println(isReasonablePrice(32, 9, 25));
    }

    static List<Integer> isReasonablePrices(List<Integer> prices, int low, int high){

        List<Integer> ReasonablePrices = new ArrayList<>();

        for(int price : prices){
            if(isReasonablePrice(price, low, high)){
                ReasonablePrices.add(price);
            }
        }

        return ReasonablePrices;
    }

    static void test2(){
        List<Integer> prices = new ArrayList<>();
        prices.add(5);
        prices.add(17);
        prices.add(18);
        prices.add(28);

        List<Integer> newPrices = isReasonablePrices(prices,10,25);

        for(int price : newPrices){
            System.out.println(price);
        }
    }

    static Map<String, Integer> getMap(){
        HashMap<String, Integer> getMap = new HashMap<>();
        getMap.put("Lurpak",15);
        getMap.put("Smørbar", 20);
        getMap.put("Kærgården", 25);

        return getMap;
    }

    static void test3(){
        Map<String, Integer> prices = getMap();

        for(String name : prices.keySet()){
            if(name.equals("Lurpak") || name.equals("Kærgården")){
                System.out.println(prices.get(name));
            }
        }

    }
}
