package pekan7_2511532023;

public class Mahasiswa_2511532023 {
	// Atribut
	private String nama_2023;
	private String nim_2023;
	private String prodi_2023;
	
	// Konstrukror
	public Mahasiswa_2511532023(String nama_2023, String nim_2023, String prodi_2023) {
		this.nama_2023 = nama_2023;
		this.nim_2023 = nim_2023;
		this.prodi_2023 = prodi_2023;
	}
	
	// Getter
	public String getNama_2023() {
		return nama_2023;
	}
	public String getNim_2023() {
		return nim_2023;
	}
	public String getProdi_2023() {
		return prodi_2023;
	}
	
	// Setter
	public void setNama_2023(String nama_2023) {
		this.nama_2023 = nama_2023;
	}
	public void setNim_2023(String nim_2023) {
		this.nim_2023 = nim_2023;
	}
	public void setProdi(String prodi_2023) {
		this.prodi_2023 = prodi_2023;
	}
	
	// toString()
	@Override
	public String toString() {
		return nama_2023;
	}
}