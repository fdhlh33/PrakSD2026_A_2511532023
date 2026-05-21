package pekan7_2511532023;

import java.util.ArrayList;

public class Sorting_2511532023 {
	
	// Insertion Sort
	public static String insertionSort_2023(ArrayList<Mahasiswa_2511532023> list) {
		StringBuilder log_2023 = new StringBuilder("=== INSERTION SORT ===\n");
		int n_2023 = list.size();
		
		for (int i_2023 = 1; i_2023 < n_2023; i_2023++) {
			Mahasiswa_2511532023 key_2023 = list.get(i_2023); // Data yang mau disisipkan
			int j_2023 = i_2023 - 1;
			
			// Geser data yang lebih besar ke kanan untuk memberi ruang bagi 'key'
			while (j_2023 >= 0 && list.get(j_2023).getNama_2023().compareToIgnoreCase(key_2023.getNama_2023()) > 0) {
				list.set(j_2023 + 1, list.get(j_2023));
				j_2023--;
			}
			// Sisipkan key
			list.set(j_2023 + 1, key_2023);
			
			// Simpan langkah ke String untuk GUI dan cetak ke console
			String langkah_2023 = "Langkah " + i_2023 + ": " + list.toString();
			log_2023.append(langkah_2023).append("\n");
			System.out.println(langkah_2023);
		}
		return log_2023.toString();
	}
	
	// Selection Sort
	public static String selectionSort_2023(ArrayList<Mahasiswa_2511532023> list) {
		StringBuilder log_2023 = new StringBuilder("=== SELECTION SORT ===\n");
		int n_2023 = list.size();
		
		for (int i_2023 = 0; i_2023 < n_2023 - 1; i_2023++) {
			int indexMin = i_2023; // Misal posisi i adalah yang terkecil sementara
			
			for(int j_2023 = i_2023 + 1; j_2023 < n_2023; j_2023++) {
				if (list.get(j_2023).getNama_2023().compareToIgnoreCase(list.get(indexMin).getNama_2023()) < 0) {
					indexMin = j_2023;
				}
			}
			// Tukar data di posisi i dengan data terkecil yang baru ditemukan.
			Mahasiswa_2511532023 temp_2023 = list.get(indexMin);
			list.set(indexMin,  list.get(i_2023));
			list.set(i_2023, temp_2023);
			
			// Simpan langkah ke String untuk GUI dan cetak ke console
            String langkah_2023 = "Pass " + (i_2023 + 1) + ": " + list.toString();
            log_2023.append(langkah_2023).append("\n");
            System.out.println(langkah_2023);
		}
		return log_2023.toString();
	}
	
	// Bubble Sort
	public static String bubbleSort_2023(ArrayList<Mahasiswa_2511532023> list) {
		StringBuilder log_2023 = new StringBuilder("=== BUBBLE SORT ===\n");
		int n_2023 = list.size();
		
		for(int i_2023 = 0; i_2023 < n_2023 - 1; i_2023++) {
			for(int j_2023 = 0; j_2023 < n_2023 - i_2023 - 1; j_2023++) {
				// Ambil nama dari mahasiswa posisi j dan j+1, lalu bandingkan
				if(list.get(j_2023).getNama_2023().compareToIgnoreCase(list.get(j_2023 + 1).getNama_2023()) > 0) {
					// Tukar posisi jika nama kiri lebih besar dari nama kanan
					Mahasiswa_2511532023 temp_2023 = list.get(j_2023);
					list.set(j_2023, list.get(j_2023 + 1));
					list.set(j_2023 + 1, temp_2023);
				}
			}
			// Simpan langkah ke String untuk GUI dan cetak ke console
			String langkah_2023 = "Pass " + (i_2023 + 1) + ": " + list.toString();
			log_2023.append(langkah_2023).append("\n");
			System.out.println(langkah_2023);
		}
		return log_2023.toString();
	}
}