public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC4");
        System.out.println("----------------------------");

        // Original string
        String original = "level";

        // Convert String to Character Array
        char[] characters = original.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}