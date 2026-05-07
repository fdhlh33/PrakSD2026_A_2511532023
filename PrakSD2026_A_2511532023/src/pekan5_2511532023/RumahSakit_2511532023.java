package pekan5_2511532023;

import java.util.Scanner;

public class RumahSakit_2511532023 {
	private Pasien_2511532023 head_2023; // Head linked list
    private int counterAntrian_2023; // Counter yang otomatis menambah nomor antrian berikutnya
    private int jumlahPasien_2023; // Menyimpan jumlah total pasien di antrian saat ini

    public RumahSakit_2511532023() {
        this.head_2023 = null;
        this.counterAntrian_2023 = 1;
        this.jumlahPasien_2023 = 0;
    }
    
    // 1. Daftar Pasien
    public void daftarkanPasien_2023(String namaPasien_2023, String keluhan_2023) {
        Pasien_2511532023 pasienBaru_2023 = new Pasien_2511532023(namaPasien_2023, keluhan_2023, counterAntrian_2023);
        
        // Jika list kosong, node baru langsung jadi head
        if (head_2023 == null) {
            head_2023 = pasienBaru_2023;
        } else {
            // Traverse sampai ke node paling akhir (tail)
            Pasien_2511532023 temp_2023 = head_2023;
            while (temp_2023.getNext_2023() != null) {
                temp_2023 = temp_2023.getNext_2023();
            }
            // Menyambungkan node terakhir dengan node baru
            temp_2023.setNext_2023(pasienBaru_2023);
        }
        
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counterAntrian_2023);
        counterAntrian_2023++; // Otomatis menambah nomor antrian untuk pasien berikutnya
        jumlahPasien_2023++;
    }
    
    // 2. Panggil Pasien
    public void panggilPasien_2023() {
        // Saat list kosong
        if (head_2023 == null) {
            System.out.println("Antrian kosong. Tidak ada pasien yang dapat dipanggil.");
            return;
        }
        
        // Mengambil data head sebelum dihapus
        Pasien_2511532023 pasienDipanggil_2023 = head_2023;
        
        System.out.println("\n=== Memanggil Pasien ===");
        System.out.println("Nomor Antrian : " + pasienDipanggil_2023.getNomorAntrian_2023());
        System.out.println("Nama Pasien   : " + pasienDipanggil_2023.getNamaPasien_2023());
        System.out.println("Keluhan       : " + pasienDipanggil_2023.getKeluhan_2023());
        
        // Head digeser ke node berikutnya
        head_2023 = head_2023.getNext_2023();
        jumlahPasien_2023--;
    }
    
    // 3. Tampilkan Antrian
    public void tampilkanAntrian_2023() {
        if (head_2023 == null) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.println("\n=== Daftar Antrian Pasien ===");
        Pasien_2511532023 temp_2023 = head_2023;
        int posisi_2023 = 1;
        
        // Menelusuri list dari head sampai null
        while (temp_2023 != null) {
            System.out.println("Posisi " + posisi_2023 + " | No. Antrian: " + temp_2023.getNomorAntrian_2023() + 
                               " | Nama: " + temp_2023.getNamaPasien_2023() + 
                               " | Keluhan: " + temp_2023.getKeluhan_2023());
            temp_2023 = temp_2023.getNext_2023();z
            posisi_2023++;
        }
    }
    
    // 4. Cari Pasien
    public void cariPasien_2023(String cariNama_2023) {
        if (head_2023 == null) {
            System.out.println("Antrian kosong. Pencarian dibatalkan.");
            return;
        }
        Pasien_2511532023 temp_2023 = head_2023;
        boolean ditemukan_2023 = false;
        int posisi_2023 = 1;

        while (temp_2023 != null) {
            if (temp_2023.getNamaPasien_2023().equalsIgnoreCase(cariNama_2023)) {
                System.out.println("\nPasien Ditemukan!");
                System.out.println("Nama Pasien   : " + temp_2023.getNamaPasien_2023());
                System.out.println("Nomor Antrian : " + temp_2023.getNomorAntrian_2023());
                System.out.println("Keluhan       : " + temp_2023.getKeluhan_2023());
                System.out.println("Posisi Antrian: " + posisi_2023);
                ditemukan_2023 = true;
                break;
            }
            temp_2023 = temp_2023.getNext_2023();
            posisi_2023++;
        }
        if (!ditemukan_2023) {
            System.out.println("Pasien dengan nama '" + cariNama_2023 + "' tidak ditemukan dalam antrian.");
        }
    }
    
    // 5. Cek Status ANtrian
    public void cekStatusAntrian_2023() {
        if (head_2023 == null) {
            System.out.println("Status Antrian: Kosong (0 pasien).");
        } else {
            System.out.println("\n=== Status Antrian ===");
            System.out.println("Total Pasien Menunggu: " + jumlahPasien_2023);
            System.out.println("Pasien Terdepan:");
            System.out.println("- Nama    : " + head_2023.getNamaPasien_2023());
            System.out.println("- Keluhan : " + head_2023.getKeluhan_2023());
            System.out.println("- No. Urut: " + head_2023.getNomorAntrian_2023());
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner sc_2023 = new Scanner(System.in);
        RumahSakit_2511532023 rs_2023 = new RumahSakit_2511532023();
        int pilihan_2023;

        do {
            System.out.println("\nAntrian Rumah Sakit NIM: 2511532023");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            pilihan_2023 = sc_2023.nextInt();
            sc_2023.nextLine();
            switch (pilihan_2023) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_2023 = sc_2023.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_2023 = sc_2023.nextLine();
                    rs_2023.daftarkanPasien_2023(nama_2023, keluhan_2023);
                    break;
                case 2:
                    rs_2023.panggilPasien_2023();
                    break;
                case 3:
                    rs_2023.tampilkanAntrian_2023();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari_2023 = sc_2023.nextLine();
                    rs_2023.cariPasien_2023(cari_2023);
                    break;
                case 5:
                    rs_2023.cekStatusAntrian_2023();
                    break;
                case 6:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_2023 != 6);

        sc_2023.close();
    }
}
