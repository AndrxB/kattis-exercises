//package S2024;
//
//import java.util.Scanner;
//
//public class HarmonyAndConflict {
//    public static void dfs(){
//
//    }
//
//    public static boolean isHarmony(){
//        return true;
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // n vertices
//        int m = sc.nextInt(); // m edges
//
//        Integer[] nodes = new Integer[n];
//        Edge[] edges = new Edge[m];
//
//
//        for(int i = 0; i<m; i++){
//            if(i<n)
//                nodes[i] = i;
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            int c = sc.nextInt();
//            edges[i] = new Edge(u, v, c);
//        }
//
//        System.out.println(isHarmony());
//    }
//}
//
