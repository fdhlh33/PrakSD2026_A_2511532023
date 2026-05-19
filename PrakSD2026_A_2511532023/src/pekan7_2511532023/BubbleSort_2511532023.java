package pekan7_2511532023;

public class BubbleSort_2511532023 {
	public static void bubbleSort_2023(int[] arr_2023) {
		int n_2023 = arr_2023.length;
		for (int i_2023 = 0; i_2023 < n_2023; i_2023++) {
			for (int j_2023 = 0; j_2023 < n_2023 - i_2023 - 1; j_2023++) {
				if (arr_2023[j_2023] > arr_2023[j_2023 + 1]) {
					int temp_2023 = arr_2023[j_2023];
					arr_2023[j_2023] = arr_2023[j_2023 + 1];
					arr_2023[j_2023 + 1] = temp_2023;
				// System.out.println("Data: " + arr_2023[j_2023] + " " + arr_2023[j_2023 + 1]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr_2023[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2023 = arr_2023.length;
		System.out.printf("Array yang belum terurut:");
		for (int i_2023 = 0; i_2023 < n_2023; i_2023++)
			System.out.print(arr_2023[i_2023] + " ");
		System.out.println("");
		bubbleSort_2023(arr_2023);
		System.out.printf("Array yang terurut menggunakan BubbleSort:");
		for (int i_2023 = 0; i_2023 < n_2023; i_2023++)
			System.out.print(arr_2023[i_2023] + " ");
		System.out.println("");	}
}