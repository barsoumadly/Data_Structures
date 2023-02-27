import java.util.Stack;

public class PracticeJava {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("C++");
        stack.push("Java");
        stack.push("Python");
        stack.push("Data Structures");
        stack.push("Algorithms");
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }

    public static void pushAtBottom(Stack<String> stack, String data) {
        if (!stack.empty()) {
            String value = stack.pop();
            pushAtBottom(stack, data);
            stack.push(value);
        } else {
            stack.push(data);
        }
    }

    public static void reverse(Stack<String> stack) {
        if (!stack.empty()) {
            String data = stack.pop();
            reverse(stack);
            pushAtBottom(stack, data);
        }
    }
}
