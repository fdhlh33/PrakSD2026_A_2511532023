package pekan6_2511532023;

import java.util.Scanner;

public class Musik_2511532023 {
	// Deklarasi pointer head dan tail
	Lagu_2511532023 head_2023;
	Lagu_2511532023 tail_2023;
	
	// Konstruktor
	public Musik_2511532023() {
		this.head_2023 = null;
		this.tail_2023 = null;	}
	
	// 1. Menambah lagu baru di akhir playlist
	public void tambahLagu_2023(String judul_2023, String penyanyi_2023) {
		// Membuat objek node lagu baru
		Lagu_2511532023 laguBaru_2023 = new Lagu_2511532023(judul_2023, penyanyi_2023);
		// Jika playlist masih ksong
		if (head_2023 == null) {
			head_2023 = laguBaru_2023;
			tail_2023 = laguBaru_2023;	}
		// Jika sudah ada lagu, tambahkan di akhir
		else {
			tail_2023.next_2023 = laguBaru_2023;
			laguBaru_2023.prev_2023 = tail_2023;
			tail_2023 = laguBaru_2023;	}
		System.out.println("Lagu berhasil ditambahkan! \n");	}
	
	// 2. Menghapus Lagu pertama
	public void hapusLaguAwal_2023() {
		// Pengecekan agar program tidak error saat playlist kosong
		if (head_2023 == null) {
			System.out.println("Playlist kosong, tidak ada lagu yang bisa dihapus. \n");
			return;	}
		// Jika hanya ada satu lagu
		if (head_2023 == tail_2023) {
			head_2023 = null;
			tail_2023 = null;	}
		// Jika lagu > 1
		else {
			head_2023 = head_2023.next_2023;
			head_2023.prev_2023 = null;	}
		System.out.println("Lagu pertama berhasil dihapus!\n");	}
	
	// 3. Menampilkan semua lagu awal ke akhir (maju)
	public void tampilMaju_2023() {
		// Jika playlist kosong
		if (head_2023 == null) {
		System.out.println("Playlist masih kosong.\n");
		return;	}
	System.out.println("--- Playlist (Maju) ---");
	Lagu_2511532023 curr_2023 = head_2023;
	int no_2023 = 1;
	// Looping selaman node belum bernilai null
	while (curr_2023 != null) {
		System.out.println(no_2023 + ". " + curr_2023.getJudul_2023() + " - " + curr_2023.getPenyanyi_2023());
		curr_2023 = curr_2023.next_2023;
		no_2023++;	}
	System.out.println(); }
	
	// 4. Menampilkan semua lagu dari akhir ke awal (mundur)
	public void tampilMundur_2023() {
		// Jika playlist kosong
		if (tail_2023 == null) {
			System.out.println("Playlist masih kosong.\n");
			return;	}
		System.out.println("--- Playlist (Mundur) ---");
		Lagu_2511532023 curr_2023 = tail_2023;
		int no_2023 = 1;
		// Looping bergerak mundur menggunakan pointer prev
		while (curr_2023 != null) {
			System.out.println(no_2023 + ". " + curr_2023.getJudul_2023() + " - " + curr_2023.getPenyanyi_2023());
			curr_2023 = curr_2023.prev_2023;
			no_2023++;	}
		System.out.println(); }
	
	// 5. Mencari Lagu berdasarkan judul
	public void cariLagu_2023(String cariJudul_2023) {
		// Pengecekan awal jika playlist masih kosong
		if (head_2023 == null) {
			System.out.println("Playlist kosong, tidak dapat mencari lagu.\n");
			return; }
		Lagu_2511532023 curr_2023 = head_2023;
		boolean ditemukan_2023 = false;
		
		// Looping mengecek setiap lagu di playlist
		while (curr_2023 != null) {
			// Membandingkan teks judul
			if (curr_2023.getJudul_2023().equalsIgnoreCase(cariJudul_2023)) {
				System.out.println("Lagu ditemukan: " + curr_2023.getJudul_2023() + " oleh " + curr_2023.getPenyanyi_2023() + "\n");
				ditemukan_2023 = true;
				break;	}
			curr_2023 = curr_2023.next_2023;	}
		// Jika loop selesai tapi flag masih false (lagu tidak ada)
		if (!ditemukan_2023) {
			System.out.println("Lagu dengan judul '" + cariJudul_2023 + "' tidak ditemukan.\n");	}
	}
	// Main class
	public static void main(String[] args) {
		Scanner sc_2023 = new Scanner(System.in);
		Musik_2511532023 playlist_2023 = new Musik_2511532023();
		int pilihan_2023;
		
		do {
			// Menampilkan opsi menu
			System.out.println("=== Playlist Musik NIM: 2511532023 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar\n");
            System.out.print("Pilihan: ");
            
            pilihan_2023 = sc_2023.nextInt();
            sc_2023.nextLine();
            
            switch (pilihan_2023) {
            case 1:
            	System.out.print("Judul: ");
            	String judul_2023 = sc_2023.nextLine();
            	System.out.print("Penyanyi: ");
            	String penyanyi_2023 = sc_2023.nextLine();
            	playlist_2023.tambahLagu_2023(judul_2023, penyanyi_2023);
            	break;
            case 2:
            	playlist_2023.hapusLaguAwal_2023();
            	break;
            case 3:
            	playlist_2023.tampilMaju_2023();
            	break;
            case 4:
            	playlist_2023.tampilMundur_2023();
            	break;
            case 5:
            	System.out.print("Masukkan Judul Lagu yang dicari: ");
            	String cari_2023 = sc_2023.nextLine();
            	playlist_2023.cariLagu_2023(cari_2023);
            	break;
            case 6:
            	System.out.println("Keluar dari program playlist...");
            	break;
            default:
            	System.out.println("Pilihan tidak valid, silakan coba lagi.\n"); }
		} while (pilihan_2023 != 6);
		sc_2023.close();
	}
}