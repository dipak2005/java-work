
import java.util.Stack;

public class Pro {

    public static String infixToPostfix(String str, int index, Stack<Character> st) {
        StringBuilder sb = new StringBuilder();

        while (index < str.length()) {
            char item = str.charAt(index);

            // If the character is an operand (a-z)
            if (item >= 'a' && item <= 'z') {
                sb.append(item);
            } // If the character is '('
            else if (item == '(') {
                // Recursively process the expression inside parentheses
                String result = infixToPostfix(str, index + 1, st);
                sb.append(result);

                // Find the closing parenthesis
                while (str.charAt(index) != ')') {
                    index++;
                }
            } // If the character is an operator (+, -, *, /)
            else if (item == '+' || item == '-' || item == '*' || item == '/') {
                while (!st.isEmpty() && precedence(item) <= precedence(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(item);
            } // If the character is ')'
            else if (item == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop(); // Pop '(' from the stack
                return sb.toString();
            }

            index++;
        }

        // Pop all remaining operators from the stack
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    // Helper function to define precedence of operators
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String str = "a+b*(a-c)";
        String result = infixToPostfix(str, 0, st);
        System.out.println(result);  // Output: abc-*+
    }
}
