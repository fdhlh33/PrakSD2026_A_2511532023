package pekan9_2511532023;

public class BTree_2511532023 {
	private Node_2511532023 root_2023;
	private Node_2511532023 currentNode_2023;
	public BTree_2511532023() {
		root_2023 = null;
	}
	public boolean search_2023(int data_2023) {
		return search_2023(root_2023, data_2023);
	}
	private boolean search_2023(Node_2511532023 node_2023, int data_2023) {
		if (node_2023.getData_2023() == data_2023)
			return true;
		if (node_2023.getLeft_2023() != null)
			if (search_2023(node_2023.getLeft_2023(), data_2023))
				return true;
		if (node_2023.getRight_2023() != null)
			if (search_2023(node_2023.getRight_2023(), data_2023))
				return true;
		return false;
	}
	public void printInorder_2023() {
		root_2023.printInorder_2023(root_2023);
	}
	public void printPreorder_2023() {
		root_2023.printPreorder_2023(root_2023);
	}
	public void printPostorder_2023() {
		root_2023.printPostorder_2023(root_2023);
	}
	
	public Node_2511532023 getRoot_2023() {
		return root_2023;
	}
	
	public boolean isEmpty_2023() {
		return root_2023 == null;
	}
	public int countNodes_2023() {
		return countNodes_2023(root_2023);
	}
	
	private int countNodes_2023(Node_2511532023 node_2023) {
		int count_2023 = 1;
		if (node_2023 == null) {
			return 0;
		} else {
			count_2023 += countNodes_2023(node_2023.getLeft_2023());
			count_2023 += countNodes_2023(node_2023.getRight_2023());
			return count_2023;	
		}
	}
	
	public void print_2023() {
		root_2023.print_2023();
	}
	
	public Node_2511532023 getCurrent_2023() {
		return currentNode_2023;
	}
	
	public void setCurrent(Node_2511532023 node_2023) {
		this.currentNode_2023 = node_2023;
	}
	
	public void setRoot_2023(Node_2511532023 root_2023) {
		this.root_2023 = root_2023;
	}
}