package grapevine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grapevine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n_lines = sc.nextInt(); // names and skepticism
        int m_connections = sc.nextInt(); // a tells b
        int d_days = sc.nextInt(); // days until doom

        Graph g = new Graph();

        for (int i = 0; i < n_lines; i++) {
            new Person(sc.next(), sc.nextInt());
        }

        for (int i = 0; i < m_connections; i++) {
            Person p = g.get(sc.next());
            Person q = g.get(sc.next());
            p.addEdge(q);
        }

        Person start = g.get(sc.next());

        DepthFirstSearch dfs = new DepthFirstSearch(d_days);

        System.out.println(dfs.dfs(start, 0));

    }

    public static class Graph {
        Person[] people;
        Edge[] edges;

        public Graph(int n_people, int m_edges){
            people = new Person[n_people];
            edges = new Edge[m_edges];
        }
        public List<Person> getAdj(Person person){
            List<Person> list = new ArrayList<>();

            for (Edge edge : edges)
                if(edge.getFrom().equals("name"))
                    list.add(edge.getTo());

            return list;
        }

        public Person getPerson(){
            for()
                if()
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