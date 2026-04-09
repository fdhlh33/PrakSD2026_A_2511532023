package pekan3_2511532023;
import java.util.ArrayList;
class Siswa_2023 {
	String nama_2023;
	int nim_2023;
	
	public Siswa_2023(String nama_2023, int nim_2023) {
		this.nama_2023 = nama_2023;
		this.nim_2023 = nim_2023;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_2023 + ", Nama: " + nama_2023;
	}
}
public class SiswaStack_2511532023 {
	private ArrayList<Siswa_2023> stack_2023;
	
	public SiswaStack_2511532023() {
		stack_2023 = new ArrayList<>();
	}
	
	public void push(Siswa_2023 mhs) {
		stack_2023.add(mhs);
	}
	
	public Siswa_2023 pop_2023() {
		if (!isEmpty()) {
			return stack_2023.remove(stack_2023.size() - 1);
		}
		return null;
	}
	
	public Siswa_2023 peek_2023() {
		if (!isEmpty()) {
			return stack_2023.get(stack_2023.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack_2023.isEmpty();
	}
	
	public void tampilkanSiswa() {
		for (int i = stack_2023.size() - 1; i >= 0; i--) {
			System.out.println(stack_2023.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511532023 studentStack_2023 = new SiswaStack_2511532023();
		
		Siswa_2023 mhs1 = new Siswa_2023("Ali", 1);
		Siswa_2023 mhs2 = new Siswa_2023("Boby", 2);
		Siswa_2023 mhs3 = new Siswa_2023("Charles", 3);
		
		studentStack_2023.push(mhs1);
		studentStack_2023.push(mhs2);
		studentStack_2023.push(mhs3);
		
		System.out.println("Siswa di dalam stack: ");
		studentStack_2023.tampilkanSiswa();
		
		System.out.println("Siswa teratas " + studentStack_2023.peek_2023());
		System.out.println("Mengeluarkan siswa teratas dari stack: " + studentStack_2023.pop_2023());
		System.out.println("Daftar siswa setelah di pop: ");
		studentStack_2023.tampilkanSiswa();
	}
}