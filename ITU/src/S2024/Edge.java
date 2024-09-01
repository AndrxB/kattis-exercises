package S2024;

import org.w3c.dom.Node;

import java.util.List;

public class Edge {
    private Node from;
    private Node to;
    private int conflictType;
    public Edge(int from, int to, int conflictType){

        this.conflictType = conflictType;
    }
    public Node getFrom(){
        return from;
    }
    public Node getTo(){
        return to;
    }
    public int getConflictType(){
        return conflictType;
    }
}
