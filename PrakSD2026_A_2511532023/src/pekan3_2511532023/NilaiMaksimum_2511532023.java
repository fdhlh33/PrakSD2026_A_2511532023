package pekan3_2511532023;

import java.util.Stack;

public class NilaiMaksimum_2511532023 {
	public static int max_2023(Stack<Integer> s_2023) {
		Stack<Integer> backup_2023 = new Stack<Integer>();
		int maxValue_2023 = s_2023.pop();
		backup_2023.push(maxValue_2023);
		while (!s_2023.isEmpty()) {
			int next_2023 = s_2023.pop();
			backup_2023.push(next_2023);
			maxValue_2023 = Math.max(maxValue_2023, next_2023);
		}
		while (!backup_2023.isEmpty()) {
			s_2023.push(backup_2023.pop());
		}
		return maxValue_2023;
	}
	public static void main(String[] args) {
		Stack<Integer> s_2023 = new Stack<Integer>();
		s_2023.push(70);
		s_2023.push(12);
		s_2023.push(20);
		System.out.println("Isi stack " + s_2023);
		System.out.println("Stack Teratas " + s_2023.peek());
		System.out.println("Nilai maksimum " + max_2023(s_2023));
	}
}