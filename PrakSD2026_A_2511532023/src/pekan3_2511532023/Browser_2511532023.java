package pekan3_2511532023;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2511532023 {
	public static void main(String[] args) {
		Stack<Website_2511532023> history = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int pilihan;
		
		do {
			System.out.println("\n=== Browser History NIM: 2511532023 ===");
			System.out.println("1. Kunjungi Website (Push)");
			System.out.println("2. Tombol Back (Pop)");
			System.out.println("3. Lihat Halaman Aktif (Peek)");
			System.out.println("4. Keluar");
			System.out.print("Pilihan: ");
			pilihan = sc.nextInt();
			sc.nextLine();
			
			switch (pilihan) {
			case 1:
				System.out.print("Masukkan Judul: ");
				String judul = sc.nextLine();
				
				System.out.print("Masukkan URL: ");
				String url = sc.nextLine();
				
				history.push(new Website_2511532023(judul, url));
				System.out.println("Berhasil mengunjungi halaman!");
				break;
				
			case 2:
				if (history.isEmpty()) {
					System.out.println("Gagal Kembali! Riwayat browser saat ini masih kosong.");
				} else {
					Website_2511532023 halamanDihapus = history.pop();
					System.out.println("Berhasil Kembali! Anda telah meninggalkan halaman: " + halamanDihapus.getJudul_2023());
				}
				break;
				
			case 3:
				if (history.isEmpty()) {
					System.out.println("Belum ada website yang sedang dibuka.");
				} else {
					Website_2511532023 halamanAktif = history.peek();
					System.out.println("\n--- Halaman Saat Ini ---");
					System.out.println("Judul : " + halamanAktif.getJudul_2023());
					System.out.println("URL   : " + halamanAktif.getUrl_2023());
					System.out.println("Total riwayat tersimpan: " + history.size() + " halaman.");
				}
				break;
				
			case 4:
				System.out.println("Menutup browser.");
				break;
					
			default:
				System.out.println("Pilihan tidak valid. Silakan coba lagi.");
			}
		} while (pilihan != 4);
		sc.close();
	}
}