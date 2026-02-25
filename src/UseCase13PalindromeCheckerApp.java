import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC13 (Performance Comparison)");
        System.out.println("------------------------------------------------------");

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        boolean reverseResult = reverseMethod(normalized);
        endTime = System.nanoTime();
        long reverseTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean stackResult = stackMethod(normalized);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean dequeResult = dequeMethod(normalized);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        System.out.println("Reverse Method Result: " + reverseResult + " | Time: " + reverseTime + " ns");
        System.out.println("Stack Method Result:   " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method Result:   " + dequeResult + " | Time: " + dequeTime + " ns");

        System.out.println("Program finished.");
    }

    public static boolean reverseMethod(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static boolean dequeMethod(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}