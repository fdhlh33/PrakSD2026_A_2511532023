package pekan6_2511532023;

public class HapusDLL_2511532023 {
	//  Fungsi menghapus node awal
	public static NodeDLL_2511532023 delHead_2023(NodeDLL_2511532023 head_2023) {
		if (head_2023 == null) {
			return null; }
			NodeDLL_2511532023 temp_2023 = head_2023;
			head_2023 = head_2023.next_2023;
			if (head_2023 != null) {
				head_2023.prev_2023 = null; }
			return head_2023;
		}
	// Fungsi menghapus di akhir
		public static NodeDLL_2511532023 delLast_2023(NodeDLL_2511532023 head_2023) {
			if (head_2023 == null) {
				return null; }
			if  (head_2023.next_2023 == null) {
				return null; }
			NodeDLL_2511532023 curr_2023 = head_2023;
			while (curr_2023.next_2023 != null) {
				curr_2023 = curr_2023.next_2023;
			}
			// Updute pointer previous node
			if (curr_2023.prev_2023 != null) {
				curr_2023.prev_2023.next_2023 = null; }
			return head_2023;
		}
	// Fungsi menghapus node posisi tertentu
		public static NodeDLL_2511532023 delPos_2023(NodeDLL_2511532023 head_2023, int pos_2023) {
			// Jika DLL kosong 
			if (head_2023 == null) {
				return head_2023; }
			NodeDLL_2511532023 curr_2023 = head_2023;
			// Telusuri sampai ke node yang akan dihapus
			for (int i = 1; curr_2023 != null && i < pos_2023; ++i) {
				curr_2023 = curr_2023.next_2023; }
			// Jika posisi tidak ditemukan 
			if (curr_2023 == null) {
				return head_2023; }
			// Update pointer
			if (curr_2023.prev_2023 != null) {
				curr_2023.prev_2023.next_2023 = curr_2023.next_2023; }
			if (curr_2023.next_2023 != null) {
				curr_2023.next_2023.prev_2023 = curr_2023.prev_2023; }
			// Jika yang dihapus head
			if (head_2023 == curr_2023) {
				head_2023 = curr_2023.next_2023; }
			return head_2023;
		}
	// Fungsi mencetak DLL
		public static void printList_2023(NodeDLL_2511532023 head_2023) {
			NodeDLL_2511532023 curr_2023 = head_2023;
			while (curr_2023 != null) {
				System.out.print(curr_2023.data_2023 + " <-> ");
				curr_2023 = curr_2023.next_2023;
			}
			System.out.println();
		}
		public static void main(String[] args) {
			// Buat sebuah DLL
			NodeDLL_2511532023 head_2023 = new NodeDLL_2511532023(1);
			head_2023.next_2023 = new NodeDLL_2511532023(2);
			head_2023.next_2023.prev_2023 = head_2023;
			head_2023.next_2023.next_2023 = new NodeDLL_2511532023(3);
			head_2023.next_2023.next_2023.prev_2023 = head_2023.next_2023;
			head_2023.next_2023.next_2023.next_2023 = new NodeDLL_2511532023(4);
			head_2023.next_2023.next_2023.next_2023.prev_2023 = head_2023.next_2023.next_2023;
			head_2023.next_2023.next_2023.next_2023.next_2023 = new NodeDLL_2511532023(5);
			head_2023.next_2023.next_2023.next_2023.next_2023.prev_2023 = head_2023.next_2023.next_2023.next_2023;
			
			System.out.print("DLL Awal: ");
			printList_2023(head_2023);
			
			System.out.print("Setelah head dihapus: ");
			head_2023 = delHead_2023(head_2023);
			printList_2023(head_2023);
			
			System.out.print("Setelah node terakhir dihapus: ");
			head_2023 = delLast_2023(head_2023);
			printList_2023(head_2023);
			
			System.out.print("Menghapus node ke-2: ");
			head_2023 = delPos_2023(head_2023, 2);
			
			printList_2023(head_2023);			
	}
}