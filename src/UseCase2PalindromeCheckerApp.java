public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC2");
        System.out.println("----------------------------");

        // Hardcoded string
        String word = "madam";

        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}