package pekan7_2511532023;

public class InsertionSort_2511532023 {
	public static void insertionSort_2023(int[] arr_2023) {
		int n_2023 = arr_2023.length;
		for (int i_2023 = 1; i_2023 < n_2023; i_2023++) {
			int key_2023 = arr_2023[i_2023];
			int j_2023 = i_2023 - 1;
			while (j_2023 >= 0 && arr_2023[j_2023] > key_2023) {
				arr_2023[j_2023 + 1] = arr_2023[j_2023];
				j_2023--; }
			arr_2023[j_2023 + 1] = key_2023;	}
	}
	public static void main(String[] args) {
		int arr_2023[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2023 = arr_2023.length;
		System.out.printf("Array yang belum terurut:\n");
		for (int i_2023 = 0; i_2023 < n_2023; i_2023++)
			System.out.print(arr_2023[i_2023] + " ");
		System.out.println("");
		insertionSort_2023(arr_2023);
		System.out.printf("Array yang terurut:\n");
		for (int i_2023 = 0; i_2023 < n_2023; i_2023++)
			System.out.print(arr_2023[i_2023] + " ");
		System.out.println("");	}
}