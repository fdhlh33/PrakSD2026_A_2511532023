import java.util.Scanner;

public class AntrianLoket_2511532023 {
    // 1. Deklarasi Variabel (Sesuai ketentuan, ditambah akhiran _2023)
    int max_2023; // Kapasitas maksimal array
    int front_2023; // Indeks depan
    int rear_2023; // Indeks belakang
    String[] queue_2023; // Array penyimpan data pelanggan bertipe Teks (String)

    // Constructor untuk inisialisasi antrean
    public AntrianLoket_2511532023(int ukuran_2023) {
        max_2023 = ukuran_2023;
        queue_2023 = new String[max_2023];
        front_2023 = 0; // Depan selalu di indeks 0
        rear_2023 = -1; // Belakang disetel -1 sebagai tanda kosong
    }

    // Method mengecek apakah antrean kosong
    boolean isEmpty_2023() {
        return rear_2023 == -1;
    }

    // Method mengecek apakah antrean penuh
    boolean isFull_2023() {
        return rear_2023 == max_2023 - 1;
    }

    // Method menambah data (Enqueue)
    void enqueue_2023(String nama_2023) {
        if (isFull_2023()) {
            System.out.println("Antrian penuh!");
        } else {
            rear_2023++; // Posisi belakang mundur 1 langkah
            queue_2023[rear_2023] = nama_2023; // Masukkan nama pelanggan ke posisi tersebut
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Method menghapus data terdepan (Dequeue) dengan logika Geser Kiri
    void dequeue_2023() {
        if (isEmpty_2023()) {
            System.out.println("Antrian kosong!");
        } else {
            String dihapus_2023 = queue_2023[front_2023]; // Ambil nama di posisi 0
            System.out.println(dihapus_2023 + " telah dilayani");
            
            // Logika sangat sederhana: Geser semua data di belakang maju 1 langkah
            for (int i = 0; i < rear_2023; i++) {
                queue_2023[i] = queue_2023[i + 1];
            }
            rear_2023--; // Kurangi posisi belakang karena total orang berkurang
        }
    }

    // Method menampilkan isi antrean
    void display_2023() {
        if (isEmpty_2023()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = 0; i <= rear_2023; i++) {
                System.out.println((i + 1) + ". " + queue_2023[i]); // i+1 agar nomor mulai dari 1
            }
        }
    }

    // Method membalikkan posisi (Reverse) antrean
    void reverse_2023() {
        if (isEmpty_2023()) {
            System.out.println("Antrian kosong!");
        } else {
            int awal_2023 = 0;
            int akhir_2023 = rear_2023;
            // Logika tukar menukar (Swap) dari ujung ke ujung menuju tengah
            while (awal_2023 < akhir_2023) {
                String temp_2023 = queue_2023[awal_2023];
                queue_2023[awal_2023] = queue_2023[akhir_2023];
                queue_2023[akhir_2023] = temp_2023;
                awal_2023++;
                akhir_2023--;
            }
            // Sesuai contoh output tugas, setelah Reverse langsung tampilkan data
            display_2023();
        }
    }

    // Method utama (Main) untuk menjalankan menu program
    public static void main(String[] args) {
        Scanner input_2023 = new Scanner(System.in);
        // Kita buat kapasitas antrean 10 orang (bisa diubah sesuai kebutuhan)
        AntrianLoket_2511532023 loket_2023 = new AntrianLoket_2511532023(10); 
        int pilihan_2023 = 0;

        while (pilihan_2023 != 5) {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_2023 = input_2023.nextInt();
            input_2023.nextLine(); // Membersihkan buffer enter bawaan Scanner

            if (pilihan_2023 == 1) {
                System.out.print("Masukkan nama pelanggan: ");
                String nama_2023 = input_2023.nextLine();
                loket_2023.enqueue_2023(nama_2023);
            } else if (pilihan_2023 == 2) {
                loket_2023.dequeue_2023();
            } else if (pilihan_2023 == 3) {
                loket_2023.display_2023();
            } else if (pilihan_2023 == 4) {
                loket_2023.reverse_2023();
            } else if (pilihan_2023 == 5) {
                System.out.println("Program selesai");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        input_2023.close();
    }
}