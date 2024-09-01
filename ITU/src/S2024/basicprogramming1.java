package S2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class basicprogramming1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int action = sc.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i<N; i++)
            A[i] = sc.nextInt();

        switch (action){
            case 1:
                System.out.println(7);
                break;
            case 2:
                if(A[0] == A[1])
                    System.out.println("Equal");
                else
                    System.out.println(A[0] > A[1] ? "Bigger" : "Smaller");
                break;
            case 3:
                System.out.println((A[0]+A[1]+A[2])/3);
                break;
            case 4:
                int sum4 = 0;
                for (Integer integer : A)
                    sum4 += integer;
                System.out.println(sum4);
                break;
            case 5:
                int sum5 = 0;
                for (int i = 0; i<A.length; i++){
                    if ((i%2 != 0)) {
                        sum5 += A[i];
                    }
                }
                System.out.println(sum5);
                break;
            case 6:
                for (int i = 0; i<A.length; i++){
                    A[i] = A[i] % 26;
                }

                Map<Integer, Character> map = getMap();

                for(int i : A)
                    System.out.print(map.get(i));

                break;
            case 7:
                int counter = 0;
                for (int i = 0; i<A.length; i++){
                    counter++;
                    if (A[i] > N-1) {
                        System.out.println("Out");
                        break;
                    } else if (A[i]==N-1) {
                        System.out.println("Done");
                        break;
                    } else if (counter > N-1){
                        System.out.println("Cyclic");
                    }
                }

                break;
            default:
                System.err.println("This shouldn't be possible");
                break;

        }



    }

    public static Map<Integer, Character> getMap(){
        Map<Integer, Character> map = new HashMap<>();
        map.put(0, 'a');
        map.put(1, 'b');
        map.put(2, 'c');
        map.put(3, 'd');
        map.put(4, 'e');
        map.put(5, 'f');
        map.put(6, 'g');
        map.put(7, 'h');
        map.put(8, 'i');
        map.put(9, 'j');
        map.put(10, 'k');
        map.put(11, 'l');
        map.put(12, 'm');
        map.put(13, 'n');
        map.put(14, 'o');
        map.put(15, 'p');
        map.put(16, 'q');
        map.put(17, 'r');
        map.put(18, 's');
        map.put(19, 't');
        map.put(20, 'u');
        map.put(21, 'v');
        map.put(22, 'w');
        map.put(23, 'x');
        map.put(24, 'y');
        map.put(25, 'z');
        return map;
    }

}
