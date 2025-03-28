
interface Stack {
    int size = 5; 
    void push(int value);
    int pop();
    void display();
}


class IntegerStack implements Stack {
    private int[] stack = new int[size];
    private int top = -1;

    // Push method
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
        }
    }


    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Pra4_1 {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Overflow

        stack.display();

        stack.pop();
        stack.pop();
        stack.display();
    }
}
