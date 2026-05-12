package pekan6_2511532023;

public class InsertDLL_2511532023 {
	// Menambahkan node di awal DLL
	static NodeDLL_2511532023 insertBegin_2023(NodeDLL_2511532023 head_2023, int data_2023) {
		// Buat node baru
		NodeDLL_2511532023 new_node_2023 = new NodeDLL_2511532023(data_2023);
		// Jadikan pointer nextnya head
		new_node_2023.next_2023 = head_2023;
		// Jadikan pointer prev head ke new node
		if  (head_2023 != null) {
			head_2023.prev_2023 = new_node_2023;
		}
		return new_node_2023;
	}
	// Fungsi menambahkan node di akhir
	public static NodeDLL_2511532023 insertEnd_2023(NodeDLL_2511532023 head_2023, int newData_2023) {
		// Buat node baru
		NodeDLL_2511532023 newNode_2023 = new NodeDLL_2511532023(newData_2023);
		// Jika dll null jadikan head
		if (head_2023 == null) {
			head_2023 = newNode_2023;
		} else {
			NodeDLL_2511532023 curr_2023 = head_2023;
			while (curr_2023.next_2023 != null) {
				curr_2023 = curr_2023.next_2023;
			}
			curr_2023.next_2023 = newNode_2023;
			newNode_2023.prev_2023 = curr_2023;
		}
		return head_2023;
	}
	// Fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532023 insertAtPosition_2023(NodeDLL_2511532023 head_2023, int pos_2023, int new_data_2023) {
		// Buat node baru
		NodeDLL_2511532023 new_node_2023 = new NodeDLL_2511532023(new_data_2023);
		if (pos_2023 == 1) {
			new_node_2023.next_2023 = head_2023;
			if (head_2023 != null) {
				head_2023.prev_2023 = new_node_2023; }
			head_2023 = new_node_2023;
			return head_2023; }
		NodeDLL_2511532023 curr_2023 = head_2023;
		for (int i = 1; i < pos_2023 - 1 && curr_2023 != null; ++i) {
			curr_2023 = curr_2023.next_2023; }
			if (curr_2023 == null) {
				System.out.println("Posisi tidak ada");
				return head_2023; }
				new_node_2023.prev_2023 = curr_2023;
				new_node_2023.next_2023 = curr_2023.next_2023;
				curr_2023.next_2023 = new_node_2023;
						if (new_node_2023.next_2023 != null) {
							new_node_2023.next_2023.prev_2023 = new_node_2023; }
				return head_2023;
				}
			public static void printList_2023(NodeDLL_2511532023 head_2023) {
				NodeDLL_2511532023 curr_2023 = head_2023;
				while (curr_2023 != null) {
						System.out.print(curr_2023.data_2023 + " <-> ");
						curr_2023 = curr_2023.next_2023;
					}
					System.out.println();
				}
			public static void main(String[] args) {
			// Membuat dll 2 <-> 3 <-> 5
			NodeDLL_2511532023 head_2023 = new NodeDLL_2511532023(2);
			head_2023.next_2023 = new NodeDLL_2511532023(3);
			head_2023.next_2023.prev_2023 = head_2023;
			head_2023.next_2023.next_2023 = new NodeDLL_2511532023(5);
			head_2023.next_2023.next_2023.prev_2023 = head_2023.next_2023;
			// Cetak DLL awal
			System.out.print("DLL Awal: ");
			printList_2023(head_2023);
			// Tambah 1 di awal
			head_2023 = insertBegin_2023(head_2023, 1);
			System.out.print("Simpul 1 ditambah di awal: ");
			printList_2023(head_2023);
			// Tambah 6 di akhir
			System.out.print("Simpul 6 ditambah di akhir: ");
			int data_2023 = 6;
			head_2023 = insertEnd_2023(head_2023, data_2023);
			printList_2023(head_2023);
			// Menambah node 4 di posisi 4
			System.out.print("Tambah node 4 di posisi 4: ");
			int data2_2023 = 4;
			int pos_2023 = 4;
			head_2023 = insertAtPosition_2023(head_2023, pos_2023, data2_2023);
			printList_2023(head_2023);
			}	
	}