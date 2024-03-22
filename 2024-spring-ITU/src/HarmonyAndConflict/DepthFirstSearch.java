package HarmonyAndConflict;

import java.util.Arrays;


public class DepthFirstSearch {
    private Edge[] id;
    private boolean[] visited;
    private Stack stack;
    public DepthFirstSearch(int amountOfVertices){
        id = new Edge[amountOfVertices];
        visited = new boolean[amountOfVertices];
        Arrays.fill(visited, false);
    }

    public void addEdge(int from, int to, Type type){

    }
    public int getSize(){
        return id.length;
    }
}
