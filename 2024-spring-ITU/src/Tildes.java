import java.util.Scanner;

public class Tildes {

    static class UnionFind{
        int size;
        private final Integer[] id;
        private final Integer[] root;
        public UnionFind(int size){
            this.size = size;
            id = helper(size);
            root = helper(size);
        }

        public void merge(int first, int second){
            if(root[first] == root[second]) return;
            root[second] = root[first];
        }

        private Integer[] helper(int size){
            Integer[] array = new Integer[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            return array;
        }

        public int getSizeOf(int id){
            int j = 0;

            for (int i = 0; i < this.id.length; i++) {
                if(this.root[i] == id){
                    j++;
                }


            }

            return j;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int guests = sc.nextInt();
        int queries = sc.nextInt();

        UnionFind unionFind = new UnionFind(guests);

        for (int i = 0; i < queries; i++) {
            String query = sc.nextLine();

            if(query.equals("t")){
                unionFind.merge(sc.nextInt(), sc.nextInt());
            } else {
                System.out.println(unionFind.getSizeOf(sc.nextInt()));
            }
        }

    }
}
