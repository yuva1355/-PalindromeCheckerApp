public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC10 (Case & Space Ignored)");
        System.out.println("----------------------------------------------------");

        String original = "A man a plan a canal Panama";

        String normalized = original.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}