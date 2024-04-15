package grapevine;
import java.util.*;

public class Grapevine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n_lines = sc.nextInt(); // names and skepticism
        int m_connections = sc.nextInt(); // a tells b
        int d_days = sc.nextInt(); // days until doom
        if(n_lines == 0 || m_connections == 0) {
            System.out.println(0);
            return;
        }
        DepthFirstSearch dfs = new DepthFirstSearch(d_days);
        for (int i = 0; i < n_lines; i++) {
            dfs.g.people.add(new Person(sc.next(), sc.nextInt()));
        }
        for (int i = 0; i < m_connections; i++) {
            Person p = dfs.g.get(sc.next());
            Person q = dfs.g.get(sc.next());
            p.addEdge(q);
        }
        int heard = dfs.dfs(dfs.g.get(sc.next()));
        System.out.println(heard);
    }
}