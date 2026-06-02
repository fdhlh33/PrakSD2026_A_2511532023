package pekan8_2511532023;

public class MergeSort_2511532023 {
	void merge_2023(int arr_2023[], int l_2023, int m_2023, int r_2023) {
		// Find sizes of two subarrays to be merged
		int n1_2023 = m_2023 - l_2023 + 1;
		int n2_2023 = r_2023 - m_2023;
		/* Create temp arrays */
		int L_2023[] = new int[n1_2023];
		int R_2023[] = new int[n2_2023];
		/* Copy data to temp arrays */
		for (int i_2023 = 0; i_2023 < n1_2023; ++i_2023)
			L_2023[i_2023] = arr_2023[l_2023 + i_2023];
		for (int j_2023 = 0; j_2023 < n2_2023; ++j_2023)
			R_2023[j_2023] = arr_2023[m_2023 + 1 + j_2023];
		int i_2023 = 0, j_2023 = 0;
		// Initial index of merged subarray array
		int k_2023 = l_2023;
		while (i_2023 < n1_2023 && j_2023 < n2_2023) {
			if (L_2023[i_2023] <= R_2023[j_2023]) {
				arr_2023[k_2023] = L_2023[i_2023];
				i_2023++;
			} else {
				arr_2023[k_2023] = R_2023[j_2023];
				j_2023++;
			}
			k_2023++;
		}
		/* Copy remaining elements of L[] if any */
		while (i_2023 < n1_2023) {
			arr_2023[k_2023] = L_2023[i_2023];
			i_2023++;
			k_2023++;
		}
		/* Copy remaining elements of R[] if any */
		while (j_2023 < n2_2023) {
			arr_2023[k_2023] = R_2023[j_2023];
			j_2023++;
			k_2023++;
		}
	}
	void sort_2023(int arr_2023[], int l_2023, int r_2023) {
		if (l_2023 < r_2023) {
			// Find the middle point
			int m_2023 = (l_2023 + r_2023) / 2;
			// Sort first and second halves
			sort_2023(arr_2023, l_2023, m_2023);
			sort_2023(arr_2023, m_2023 + 1, r_2023);
			// Merge the sorted halves
			merge_2023(arr_2023, l_2023, m_2023, r_2023);
		}
	}
	/* A utility function to print array of size n */
	static void printArray_2023(int arr_2023[]) {
		int n_2023 = arr_2023.length;
		for (int i_2023 = 0; i_2023 < n_2023; ++i_2023)
			System.out.print(arr_2023[i_2023] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr_2023[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Sebelum terurut: ");
		printArray_2023(arr_2023);
		MergeSort_2511532023 ob_2023 = new MergeSort_2511532023();
		ob_2023.sort_2023(arr_2023, 0, arr_2023.length - 1);
		System.out.println("\nSesudah terurut menggunakan merge Sort");
		printArray_2023(arr_2023);
	}
}