package HarmonyAndConflict;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private List<Edge> edges;
    private int id;
    public Node(int id){
        this.id = id;
        edges = new ArrayList<>();
    }
    public void addEdge(Edge edge){
        this.edges.add(edge);
    }
}
