import java.util.*;

public class Task4 {
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, top);
        }
    }

    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int top = stack.pop();
            insertAtBottom(stack, item);
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of elements in the stack: ");
        int n = scanner.nextInt();
        System.out.print("Enter values for the stack: ");

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        reverseStack(stack);
        System.out.print("Reversed stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
