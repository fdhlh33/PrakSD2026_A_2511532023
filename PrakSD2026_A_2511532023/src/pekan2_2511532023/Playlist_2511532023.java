package pekan2_2511532023;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532023 {
	public static void main(String[] args) {
		ArrayList<Musik_2511532023> playlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int pilihan;
			
		do {
			System.out.println("\n=== Playlist Musik NIM: 2511532023 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Lihat Playlist");
			System.out.println("3. Hapus Lagu");
			System.out.println("4. Keluar");
			System.out.print("Pilihan: ");
			pilihan = sc.nextInt();
			sc.nextLine();
			
			switch (pilihan) {
			case 1:
				System.out.print("Masukkan Judul: ");
				String judul = sc.nextLine();
				
				System.out.print("Masukkan Penyanyi: ");
				String penyanyi = sc.nextLine();
				
				System.out.print("Masukkan Durasi (detik): ");
				int durasi = sc.nextInt();
				
				playlist.add(new Musik_2511532023(judul, penyanyi, durasi));
				System.out.println("Data berhasil ditambahkan!");
				break;
				
			case 2:
				System.out.println("\n--- Daftar Playlist Anda ---");
				System.out.println("Total lagu saat ini " + playlist.size() + " lagu");
				
				if (playlist.isEmpty()) {
					System.out.println("Playlist masih kosong.");
				} else {
					for (int i = 0; i < playlist.size(); i++) {
						Musik_2511532023 lagu = playlist.get(i);
						System.out.println((i + 1) + ". " + lagu.getJudul_2023() + " - " + lagu.getPenyanyi_2023() + " (" + lagu.getDurasi_2023() + " detik)");
					}
				}
				break;
				
			case 3:
				if (playlist.isEmpty()) {
					System.out.println("Tidak ada lagu yang bisa dihapus.");
				} else {
					System.out.print("Masukkan nomor urut lagu yang ingin dihapus: ");
					int index = sc.nextInt();
					
					if (index > 0 && index <= playlist.size()) {
						playlist.remove(index - 1);
						System.out.println("Lagu berhasil dihapus!");
					} else {
						System.out.println("Nomor urut tidak valid.");
					}
				}
				break;
				
			case 4:
				System.out.println("Keluar dari Program.");
				break;
				
			default:
				System.out.println("Pilihan tidak valid. Silakan coba lagi.");
			}
		} while (pilihan != 4);
		sc.close();
	}
  }