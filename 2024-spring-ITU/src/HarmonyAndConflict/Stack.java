/*
package HarmonyAndConflict;

public class Stack {
        Object[] stack;
        int top;

        public Stack()
        {
            this.stack = new String[1];
            this.top = -1;
        }

        public void push(Object edge)
        { // adds an Edge behind the most recent
            if (top == stack.length - 1) {
                resize();
            }
            top++;
            stack[top] = edge;
        }

        public Object pop()
        { // returns String of the least recently added and removes the String from the queue[]
            if (top == -1) {
                return null;  // Stack is empty
            }
            Object popped = stack[top];
            stack[top] = null;
            top--;
            return popped;
        }

        public int count()
        { // will return the total amount of nonNull elements in the queue[]
            int counter = 0;
            for(Object s : stack)
                if(s != null) counter++;
            return counter;
        }

        public void resize()
        { // will double the length of the queue
            Object[] newStack = new Edge[stack.length*2];
            int newStackTop = 0;
            for(int i = 0; i<stack.length-1;i++){
                if(stack[i] != null){
                    newStack[newStackTop] = stack[i];
                    newStackTop++;
                }
            }

            this.stack = newStack;
            this.top = newStack.length-1;
        }

        public boolean isEmpty() { return count() == 0; }

        public int length() { return stack.length; }
}
*/
