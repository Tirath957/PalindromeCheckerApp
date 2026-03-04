import java.util.Scanner;

public class PalindromeCheckerApp {

    // Service class inside same file
    static class PalindromeChecker {

        public boolean checkPalindrome(String input) {

            // Normalize string
            String processed = input.replaceAll("\\s+", "").toLowerCase();

            int start = 0;
            int end = processed.length() - 1;

            while (start < end) {

                if (processed.charAt(start) != processed.charAt(end)) {
                    return false;
                }

                start++;
                end--;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}