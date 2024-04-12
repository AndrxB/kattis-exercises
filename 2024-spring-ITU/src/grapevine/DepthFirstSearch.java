package grapevine;
import java.util.*;

public class DepthFirstSearch {
    int days;

    public DepthFirstSearch(int days){
        this.days = days;
    }

    HashSet<Person> heard = new HashSet<>();

    public HashSet<Person> dfs(Person current){
        //System.out.println(heard);


        current.setMarked();
        //System.out.println(current + " " + counter)

        // Traverse adjacent nodes
        for (Person adj : current.getAdj()) {
            // Check if the current person is skeptical enough to spread the rumor
            if(adj.getIsConvinced()) {
                heard = dfs(adj);
            }
            heard.add(adj);
            adj.update(current); // Update that the current person heard the rumor from 'adj'
        }


        //System.out.println(current + " " + heard);

        return heard;
    }
}