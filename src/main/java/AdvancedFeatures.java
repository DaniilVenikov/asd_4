import java.util.Stack;

public class AdvancedFeatures {

    public static boolean checkBalanceBrackets(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets.toCharArray()) {
            switch (bracket) {
                case '(' -> stack.push(bracket);
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static int postfixRecordExpression(Stack<Character> expression) {
        Stack<Integer> numberStack = new Stack<>();
        int size = expression.size();
        for (int i = 0; i < size; i++) {
            Character ch = expression.pop();
            if (Character.isDigit(ch)) {
                numberStack.push(Character.getNumericValue(ch));
            } else if (ch == '=') {
                return numberStack.pop();
            } else {
                int firstNumber = numberStack.pop();
                int secondNumber = numberStack.pop();
                int result = operation(firstNumber, secondNumber, ch);
                numberStack.push(result);
            }

        }
        return numberStack.pop();
    }

    private static int operation(int firstNumber, int secondNumber, Character ch) {
        switch (ch) {
            case '+' -> {
                return firstNumber + secondNumber;
            }
            case '*' -> {
                return firstNumber * secondNumber;
            }
            case '-' -> {
                return firstNumber - secondNumber;
            }
            case '/' -> {
                return firstNumber / secondNumber;
            }
            default -> throw new IllegalArgumentException("Unknown operation");
        }
    }
}
