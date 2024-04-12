/*
package HarmonyAndConflict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DepthFirstSearch {
    private List<Node> nodes;
    private List<Boolean> visited;
    private Stack stack;
    public DepthFirstSearch(){
        nodes = new ArrayList<>();
        visited = new ArrayList<>();

    }

    public void addEdge(Node from, Node to, int type){
        if(type == 1){
            to.addEdge(new ConflictEdge(from, to));
        } else {
            to.addEdge(new HarmonyEdge(from, to));
        }
    }
    public int getSize(){
        return id.length;
    }

    public Node getNode(){

    }
    public boolean isConnected(Node from, Node to){
        return false;
    }
}
*/
