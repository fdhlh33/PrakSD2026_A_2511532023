package pekan6_2511532023;

import java.util.Scanner;

public class Lagu_2511532023 {
	// ATribut
	String judul_2023;
	String penyanyi_2023;
	Lagu_2511532023 next_2023;
	Lagu_2511532023 prev_2023;
	
	// Konstruktor
	public Lagu_2511532023(String judul_2023, String penyanyi_2023) {
		this.judul_2023 = judul_2023;
		this.penyanyi_2023 = penyanyi_2023;
		this.next_2023 = next_2023;
		this.prev_2023 = prev_2023; }
	
	// Getter
	public String getJudul_2023() {
		return judul_2023;	}
	public String getPenyanyi_2023() {
		return penyanyi_2023;	}
	
	// Setter
	public void setJudul_2023(String judul_2023) {
		this.judul_2023 = judul_2023;	}
	public void setPenyanyi_2023(String penyanyi_2023) {
		this.penyanyi_2023 = penyanyi_2023;	}
}