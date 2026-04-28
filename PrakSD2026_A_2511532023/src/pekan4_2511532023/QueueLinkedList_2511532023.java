package pekan4_2511532023;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511532023 {
	public static void main(String[] args) {
		Queue<Integer> q_2023 = new LinkedList<>();
		// Tambah elemen (0, 1, 2, 3, 4, 5) ke antrian
		for (int i =0; i < 6; i++)
			q_2023.add(i);
		// Menampilkan isi antrian
		System.out.println("Elemen Antrian " + q_2023);
		// Untuk menghapus kepala antrian
		int hapus_2023 = q_2023.remove();
		System.out.println("Hapus Elemen = " + hapus_2023);
		System.out.println(q_2023);
		// Untuk melihat antrian terdepan
		int depan_2023 = q_2023.peek();
		System.out.println("Kepala Antrian = " + depan_2023);
		
		int banyak_2023 = q_2023.size();
		System.out.println("Size Antrian = " + banyak_2023);
	}
}