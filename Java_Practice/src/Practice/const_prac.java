package Practice;

public class const_prac {
	// Constructor is like a method
	// Class name and constructor name is name
	// no return type. it has no return type
	// no need to call it explicitly, will get called with object initialization of class. or when the object of the class..
	//....is created
	// default and parameterized constructor - Two types of constructor
	// Diff between method and constructor - We need to call the method using ref variable and constructor is ..
	// ....called immediately as we create object of the class
	// By default every class has a default constructor
	// Constructor reduces the no of calls and it is used to assign the values
	// we cannt write void for constructor
	
	//With the help of this keyword, we can call one constructor from another constructor
	// we cannt write more than one this c

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
