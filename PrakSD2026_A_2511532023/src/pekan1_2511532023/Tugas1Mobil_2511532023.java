package pekan1_2511532023;

public class Tugas1Mobil_2511532023 {
	// atribut
	private String nama;
	private int tahun;
	private int cc;
	private long harga;
	private String merk;
	
	// konstruktor
	public Tugas1Mobil_2511532023(String nama, int tahun, int cc, long harga, String merk) {
		this.nama = nama;
		this.tahun = tahun;
		this.cc = cc;
		this.harga = harga;
		this.merk = merk;
	}
	 // getter
	public String getNama() { return nama; }
	public int getTahun() { return tahun; }
	public int getCc() { return cc; }
	public long getHarga() { return harga; }
	public String getMerk() { return merk; }
	
	// setter
	public void setNama(String nama) {this.nama = nama; }
	public void setTahun(int tahun) { this.tahun = tahun; }
	public void setCc(int cc) { this.cc = cc; }
	public void setHarga(long harga) {this.harga = harga; }
	public void setMerk(String merk) { this.merk = merk; }
	
	// cetak data mobil
	public void cetakDataMobil() {
	System.out.println("Nama: " + nama);
	System.out.println("Tahun: " + tahun);
	System.out.println("Cc: " + cc);
	System.out.println("Harga: " + harga);
	System.out.println("Merk: " + merk);
	}
}
