package Practice;
public class Cons_Assignment {
	public Cons_Assignment() {
		this(1,2,3);
		System.out.println("This is default constructor");
	}
		public Cons_Assignment(int a) {
		this();
		System.out.println("This is one param constructor");
	}
		public Cons_Assignment(int a, int b) {
		this(1,2,3,4);
		System.out.println("This is two param constructor");
	}
		public Cons_Assignment(int a, int b, int c) {
		System.out.println("This is Three param constructor");
	}
		public Cons_Assignment(int a, int b, int c , int d) {
		this(1);
		System.out.println("This is four param constructor");
	}
		public static void main(String[] args)
	{
		Cons_Assignment a = new Cons_Assignment(1,2);
	}
}