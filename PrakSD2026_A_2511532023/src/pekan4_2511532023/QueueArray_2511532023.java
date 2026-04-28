package pekan4_2511532023;

public class QueueArray_2511532023 {
	int front_2023, rear_2023, size_2023;
	int capacity_2023;
	int array_2023[];
	
	public QueueArray_2511532023(int capacity_2023) {
		this.capacity_2023 = capacity_2023;
		front_2023 = this.size_2023 = 0;
		rear_2023 = capacity_2023 - 1;
		array_2023 = new int[this.capacity_2023];
	}
	
	boolean isFull(QueueArray_2511532023 queue) {
		return (queue.size_2023 == queue.capacity_2023);
	}
	
	boolean isEmpty(QueueArray_2511532023 queue) {
		return (queue.size_2023 == 0);
	}
	
	void enqueue_2023(int item) {
		if (isFull(this))
			return;
		this.rear_2023 = (this.rear_2023 + 1) % this.capacity_2023;
		this.array_2023[this.rear_2023] = item;
		this.size_2023 = this.size_2023 + 1;
		System.out.println(item + " enqueued to queue");
	}
	
	int dequeue_2023() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item_2023 = this.array_2023[this.front_2023];
		this.front_2023 = (this.front_2023 + 1) % this.capacity_2023;
		this.size_2023 = this.size_2023 - 1;
		return item_2023;
	}
	int front_2023() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2023[this.front_2023];
	}
	int rear_2023() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2023[this.rear_2023];
	}
		// Mencetak elemen antrian
	void display_2023() {
		int i;
		if (front_2023 == rear_2023) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// Kunjungi dari belakang dan cetak
		for (i = front_2023; i < rear_2023; i++) {
			System.out.printf(" %d <-- ", array_2023[i]);
		}
		return;
	}
}