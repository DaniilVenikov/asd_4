public class AdvancedFeatures {

//    public static boolean checkBalanceBrackets(String brackets) {
//        Stack<Character> stack = new Stack<>();
//        if (brackets.toCharArray().length % 2 == 0) {
//            return false;
//        }
//
//
//    }


    public static int postfixRecordExpression(Stack<Character> expression) {
        Stack<Integer> numberStack = new Stack<>();
        int size = expression.size();
        for (int i = 0; i < size; i++) {
            Character ch = expression.pop();
            if (Character.isDigit(ch)) {
                numberStack.push(Character.getNumericValue(ch));
            } else {
                switch (ch) {
                    case '+' -> {
                        int firstNumber = numberStack.pop();
                        int secondNumber = numberStack.pop();
                        numberStack.push(firstNumber + secondNumber);
                    }
                    case '*' -> {
                        int firstNumber = numberStack.pop();
                        int secondNumber = numberStack.pop();
                        numberStack.push(firstNumber * secondNumber);
                    }
                    case '=' -> {
                        return numberStack.pop();
                    }
                }
            }
        }
        return numberStack.pop();
    }
}
