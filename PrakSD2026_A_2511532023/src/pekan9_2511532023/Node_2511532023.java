package pekan9_2511532023;

public class Node_2511532023 {
	int data_2023;
	Node_2511532023 left_2023;
	Node_2511532023 right_2023;
	public Node_2511532023(int data_2023) {
		this.data_2023 = data_2023;
		left_2023 = null;
		right_2023 = null;
	}
	public void setLeft_2023(Node_2511532023 node_2023) {
		if (left_2023 == null)
			left_2023 = node_2023;
	}
	public void setRight_2023(Node_2511532023 node_2023) {
		if (right_2023 == null)
			right_2023 = node_2023;
	}
	public Node_2511532023 getLeft_2023() {
		return left_2023;
	}
	public Node_2511532023 getRight_2023() {
		return right_2023;
	}
	public int getData_2023() {
		return data_2023;
	}
	public void setData_2023(int data_2023) {
		this.data_2023 = data_2023;
	}
	
	void printPreorder_2023(Node_2511532023 node_2023) {
		if (node_2023 == null)
			return;
		System.out.print(node_2023.data_2023 + " ");
		printPreorder_2023(node_2023.left_2023);
		printPreorder_2023(node_2023.right_2023);
	}
	void printPostorder_2023(Node_2511532023 node_2023) {
		if (node_2023 == null)
			return;
		printPostorder_2023(node_2023.left_2023);
		printPostorder_2023(node_2023.right_2023);
		System.out.print(node_2023.data_2023 + " ");
	}
	void printInorder_2023(Node_2511532023 node_2023) {
		if (node_2023 == null)
			return;
		printInorder_2023(node_2023.left_2023);
		System.out.print(node_2023.data_2023 + " ");
		printInorder_2023(node_2023.right_2023);
	}
	public String print_2023() {
		return this.print_2023("", true, "");
	}
	public String print_2023(String prefix_2023, boolean isTail_2023, String sb_2023) {
		if (right_2023 != null) {
			right_2023.print_2023(prefix_2023 + (isTail_2023 ? "|   " : "   "), false, sb_2023);
		}
		System.out.println(prefix_2023 + (isTail_2023 ? "\\-- " : "/-- ") + data_2023);
		if (left_2023 != null) {
			left_2023.print_2023(prefix_2023 + (isTail_2023 ? "   " : "|   "), true, sb_2023);
		}
		return sb_2023;
	}
}