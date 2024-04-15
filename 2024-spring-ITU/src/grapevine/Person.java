package grapevine;


import java.util.*;

public class Person {
    private final String name;
    private final int skepticism;
    private boolean marked;
    Set<Person> heardFrom;
    List<Person> adj;


    public Person(String name, int skepticism){
        this.name = name;
        this.skepticism = skepticism;
        adj = new ArrayList<>();
        heardFrom = new HashSet<>();
    }

    public String getName(){ return name; }

    public boolean getIsConvinced(){
        return heardFrom.size() >= skepticism;
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
        return this.name + " " + getIsConvinced();
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
