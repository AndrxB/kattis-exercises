package S2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Balance
{
    String[] stack;
    int top;

    public Balance(int size)
    {
        this.stack = new String[size];
        this.top = -1;
    }

    public void push(String push)
    { // adds a String behind the most recent
        if (top == stack.length - 1) {
            resize();
        }
        top++;
        stack[top] = push;
    }

    public String pop()
    { // returns String of the least recently added and removes the String from the queue[]
        if (top == -1) {
            return null;  // Stack is empty
        }
        String popped = stack[top];
        stack[top] = null;
        top--;
        return popped;
    }

    public int count()
    { // will return the total amount of nonNull elements in the queue[]
        int counter = 0;
        for(String s : stack)
            if(s != null) counter++;
        return counter;
    }

    public void resize()
    { // will double the length of the queue
        String[] newQueue = new String[stack.length*2];
        for(int i = 0; i<stack.length-1;i++){ break;}
        System.err.println("not implemented");
    }

    public boolean isEmpty() { return count() == 0; }

    public int length() { return stack.length; }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            Balance balance = new Balance(line.length());
            boolean result = balance.isBalanced(line.split(""));
            System.out.println(result ? 1 : 0);
        }

        br.close();
    }

    public boolean isBalanced(String[] input)
    {
        for (String in : input)
        {
            if (in.equals("(") || in.equals("["))
                push(in);
            else if (in.equals(")") || in.equals("]"))
            {
                String latest = pop();
                if (latest == null)
                    return false;
                if ((in.equals(")") && latest.equals("(")) || (in.equals("]") && latest.equals("["))) {
                    // Matching pair
                } else {
                    return false;  // Mismatched parentheses
                }
            }
        }
        return isEmpty();  // Check if there are any unmatched opening parentheses
    }
}