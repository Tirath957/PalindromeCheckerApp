import java.util.*;

public class PalindromeCheckerApp {

    // Reverse String Method
    public static boolean reverseCheck(String input) {

        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Stack Method
    public static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        for(char c : input.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String input) {

        Deque<Character> deque = new LinkedList<>();

        for(char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Reverse Algorithm
        long start1 = System.nanoTime();
        boolean r1 = reverseCheck(input);
        long end1 = System.nanoTime();

        // Stack Algorithm
        long start2 = System.nanoTime();
        boolean r2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque Algorithm
        long start3 = System.nanoTime();
        boolean r3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Reverse Method: " + r1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + r2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method: " + r3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}