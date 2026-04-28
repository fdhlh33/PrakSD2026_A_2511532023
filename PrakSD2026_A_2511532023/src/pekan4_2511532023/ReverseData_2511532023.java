package pekan4_2511532023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532023 {
	public static void main(String[] args) {
		Queue<Integer> q_2023 = new LinkedList<Integer>();
		q_2023.add(1);
		q_2023.add(2);
		q_2023.add(3); // [1, 2, 3]
		System.out.println("Sebelum reverse = " + q_2023);
		Stack<Integer> s_2023 = new Stack<Integer>();
		while (!q_2023.isEmpty()) { // Q -> S
			s_2023.push(q_2023.remove());
		}
		while (!s_2023.isEmpty()) { // S -> Q
			q_2023.add(s_2023.pop());
		}
		System.out.println("Sesudah reverse = " + q_2023); // [3, 2, 1]
	}
}