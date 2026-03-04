import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

<<<<<<< HEAD
        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
=======
        // Insert characters into stack and queue
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
>>>>>>> feature/UC6
        }

        boolean isPalindrome = true;

<<<<<<< HEAD
        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
=======
        // Compare dequeue and pop
        while(!stack.isEmpty()){

            if(stack.pop() != queue.remove()){
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if(isPalindrome){
>>>>>>> feature/UC6
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}