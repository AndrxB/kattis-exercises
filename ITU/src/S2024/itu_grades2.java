package S2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class itu_grades2
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = sc.nextInt();
        String[][] gradeMatrix = new String[n][2];
        for(int i = 0; i<n; i++)
        {
            String student = sc.next();
            String grade = sc.next();
            gradeMatrix[i][0] = student;
            gradeMatrix[i][1] = grade;
        }

        Comparator<String[]> gradeAndNameComparator = Comparator
                .comparing((String[] arr) -> arr[1])  // Compare by grades
                .thenComparing(arr -> arr[0]);       // If grades are equal, compare by names

        Arrays.sort(gradeMatrix, gradeAndNameComparator);
         /* Print the array */
        for(int i = 0; i<n; i++) {
            System.out.println(gradeMatrix[i][0]);
}
    }
}
