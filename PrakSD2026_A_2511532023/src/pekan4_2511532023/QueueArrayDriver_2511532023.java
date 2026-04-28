package pekan4_2511532023;

public class QueueArrayDriver_2511532023 {
	public static void main(String[] args) {
		QueueArray_2511532023 queue_2023 = new QueueArray_2511532023(1000);
		queue_2023.enqueue_2023(10);
		queue_2023.enqueue_2023(20);
		queue_2023.enqueue_2023(30);
		queue_2023.enqueue_2023(40);
		System.out.println("Item di depan " + queue_2023.front_2023());
		System.out.println("Item paling belakang " + queue_2023.rear_2023());
		System.out.println("Tampilan queue");
		queue_2023.display_2023();
		System.out.println();
		System.out.println(queue_2023.dequeue_2023() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue_2023.front_2023());
		System.out.println("Item di belakang: " + queue_2023.rear_2023());
		System.out.println("Tampilan queue setelah satu data dihapus");
		queue_2023.display_2023();
	}

}
