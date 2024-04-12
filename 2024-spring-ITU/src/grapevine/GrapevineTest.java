/*
package grapevine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrapevineTest {
    static class Person {
        private String name;
        private int skepticism;
        private boolean isConvinced;
        private List<grapevine.Person> adj;
        private boolean marked;

        public Person(String name, int skepticism){
            this.isConvinced = skepticism == 0;
            this.name = name;
            this.skepticism = skepticism;
            adj = new ArrayList<>();
            marked = false;
            hasHeard = false;
        }
        public boolean getHasHeard(){
            return hasHeard;
        }

        public void setHasHeard(){
            hasHeard = true;
        }

        public String getName(){ return name; }

        public int getSkepticism(){
            if(adj.size() >= skepticism)
                isConvinced = true;
            return skepticism;
        }
        public boolean isConvinced(){
            return isConvinced;
        }
        public void addEdge(grapevine.Person person){
            if(!adj.contains(person)){
                adj.add(person);
            }
        }

        @Override
        public String toString(){
            return this.name + " has " + adj.size() + " connections";
        }

        public void display(){
            System.out.println(this.name + " adj:");
            for(grapevine.Person p : adj)
                System.out.println(p);
            System.out.println("--------------------------");
        }
        public void setMarked(){
            this.marked = true;
        }
        public boolean getMarked(){
            return marked;
        }

        public List<grapevine.Person> getAdj(){
            return this.adj;
        }
    }

    static class DepthFirstSearch {
        Graph graph;
        int days;

        public DepthFirstSearch(Graph g, Person start, int days){
            this.days = days;
        }

        public int dfs(Person current, int counter){
            if(counter == days)
                return days;

            current.setMarked();

            for(Person adj : current.getAdj()){

                if(!adj.getMarked()) {
                    counter++;
                    return dfs(adj, counter);
                }
            }


            return -1;
        }

        public void print(){
            for(Person p : graph.getPeople()){
                if(p.getMarked()){
                    System.out.println(p);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n_lines = sc.nextInt(); // names and skepticism
        int m_connections = sc.nextInt(); // a tells b
        int d_days = sc.nextInt(); // days until doom

        Graph g = new Graph();

        for (int i = 0; i < n_lines; i++) {
            g.add(new Person(sc.next(), sc.nextInt()));
        }

        for (int i = 0; i < m_connections; i++) {
            Person p = g.get(sc.next());
            Person q = g.get(sc.next());
            p.addEdge(q);
        }

        Person start = g.get(sc.next());
        DepthFirstSearch dfs = new DepthFirstSearch(g, start, d_days);
        System.out.println(dfs.dfs(start, 0));

    }





}
*/
