package HarmonyAndConflict;

import java.util.List;

public abstract class Edge {
    private Type type;
    private boolean marked;
    private List<Edge> adjecentEdges;
    public Edge(int type){
        this.type = Type.getType(type);
        marked = false;
    }
}
