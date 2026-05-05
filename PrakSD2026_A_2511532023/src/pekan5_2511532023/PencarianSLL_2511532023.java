package pekan5_2511532023;

public class PencarianSLL_2511532023 {
	static boolean searchKey(NodeSLL_2511532023 head_2023, int key_2023) {
		NodeSLL_2511532023 curr_2023 = head_2023;
		while (curr_2023 != null) {
			if (curr_2023.data_2023 == key_2023)
				return true;
			curr_2023 = curr_2023.next_2023; }
		return false; }
	public static void traversal(NodeSLL_2511532023 head_2023) {
		// Mulai dari head
		NodeSLL_2511532023 curr = head_2023;
		// Telusuri sampai pointer null
		while (curr != null) {
			System.out.print(" " + curr.data_2023);
			curr = curr.next_2023; }
		System.out.println(); }
	public static void main(String[] args) {
		NodeSLL_2511532023 head_2023 = new NodeSLL_2511532023(14);
		head_2023.next_2023 = new NodeSLL_2511532023(21);
		head_2023.next_2023.next_2023 = new NodeSLL_2511532023(13);
		head_2023.next_2023.next_2023.next_2023 = new NodeSLL_2511532023(30);
		head_2023.next_2023.next_2023.next_2023.next_2023 = new NodeSLL_2511532023(10);
		System.out.print("Penelusuran SLL : ");
		traversal(head_2023);
		// Data yang akan dicari
		int key_2023 = 30;
		System.out.print("Cari data " + key_2023 + " = ");
		if (searchKey(head_2023, key_2023))
			System.out.println("Ketemu");
		else
			System.out.println("Tidak ada");
	}
}