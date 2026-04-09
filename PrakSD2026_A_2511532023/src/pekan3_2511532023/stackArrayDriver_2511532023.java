package pekan3_2511532023;

public class stackArrayDriver_2511532023 {
	public static void main(String[] args) {
		stackArray_2511532023 s = new stackArray_2511532023();
		s.push_2023(10);
		s.push_2023(20);
		s.push_2023(30);
		System.out.println(s.pop_2023() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah: " + s.peek_2023());
		System.out.print("Elemen pada stack :");
		s.print_2023();
	}
}