package grapevine;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Grapevine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n_lines = sc.nextInt(); // names and skepticism
        int m_connections = sc.nextInt(); // a tells b
        int d_days = sc.nextInt(); // days until doom

        Graph g = new Graph(n_lines);

        for (int i = 0; i < n_lines; i++) {
            g.people.add(new Person(sc.next(), sc.nextInt()));
        }

        for (int i = 0; i < m_connections; i++) {
            String pn = sc.next();
            String qn = sc.next();
            Person p = g.get(pn);
            Person q = g.get(qn);
            p.addEdge(q);
        }

        Person start = g.get(sc.next());

        DepthFirstSearch dfs = new DepthFirstSearch(d_days);

        int heard = 0;

        int counter = 1;

        while (d_days >= counter){
            heard = dfs.dfs(start).size();
            counter++;
        }


        System.out.println(heard);

    }

    public static class Graph {
        List<Person> people;

        public Graph(int n_people){
            people = new ArrayList<>();
        }

        public Person get(String name){
            for(Person p : people)
                if(name.equals(p.getName()))
                    return p;
            return null;
        }
    }

    public static class Edge{
        private Person from, to;
        public Edge(Person from, Person to){
            this.from = from;
            this.to = to;
        }

        public Person getFrom(){
            return this.from;
        }
        public Person getTo(){
            return this.to;
        }
    }


}