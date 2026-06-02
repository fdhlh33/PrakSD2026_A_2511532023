package pekan8_2511532023;

public class ShellSort_2511532023 {
	public static void shellSort_2023(int[] A_2023) {
		int n_2023 = A_2023.length;
		int gap_2023 = n_2023/2;
		while (gap_2023 > 0) {
			for (int i_2023 = gap_2023; i_2023 < n_2023; i_2023++) {
				int temp_2023 = A_2023[i_2023];
				int j_2023 = i_2023;
				while (j_2023 >= gap_2023 && A_2023[j_2023 - gap_2023] > temp_2023) {
					A_2023[j_2023] = A_2023[j_2023 - gap_2023];
					j_2023 = j_2023 - gap_2023;
				}
				A_2023[j_2023] = temp_2023;
			}
			gap_2023 = gap_2023/2;
		}
	}
	public static void main(String[] args) {
		int[] data_2023 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum              :");
		printArray_2023(data_2023);
		
		shellSort_2023(data_2023);
		
		System.out.print("Sesudah (Shell Sort) :");
		printArray_2023(data_2023);
	}
	public static void printArray_2023(int[] arr_2023) {
		for (int i_2023 : arr_2023) System.out.print(i_2023 + " ");
		System.out.println();
	}
}