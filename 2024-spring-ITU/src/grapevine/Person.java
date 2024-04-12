package grapevine;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int skepticism;
    private boolean isConvinced;
    private boolean marked;
    private int heard;
    List<Person> heardFrom;


    public Person(String name, int skepticism){
        this.isConvinced = skepticism == 0;
        this.heard = 0;
        this.name = name;
        this.skepticism = skepticism;
        adj = new ArrayList<>();
        heardFrom = new ArrayList<>();
        marked = false;
    }

    public String getName(){ return name; }

    public boolean getIsConvinced(){
        return skepticism <= heardFrom.size();
    }
    public void update(Person person){
        heardFrom.add(person);
    }

    public void addEdge(Person person){
        if(!adj.contains(person)){
            adj.add(person);
        }
    }


    public int getSkepticism(){
        return this.skepticism;
    }
    @Override
    public String toString(){
        return this.name + " " + isConvinced;
    }

    public void display(){
        System.out.println(this.name + " adj:");
        for(Person p : adj)
            System.out.println(p);
        System.out.println("--------------------------");
    }
    public void setMarked(){
        this.marked = true;
    }
    public boolean getMarked(){
        return marked;
    }

    public List<Person> getAdj(){
        return this.adj;
    }
}
