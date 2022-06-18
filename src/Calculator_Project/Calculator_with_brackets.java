package Calculator_Project;
import java.util.Stack;

public class Calculator_with_brackets {

    public static void main(String[] args) {
        String test = "21/7/(21/7)";
        char[] charList = test.toCharArray();
        Stack<Integer> valueStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i<charList.length; i++) {
            if (charList[i] >= '0' && charList[i] <= '9') {
                //valueStack.push(Integer.parseInt(Character.toString(charList[i])));
                StringBuffer moreThanOneDigit = new StringBuffer();
                moreThanOneDigit.append(charList[i]);
                while(i+1 < charList.length && charList[i+1] >= '0' && charList[i+1] <= '9') {
                    moreThanOneDigit.append(charList[i+1]);
                    i++;
                }
                System.out.println(moreThanOneDigit);
                valueStack.push(Integer.parseInt(moreThanOneDigit.toString()));
            }
            else if (charList[i] == '(') {
                operatorStack.push(charList[i]);
            }
            else if (charList[i] == ')') {
                while (operatorStack.peek() != '(') {
                    valueStack.push(applyOp(operatorStack.pop(), valueStack.pop(), valueStack.pop()));
                }
                operatorStack.pop();
            }
            else if (charList[i] == '+' || charList[i]=='-' || charList[i] == '*' || charList[i] == '/'){
                if (!operatorStack.empty() && hasPrecedence(charList[i], operatorStack.peek())){
                    valueStack.push(applyOp(operatorStack.pop(), valueStack.pop(), valueStack.pop()));
                }
                operatorStack.push(charList[i]);
            }
        }

        while (!operatorStack.empty()){
            valueStack.push(applyOp(operatorStack.pop(), valueStack.pop(), valueStack.pop()));
        }
        System.out.println(valueStack);
//        System.out.println(valueStack);
//        System.out.println(operatorStack);

    }

    private static int applyOp(char operator, int x, int y){
        MathOperations cal = new MathOperations();
        if (operator == '/' || operator == '-'){
            return cal.calculate(operator, y, x);
        }
        return cal.calculate(operator, x, y);
    }

    private static boolean hasPrecedence(char operator1,char operator2) {
        if (operator2 == '(' || operator2 == ')')
            return false;
        else if ((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-'))
            return false;
        else
            return true;
    }
}
