package pekan6_2511532023;

public class PenelusuranDLL_2511532023 {
	// Fungsi penelusuran maju
	static void forwardTraversal_2023(NodeDLL_2511532023 head_2023) {
		// Memulai penelusuran dari head
		NodeDLL_2511532023 curr_2023 = head_2023;
		// Lanjutkan sampai akhir
		while (curr_2023 != null) {
			// Print data
			System.out.print(curr_2023.data_2023 + " <-> ");
			// Pindah ke node berikutnya
			curr_2023 = curr_2023.next_2023;
		}
		// Print spasi
		System.out.println();
	}
	// Fungsi penelusuran mundur
	static void backwardTraversal_2023(NodeDLL_2511532023 tail_2023) {
		// Mulai dari akhir
		NodeDLL_2511532023 curr_2023 = tail_2023;
		// Lanjut sampai head
		while (curr_2023 != null) {
			// Cetak data
			System.out.print(curr_2023.data_2023 + " <-> ");
			// Pindah ke node sebelumnya
			curr_2023 = curr_2023.prev_2023;
		}
		// Cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		// Cetak DLL
		NodeDLL_2511532023 head_2023 = new NodeDLL_2511532023(1);
		NodeDLL_2511532023 second_2023 = new NodeDLL_2511532023(2);
		NodeDLL_2511532023 third_2023 = new NodeDLL_2511532023(3);
		
		head_2023.next_2023 = second_2023;
		second_2023.prev_2023 = head_2023;
		second_2023.next_2023 = third_2023;
		third_2023.prev_2023 = second_2023;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_2023(head_2023);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_2023(third_2023);
	}
}