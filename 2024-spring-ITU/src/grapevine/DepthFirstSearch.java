package grapevine;

public class DepthFirstSearch {
    int days;

    public DepthFirstSearch(int days){
        this.days = days;
    }

    public int dfs(Person current, int counter){
        if(counter > days || current.getIsConvinced()) {
            return 0; // Return 0 if current person is convinced or counter exceeds days
        }

        current.setMarked();
        int heard = 0;

        // Check if the current person is skeptical enough to spread the rumor
        if (current.getSkepticism() == 0 || current.heardFrom.size() >= current.getSkepticism()) {
            heard++;
        }

        // Traverse adjacent nodes
        for (Person adj : current.getAdj()) {
            if (!adj.getMarked()) {
                adj.update(current); // Update that the current person heard the rumor from 'adj'
                heard += dfs(adj, counter + 1);
            }
        }

        return heard;
    }
}