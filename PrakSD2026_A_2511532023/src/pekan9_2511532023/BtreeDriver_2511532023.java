package pekan9_2511532023;

public class BtreeDriver_2511532023 {
	public static void main(String[] args) {
		// Membuat pohon
		BTree_2511532023 tree = new BTree_2511532023();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree.countNodes_2023());
		// Menambahkan simpul data 1
		Node_2511532023 root = new Node_2511532023(1);
		// Menjadikan simpul 1 sebagai root
		tree.setRoot_2023(root);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree.countNodes_2023());
		Node_2511532023 node2_2023 = new Node_2511532023(2);
		Node_2511532023 node3_2023 = new Node_2511532023(3);
		Node_2511532023 node4_2023 = new Node_2511532023(4);
		Node_2511532023 node5_2023 = new Node_2511532023(5);
		Node_2511532023 node6_2023 = new Node_2511532023(6);
		Node_2511532023 node7_2023 = new Node_2511532023(7);
		Node_2511532023 node8_2023 = new Node_2511532023(8);
		Node_2511532023 node9_2023 = new Node_2511532023(9);
		root.setLeft_2023(node2_2023);
		node2_2023.setLeft_2023(node4_2023);
		node2_2023.setRight_2023(node5_2023);
		node4_2023.setRight_2023(node8_2023);
		root.setRight_2023(node3_2023);
		node3_2023.setLeft_2023(node6_2023);
		node3_2023.setRight_2023(node7_2023);
		node6_2023.setLeft_2023(node9_2023);
		
		// Set root
		tree.setCurrent(tree.getRoot_2023());
		System.out.println("Menampilkan simpul terakhir: ");
		System.out.println(tree.getCurrent_2023().getData_2023());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree.countNodes_2023());
		System.out.println("InOrder: ");
		tree.printInorder_2023();
		System.out.println("\nPreorder: ");
		tree.printPreorder_2023();
		System.out.println("\nPostorder: ");
		tree.printPostorder_2023();
		System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
		tree.print_2023();
	}
}