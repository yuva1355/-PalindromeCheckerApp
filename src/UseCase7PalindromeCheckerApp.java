import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC7 (Deque Based)");
        System.out.println("--------------------------------------------");

        // Original string
        String original = "madam";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst(); // remove from front
            char rear = deque.removeLast();   // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}