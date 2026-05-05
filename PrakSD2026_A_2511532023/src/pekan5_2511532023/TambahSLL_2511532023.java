package pekan5_2511532023;

public class TambahSLL_2511532023 {
	public static NodeSLL_2511532023 insertAtFront_2023(NodeSLL_2511532023 head_2023, int value_2023) {
		NodeSLL_2511532023 new_node = new NodeSLL_2511532023(value_2023);
		new_node.next_2023 = head_2023;
		return new_node;
	} 
	// Fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511532023 insertAtEnd_2023(NodeSLL_2511532023 head_2023, int value_2023) {
		// Buat sebuah node dengan sebuah nilai
		NodeSLL_2511532023 newNode = new NodeSLL_2511532023(value_2023);
		// Jika list kosong maka node jadi head
		if (head_2023 == null) {
			return newNode;
		}
		// Simpan head ke variabel sementara
		NodeSLL_2511532023 last_2023 = head_2023;
		// Telusuri ke node akhir
		while (last_2023.next_2023 != null) {
			last_2023 = last_2023.next_2023;
		}
		// Ubah pointer
		last_2023.next_2023 = newNode;
		return head_2023;
	}
	static NodeSLL_2511532023 GetNode_2023(int data_2023) {
		return new NodeSLL_2511532023(data_2023);
	}
	static NodeSLL_2511532023 insertPos(NodeSLL_2511532023 headNode_2023, int position_2023, int value_2023) {
		NodeSLL_2511532023 head_2023 = headNode_2023;
		if (position_2023 < 1)
			System.out.print("Invalid position");
		if (position_2023 == 1) {
			NodeSLL_2511532023 new_node = new NodeSLL_2511532023(value_2023);
			new_node.next_2023 = head_2023;
			return new_node;
		} else {
			while (position_2023-- != 0) {
				if (position_2023 == 1) {
					NodeSLL_2511532023 newNode = GetNode_2023(value_2023);
					newNode.next_2023 = headNode_2023.next_2023;
					headNode_2023.next_2023 = newNode;
					break;
				}
				headNode_2023 = headNode_2023.next_2023;
		}
		if (position_2023 != 1)
			System.out.print("Posisi di luar jangkauan");
		} return head_2023; }
		public static void printList(NodeSLL_2511532023 head_2023) {
			NodeSLL_2511532023 curr = head_2023;
		while (curr.next_2023 != null) {
			System.out.print(curr.data_2023 + "-->");
			curr = curr.next_2023;
		}
		if (curr.next_2023 == null) {
			System.out.print(curr.data_2023);
			System.out.println(); }
		}
		public static void main(String[] args) {
			// Buat linked list 2->3->5->6
			NodeSLL_2511532023 head_2023 = new NodeSLL_2511532023(2);
			head_2023.next_2023 = new NodeSLL_2511532023(3);
			head_2023.next_2023.next_2023 = new NodeSLL_2511532023(5);
			head_2023.next_2023.next_2023.next_2023 = new NodeSLL_2511532023(6);
			// Cetak list asli
			System.out.print("Senarai berantai awal : ");
			printList(head_2023);
			// Tambahkan node baru di depan 
			System.out.print("Tambah 1 simpul di depan : ");
			int data_2023 = 1;
			head_2023 = insertAtFront_2023(head_2023, data_2023);
			// Cetak update list
			printList(head_2023);
			// Tambahkan node baru di belakang
			System.out.print("Tambah 1 simpul ke belakang : ");
			int data2 = 7;
			head_2023 = insertAtEnd_2023(head_2023, data2);
			// Cetak update list
			printList(head_2023);
			System.out.print("Tambah 1 simpul ke data 4 : ");
			int data3 = 4;
			int pos = 4;
			head_2023 = insertPos(head_2023, pos, data3);
			// Cetak update list
			printList(head_2023);
		}
	}