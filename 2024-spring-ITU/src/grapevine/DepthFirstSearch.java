package grapevine;
import java.util.*;

public class DepthFirstSearch {
    static class Graph {
        List<Person> people;
        public Graph(){
            people = new ArrayList<>();
        }
        public Person get(String name){
            for(Person p : people)
                if(name.equals(p.getName()))
                    return p;
            return null;
        }
    }
    int days;
    Graph g;
    public DepthFirstSearch(int d_days){
        this.days = d_days;
        this.g = new Graph();
    }

    /*public int dfs(Person start){
        Set<Person> heard = new HashSet<>();
        Stack<Person> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            Person current = stack.pop();
            if (!current.getIsConvinced()) {
                heard.add(current);
                current.update(null); // Assuming rumor spreads instantly once heard
                for (Person adj : current.getAdj()) {
                    if (!heard.contains(adj)) {
                        stack.push(adj);
                    }
                }
            }
        }

        // Exclude the starting person from the count
        heard.remove(start);

        return heard.size();
    }*/

    public int dfs(Person start){
        Set<Person> heard = new HashSet<>();
        Stack<Person> stack = new Stack<>();
        stack.push(start);
        int counter = 1;


        while (!stack.isEmpty() && counter <= days) {
            Person current = stack.pop();
            for (Person adj : current.getAdj()) {
                System.out.println(adj);
                if (current.getIsConvinced()) {
                    stack.push(adj);
                    heard.add(adj);
                    adj.update(current);
                }
            }
            counter++;
        }
        System.out.println(heard);
        return heard.size();
    }
}