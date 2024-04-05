public class Main {
    public static void main(String[] args) {
        Stack<Character> expression = new Stack<>();
        expression.push('=');
        expression.push('+');
        expression.push('9');
        expression.push('*');
        expression.push('5');
        expression.push('+');
        expression.push('2');
        expression.push('8');
        System.out.println(AdvancedFeatures.postfixRecordExpression(expression));

    }
}
