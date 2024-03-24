package HarmonyAndConflict;

import java.util.Scanner;

/**
 * This is for the kattis-exercise <a href="https://itu.kattis.com/courses/KSALDAS/2024-Spring/assignments/zfntwf/problems/itu.harmony">Harmony and Conflict</a>
 */
public class Main {
    private static DepthFirstSearch DFS;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        DFS = new DepthFirstSearch(sc.nextInt());
        int m = sc.nextInt();
        for(int i = 0; i<m; i++){
            DFS.addEdge();
        }


    }
}
