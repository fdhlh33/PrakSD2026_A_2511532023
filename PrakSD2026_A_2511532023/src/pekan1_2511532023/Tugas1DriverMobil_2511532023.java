package pekan1_2511532023;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas1DriverMobil_2511532023 {
	public static void main(String[] args) {
		ArrayList<Tugas1Mobil_2511532023> daftarMobil = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			System.out.println("\n MENU UTAMA");
			System.out.println("1. Tambah Mobil");
			System.out.println("2. Tampilkan Daftar Mobil");
			System.out.println("3. Hapus Mobil");
			System.out.println("0. Keluar");
			System.out.println("Pilih menu (0-3): ");
			
			int pilihan = input.nextInt();
			input.nextLine();
			
			switch (pilihan) {
			case 1:
				System.out.println("\n[ Input Data Mobil Baru ]");
				
				
				System.out.println("Masukkan Nama    : ");
				String nama = input.nextLine();
				
				System.out.println("Masukkan Tahun   : ");
				int tahun = input.nextInt();
			
				System.out.println("Masukkan CC      : ");
				int cc = input.nextInt();
			
				System.out.println("Masukkan Harga   : Rp");
				long harga = input.nextLong();
				
				System.out.println("Masukkan Merk    : ");
				String merk = input.nextLine();
				input.nextLine();
				
				Tugas1Mobil_2511532023 mobilBaru = new Tugas1Mobil_2511532023(nama, tahun, cc, harga, merk);
				daftarMobil.add(mobilBaru);
				System.out.println("-> Mobil " + nama + " berhasil ditambahkan!");
				break;
			
			case 2:
				cetakDaftar(daftarMobil);
				break;
				
			case 3:
				if (daftarMobil.isEmpty()) {
					System.out.println("\n-> Kosong, tidak ada yang bisa dihapus.");
				} else {
					System.out.println("\nMasukkan Nama Mobil yang ingin dihapus: ");
					String namaHapus = input.nextLine();
					hapusMobil(daftarMobil, namaHapus);
				}
				break;
				
			case 0:
				running = false;
				System.out.println("Anda telah keluar");
				break;
				
			default:
				System.out.println("\n Pilihan tidak valid. Silakan pilih angka (0-3)!");
			}
		}
		input.close();
	}
	public static void cetakDaftar(ArrayList<Tugas1Mobil_2511532023> list) {
		System.out.println("\n[ Daftar Mobil Saat Ini ]");
		if (list.isEmpty()) {
			System.out.println("   (Kosong)");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(" " + (i + 1) + ". " + list.get(i).toString());
			}
		}
	}
	public static void hapusMobil(ArrayList<Tugas1Mobil_2511532023> list, String namaMobil) {
		boolean ditemukan = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNama().equalsIgnoreCase(namaMobil)) {
				System.out.println("-> Berhasil dihapus: " + list.get(i).getNama());
				list.remove(i);
				ditemukan = true;
				break;
			}
		}
		if (!ditemukan) {
			System.out.println("-> Gagal: Mobil dengan nama '" + namaMobil + "' tidak ditemukan!");
		}
	}

}
