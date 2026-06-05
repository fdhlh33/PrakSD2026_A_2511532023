package pekan8_2511532023;

import java.util.Scanner;

public class Sorting_2511532023 {
    // Array dataLagu dengan kapasitas maks 20 lagu
    Lagu_2511532023[] dataLagu_2023 = new Lagu_2511532023[20];
    int jumlahLagu_2023 = 0;

    // Method untuk mengisi data awal, min 7 lagu
    public void inputData_2023() {
        dataLagu_2023[0] = new Lagu_2511532023("Mio Cristo Piange Diamanti", "Artist A", 270);
        dataLagu_2023[1] = new Lagu_2511532023("La Rumba Del Perdon", "Artist B", 252);
        dataLagu_2023[2] = new Lagu_2511532023("La Perla", "Artist C", 196);
        dataLagu_2023[3] = new Lagu_2511532023("A Sky Full of Stars", "Coldplay", 268);
        dataLagu_2023[4] = new Lagu_2511532023("Viva La Vida", "Coldplay", 242);
        dataLagu_2023[5] = new Lagu_2511532023("Bohemian Rhapsody", "Queen", 354);
        dataLagu_2023[6] = new Lagu_2511532023("Yellow", "Coldplay", 266);
        
        jumlahLagu_2023 = 7;
    }

    // Method menampilkan data sebelum dan sesudah sorting
    public void tampilData_2023() {
        for (int i = 0; i < jumlahLagu_2023; i++) {
            System.out.println((i + 1) + ". " + dataLagu_2023[i].judul_2023 + " - " + dataLagu_2023[i].durasi_2023 + " detik");
        }
    }

    // Algoritma 1: Shell Sort (Judul A-Z)
    public void shellSort_2023() {
        int n_2023 = jumlahLagu_2023;
        
        for (int gap_2023 = n_2023 / 2; gap_2023 > 0; gap_2023 = gap_2023 / 2) {
            for (int i = gap_2023; i < n_2023; i++) {
                Lagu_2511532023 temp_2023 = dataLagu_2023[i];
                int j = i;
                
                // Menggeser elemen yang lebih besar ke kanan
                while (j >= gap_2023 && dataLagu_2023[j - gap_2023].judul_2023.compareToIgnoreCase(temp_2023.judul_2023) > 0) {
                    dataLagu_2023[j] = dataLagu_2023[j - gap_2023];
                    j = j - gap_2023;
                }
                
                // Meletakkan elemen pada posisi yang benar
                dataLagu_2023[j] = temp_2023;
            }
        }
    }

    // Algoritma 2: Quick Sort (Durasi Ascending)
    public void quickSort_2023(int low_2023, int high_2023) {
        if (low_2023 < high_2023) {
            int pi_2023 = partition_2023(low_2023, high_2023);
            
            // Rekursif mengurutkan bagian kiri dan kanan pivot
            quickSort_2023(low_2023, pi_2023 - 1);
            quickSort_2023(pi_2023 + 1, high_2023);
        }
    }

    public int partition_2023(int low_2023, int high_2023) {
        int pivot = dataLagu_2023[high_2023].durasi_2023; // pivot di elemen paling kanan
        int i = (low_2023 - 1); // index untuk elemen yang lebih kecil
        
        for (int j = low_2023; j < high_2023; j++) {
            // Jika durasi saat ini < pivot
            if (dataLagu_2023[j].durasi_2023 < pivot) {
                i++;
                // Swap dataLagu[i] dengan dataLagu[j]
                Lagu_2511532023 temp = dataLagu_2023[i];
                dataLagu_2023[i] = dataLagu_2023[j];
                dataLagu_2023[j] = temp;
            }
        }
        Lagu_2511532023 temp = dataLagu_2023[i + 1];
        dataLagu_2023[i + 1] = dataLagu_2023[high_2023];
        dataLagu_2023[high_2023] = temp;
        
        return i + 1; // kembalikan posisi pivot
    }

    // Algoritma 3: Merge Sort (Judul A-Z)
    public void mergeSort_2023(int left_2023, int right_2023) {
        if (left_2023 < right_2023) {
            int mid_2023 = left_2023 + (right_2023 - left_2023) / 2;
            
            mergeSort_2023(left_2023, mid_2023);
            mergeSort_2023(mid_2023 + 1, right_2023);
            
            merge_2023(left_2023, mid_2023, right_2023);
        }
    }

    public void merge_2023(int left_2023, int mid_2023, int right_2023) {
        int n1_2023 = mid_2023 - left_2023 + 1;
        int n2_2023 = right_2023 - mid_2023;
        
        Lagu_2511532023[] L = new Lagu_2511532023[n1_2023];
        Lagu_2511532023[] R = new Lagu_2511532023[n2_2023];
        
        for (int i_2023 = 0; i_2023 < n1_2023; i_2023++) {
            L[i_2023] = dataLagu_2023[left_2023 + i_2023];
        }
        for (int j_2023 = 0; j_2023 < n2_2023; j_2023++) {
            R[j_2023] = dataLagu_2023[mid_2023 + 1 + j_2023];
        }
        
        int i_2023 = 0, j_2023 = 0;
        int k_2023 = left_2023;
        
        while (i_2023 < n1_2023 && j_2023 < n2_2023) {
            if (L[i_2023].judul_2023.compareToIgnoreCase(R[j_2023].judul_2023) <= 0) {
                dataLagu_2023[k_2023] = L[i_2023];
                i_2023++;
            } else {
                dataLagu_2023[k_2023] = R[j_2023];
                j_2023++;
            }
            k_2023++;
        }
        
        while (i_2023 < n1_2023) {
            dataLagu_2023[k_2023] = L[i_2023];
            i_2023++;
            k_2023++;
        }
        
        while (j_2023 < n2_2023) {
            dataLagu_2023[k_2023] = R[j_2023];
            j_2023++;
            k_2023++;
        }
    }
    
    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorting_2511532023 program_2023 = new Sorting_2511532023();
        
        while (true) {
            // Memasukkan ulang data awal setiap kali loop berjalan
            program_2023.inputData_2023();

            System.out.println("\n=== Sorting Playlist NIM: 2511532023 ===");
            System.out.print("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
            int pilihan_2023 = sc.nextInt();

            // Jika pilihan valid (1, 2, atau 3), tampilkan data awal
            if (pilihan_2023 >= 1 && pilihan_2023 <= 3) {
                System.out.println("\nData Sebelum Sorting:");
                program_2023.tampilData_2023();
            }

            // Logika pemilihan algoritma
            if (pilihan_2023 == 1) {
                program_2023.shellSort_2023();
                System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
                program_2023.tampilData_2023();
            } else if (pilihan_2023 == 2) {
                program_2023.quickSort_2023(0, program_2023.jumlahLagu_2023 - 1);
                System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
                program_2023.tampilData_2023();
            } else if (pilihan_2023 == 3) {
                program_2023.mergeSort_2023(0, program_2023.jumlahLagu_2023 - 1);
                System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
                program_2023.tampilData_2023();
            } else {
                System.out.println("\nPilihan tidak valid! Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}