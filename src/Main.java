import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Normalize string
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = processed.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (processed.charAt(start) != processed.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}