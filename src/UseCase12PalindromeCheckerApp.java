import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

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
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

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

class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC12 (Strategy Pattern)");
        System.out.println("------------------------------------------------");

        String input = "madam";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();
        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.execute(input);

        if (result) {
            System.out.println("Using StackStrategy: " + input + " is a Palindrome.");
        } else {
            System.out.println("Using StackStrategy: " + input + " is NOT a Palindrome.");
        }

        strategy = new DequeStrategy();
        service = new PalindromeService(strategy);

        result = service.execute(input);

        if (result) {
            System.out.println("Using DequeStrategy: " + input + " is a Palindrome.");
        } else {
            System.out.println("Using DequeStrategy: " + input + " is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}