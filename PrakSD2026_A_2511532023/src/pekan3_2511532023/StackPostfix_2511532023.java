package pekan3_2511532023;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532023 {
	public static int postfixEvaluate_2023(String expression) {
		Stack<Integer> s_2023 = new Stack<Integer>();
		Scanner input_2023 = new Scanner(expression);
		while (input_2023.hasNext()) {
			if (input_2023.hasNextInt()) {
				s_2023.push(input_2023.nextInt());
			} else {
				String operator_2023 = input_2023.next();
				int operand2_2023 = s_2023.pop();
				int operand1_2023 = s_2023.pop();
				if (operator_2023.equals("+")) {
					s_2023.push(operand1_2023 + operand2_2023);
				}
				else if (operator_2023.equals("-")) {
					s_2023.push(operand1_2023 - operand2_2023);
				} else if (operator_2023.equals("*")) {
					s_2023.push(operand1_2023 * operand2_2023);
				} else {
					s_2023.push(operand1_2023 / operand2_2023);
				}
			}
		}
		input_2023.close();
		return s_2023.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix = " + postfixEvaluate_2023("5 2 4 * +  7 -"));
	}
}