package S2024;

import java.util.*;

public class itu_grades
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] students = new String[n];
        Map<String, String> students2grades = new HashMap<>();

        for(int i = 0; i<n; i++)
        {
            String student = sc.next();
            String grade = sc.next();
            students[i] = student;
            students2grades.put(student, grade);
        }


    }
}
