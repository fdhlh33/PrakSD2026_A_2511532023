package pekan3_2511532023;

public class stackArray_2511532023 {
	static final int MAX_2023 = 1000;
	int top_2023;
	int a_2023[] = new int [MAX_2023];
	boolean isEmpty_2023()
	{
		return (top_2023 < 0);
	}
	stackArray_2511532023()
	{
		top_2023 = -1;
	}
	boolean push_2023(int x)
	{
		if (top_2023 >= (MAX_2023 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a_2023[++top_2023] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2023()
	{
		if (top_2023 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2023[top_2023--];
			return x;
		}
	}
	int peek_2023()
	{
		if (top_2023 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2023[top_2023];
			return x;
		}
	}
	void print_2023() {
		for(int i = top_2023; i > -1; i--) {
			System.out.print(" " + a_2023[i]);
		}
	}
}