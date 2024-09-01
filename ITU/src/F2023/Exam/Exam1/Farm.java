package F2023.Exam.Exam1;

import java.util.List;
import java.util.ArrayList;

public class Farm{
    private String name;
    private List<Pig> pigs;

    Farm(String name){
        this.name = name;
        this.pigs = new ArrayList<>();
    }

    public void add(Pig p){
        pigs.add(p);
    }

    public void grow(){
        for(Pig p : pigs){
            p.grow();
        }
    }

    public void display(){
        System.out.println("'" + name + "' indeholder");
        for(Pig p : pigs){
            System.out.println(p.toString());
        }
    }

    public Pig largest(){
        double largest = 0;
        Pig largestPig = null;

        for(Pig p : pigs){
            if(p.getWeight() > largest){
                largest = p.getWeight();
                largestPig = p;
            }
        }

        return largestPig;
    }

    public void display(String name){
        for(Pig p : pigs){
            if(p.getName().equalsIgnoreCase(name)){
                System.out.println(p.toString());
            }
        }
    }
}
