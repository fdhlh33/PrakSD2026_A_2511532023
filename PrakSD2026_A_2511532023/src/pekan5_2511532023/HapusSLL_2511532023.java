package pekan5_2511532023;

public class HapusSLL_2511532023 {
	// Fungsi untuk menghapus head
	public static NodeSLL_2511532023 deleteHead_2023(NodeSLL_2511532023 head_2023) {
		// Jika SLL kosong
		if (head_2023 == null)
			return null;
		// Pindahkan head ke node berikutnya
		head_2023 = head_2023.next_2023;
		// Return head baru
		return head_2023; }
	// Fungsi menghapus node terakhir SLL
	public static NodeSLL_2511532023 removeLastNode_2023(NodeSLL_2511532023 head_2023) {
		// Jika list kosong, return null
		if (head_2023 == null) {
			return null;
		}
		// Jika list satu node, hapus node dan return null
		if (head_2023.next_2023 == null) {
			return null;
		}
		// Temukan node terakhir ke dua
		NodeSLL_2511532023 secondLast = head_2023;
		while (secondLast.next_2023.next_2023 != null) {
			secondLast = secondLast.next_2023;
		}
		// Hapus node terakhir
		secondLast.next_2023 = null;
		return head_2023; }
	// Fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511532023 deleteNode_2023(NodeSLL_2511532023 head_2023, int position_2023) {
		NodeSLL_2511532023 temp = head_2023;
		NodeSLL_2511532023 prev = null;
		// Jika linked list null
		if (temp == null)
			return head_2023;
		// Kasus 1: head dihapus
		if (position_2023 == 1) {
			head_2023 = temp.next_2023;
			return head_2023; }
		// Kasus 2: menghapus node di tengah
		// Telusuri ke node yang dihapus
			for (int i = 1; temp != null && i < position_2023; i++) {
				prev = temp;
				temp = temp.next_2023;	}
			// Jika ditemukan, hapus node
			if (temp != null) {
				prev.next_2023 = temp.next_2023;
			} else {
				System.out.println("Data tidak ada"); }
				return head_2023; }
			// Fungsi mencetak SLL
			public static void printList (NodeSLL_2511532023 head_2023) {
				NodeSLL_2511532023 curr_2023 = head_2023;
				while (curr_2023.next_2023 != null) {
					System.out.print(curr_2023.data_2023 + "-->");
					curr_2023 = curr_2023.next_2023;
				if (curr_2023.next_2023 == null) {
					System.out.print(curr_2023.data_2023);
					System.out.println(); }
				}
			}
			// Kelas main
			public static void main(String[] args) {
				// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
				NodeSLL_2511532023 head_2023 = new NodeSLL_2511532023(1);
				head_2023.next_2023 = new NodeSLL_2511532023(2);
				head_2023.next_2023.next_2023 = new NodeSLL_2511532023(3);
				head_2023.next_2023.next_2023.next_2023 = new NodeSLL_2511532023(4);
				head_2023.next_2023.next_2023.next_2023.next_2023 = new NodeSLL_2511532023(5);
				head_2023.next_2023.next_2023.next_2023.next_2023.next_2023 = new NodeSLL_2511532023(6);
				// Cetak list awal
				System.out.println("List awal : ");
				printList(head_2023);
				// Hapus head
				head_2023 = deleteHead_2023(head_2023);
				System.out.println("List setelah head dihapus : ");
				printList(head_2023);
				// Hapus node terakhir
				head_2023 = removeLastNode_2023(head_2023);
				System.out.println("List setelah simpul terakhir di hapus : ");
				printList(head_2023);
				// Deleting node at position 2
				int position_2023 = 2;
				head_2023 = deleteNode_2023(head_2023, position_2023);	
				// Print list after deletion
				System.out.println("List setelah posisi 2 dihapus : ");
				printList(head_2023);
			}	
		}