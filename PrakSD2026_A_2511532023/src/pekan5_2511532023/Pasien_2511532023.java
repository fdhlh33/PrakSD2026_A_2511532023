package pekan5_2511532023;

public class Pasien_2511532023 {
	// Atribut
	private String namaPasien_2023;
    private String keluhan_2023;
    private int nomorAntrian_2023;
    
    // Pointer
    private Pasien_2511532023 next_2023;
    
    // Konstruktor
    public Pasien_2511532023(String namaPasien_2023, String keluhan_2023, int nomorAntrian_2023) {
        this.namaPasien_2023 = namaPasien_2023;
        this.keluhan_2023 = keluhan_2023;
        this.nomorAntrian_2023 = nomorAntrian_2023;
        this.next_2023 = null; // Default null karena belum ada antrian di belakangnya
    }
    
    // Setter
    public String getNamaPasien_2023() {
        return namaPasien_2023;
    }
    public String getKeluhan_2023() {
        return keluhan_2023;
    }
    public int getNomorAntrian_2023() {
        return nomorAntrian_2023;
    }
    public Pasien_2511532023 getNext_2023() {
        return next_2023;
    }
    
    // Getter
    public void setNamaPasien_2023(String namaPasien_2023) {
        this.namaPasien_2023 = namaPasien_2023;
    }
    public void setKeluhan_2023(String keluhan_2023) {
        this.keluhan_2023 = keluhan_2023;
    }
    public void setNomorAntrian_2023(int nomorAntrian_2023) {
        this.nomorAntrian_2023 = nomorAntrian_2023;
    }
    public void setNext_2023(Pasien_2511532023 next_2023) {
        this.next_2023 = next_2023;
    }
}