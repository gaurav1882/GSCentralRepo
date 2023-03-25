package Practice;
public class usageThis {

	public void method() {
		this.method3();
		System.out.println("I am default method");
		this.method4();
	}
	public void method1() {
		System.out.println("I am 1 parameterised method");
	}
	public void method2() {
		System.out.println("I am 2 parameterised method");
		this.method1();
	}
	public void method3() {
		System.out.println("I am 3 parameterised method");
	}
	public void method4() {
		System.out.println("I am 4 parameterised method");
		this.method2();
	}
	public static void main(String[] args) {
		usageThis usg = new usageThis();
		usg.method();
	}
}