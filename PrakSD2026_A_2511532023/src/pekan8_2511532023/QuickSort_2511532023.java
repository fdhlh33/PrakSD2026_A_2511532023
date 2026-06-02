package pekan8_2511532023;

public class QuickSort_2511532023 {
	static void swap_2023(int[] arr_2023, int i_2023, int j_2023) {
		int temp_2023 = arr_2023[i_2023];
		arr_2023[i_2023] = arr_2023[j_2023];
		arr_2023[j_2023] = temp_2023;
	}
	// Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_2023(int[] arr_2023, int low_2023, int high_2023) {
		int mid_2023 = low_2023 + (high_2023 - low_2023) / 2;
		
		// Urutkan elemen low, mid, dan high
		if (arr_2023[low_2023] > arr_2023[mid_2023]) {
			swap_2023(arr_2023, low_2023, mid_2023);
		}
		if (arr_2023[low_2023] > arr_2023[high_2023]) {
			swap_2023(arr_2023, low_2023, high_2023);
		}
		if (arr_2023[mid_2023] > arr_2023[high_2023]) {
			swap_2023(arr_2023, mid_2023, high_2023);
		}
		swap_2023(arr_2023, mid_2023, high_2023);
	}
	static int partition_2023(int[] arr_2023, int low_2023, int high_2023) {
		// Panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_2023(arr_2023, low_2023, high_2023);
		
		int pivot_2023 = arr_2023[high_2023]; // Sekarang arr[high] sudah berisi nilai median
		int i_2023 = (low_2023 - 1);
		
		for (int j_2023 = low_2023; j_2023 <= high_2023 - 1; j_2023++) {
			// Jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_2023[j_2023] < pivot_2023) {
				// Increment indeks elemen yang lebih kecil
				i_2023++;
				swap_2023(arr_2023, i_2023, j_2023);
			}
		}
		swap_2023(arr_2023, i_2023 + 1, high_2023);
		return (i_2023 + 1);
	}
	static void quickSort_2023(int[] arr_2023, int low_2023, int high_2023) {
		if (low_2023 < high_2023) {
			int pi_2023 = partition_2023(arr_2023, low_2023, high_2023);
			quickSort_2023(arr_2023, low_2023, pi_2023 - 1);
			quickSort_2023(arr_2023, pi_2023 + 1, high_2023);
		}
	}
	public static void printArr_2023(int[] arr_2023) {
		for (int i_2023 = 0; i_2023 < arr_2023.length; i_2023++) {
			System.out.print(arr_2023[i_2023] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr_2023 = { 10, 7, 8, 9, 1, 5};
		int N_2023 = arr_2023.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2023(arr_2023);
		
		quickSort_2023(arr_2023, 0, N_2023 - 1);
		
		System.out.print("Data terurut quicksort: ");
		printArr_2023(arr_2023);
	}
}