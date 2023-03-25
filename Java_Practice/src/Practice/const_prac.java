package Practice;

public class const_prac {

	public const_prac() {
		this(66,77);
		System.out.println(" This is default constructor");
	}
	public const_prac(int a) {
		//this();
		System.out.println(" This is one parameterised constructor");
		}
	public const_prac(int a, int b) {
		System.out.println(" This is two parameterised constructor");
	}
	public static void main(String[] args) {
		const_prac p1 = new const_prac();
		const_prac p2 = new const_prac(12);
		const_prac p3 = new const_prac(12,16);
	}
}
