import java.util.Stack;
import java.util.Scanner;

public class Parenthesis_Matching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();
        if (isBalenced(expression)) {
            System.out.println("This is valid Parenthesis");
        } else {
            System.out.println("This is not a valid Parenthesis");

        }

        s.close();

    }

    public static boolean isBalenced(String a) {
        Stack<Character> stack = new Stack<>();

        for (char c : a.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;

                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

}
