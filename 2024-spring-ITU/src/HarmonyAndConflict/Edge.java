package HarmonyAndConflict;

import java.util.List;

public abstract class Edge {
    private Node from;
    private Node to;
    public Edge(Node from, Node to){
        this.from = from;
        this.to = to;
    }
}
