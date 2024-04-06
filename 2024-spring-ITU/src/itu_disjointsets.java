/*
import java.util.*;

*/
/*import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;*//*



public class itu_disjointsets
{
    public static void main(String[] args)
    {
        int n = StdIn.readInt();
        int m = StdIn.readInt();

        WeightedQuickUnionUF union = new WeightedQuickUnionUF(n);
        List<Integer> line;

        for(int i = 0; i < m; i++){
            line = new ArrayList<>();
            line.add(StdIn.readInt());
            line.add(StdIn.readInt());
            line.add(StdIn.readInt());

            int operation = line.get(0);
            int s = line.get(1);
            int t = line.get(2);
            int rootS = union.find(s);
            int rootT = union.find(t);

            switch (operation)
            {
                case 0:
                    if(rootS == rootT) System.out.println(1);
                    else System.out.println(0);
                    break;
                case 1:
                    if(s != t) union.union(s,t);
                    break;
                case 2:
                    if (rootS == rootT) return;
                    union.union(s,t);
                    break;
                default:
                    break;
            }
        }
    }
    public static class WeightedQuickUnionUF
    {
        private int[] id;
        private int[] sz;
        private int count;
        public WeightedQuickUnionUF(int N)
        {
            count = N;
            id = new int[N];
            for (int i = 0; i < N; i++) id[i] = i;
            sz = new int[N];
            for (int i = 0; i < N; i++) sz[i] = 1;
        }
        public int count()
        {  return count;  }

        public boolean connected(int p, int q)
        {  return find(p) == find(q);  }

        public void union(int p, int q)
        {
            int i = find(p);
            int j = find(q);
            if (i == j) return;
            // Make smaller root point to larger one.
            if   (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
            else                 { id[j] = i; sz[i] += sz[j]; }
            count--;
        }
        private int find(int p) {
            validate(p);  // Add bounds checking
            while (p != id[p]) p = id[p];
            return p;
        }

        public void move(int s, int t) {
            validate(s);  // Add bounds checking
            validate(t);  // Add bounds checking

            int sID = find(s);
            int tID = find(t);
            if (sID == tID) return;
            else id[sID] = tID;
        }

        private void validate(int p) {
            int N = id.length;
            if (p < 0 || p >= N) {
                throw new IndexOutOfBoundsException("Index " + p + " is not between 0 and " + (N - 1));
            }
        }
    }
}

*/
