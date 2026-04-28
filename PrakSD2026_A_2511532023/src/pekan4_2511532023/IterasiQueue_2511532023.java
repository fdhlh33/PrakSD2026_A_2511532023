package pekan4_2511532023;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2511532023 {
	public static void main(String[] args) {
		Queue<String> q_2023 = new LinkedList<>();
		q_2023.add("Praktikum");
		q_2023.add("Struktur");
		q_2023.add("Data");
		q_2023.add("Dan");
		q_2023.add("Algoritma");
		Iterator<String> iterator_2023 = q_2023.iterator();
		while (iterator_2023.hasNext()) {
			System.out.print(iterator_2023.next() + " ");
		}
	}
}