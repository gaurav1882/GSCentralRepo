package Practice;

public class Arithmetic {
	
	public int sum(int a, int b) {
		int a1;
		a1=a+b;
		System.out.println("This is going to Github Central Repo");
		System.out.println("Sum Result is " + a1);
		return a1;
	}
		
	public int subtract(int a ,int b)
	{
		int a2;
		a2=a-b;
		System.out.println("Subtract Result is " + a2);
		return a2;
	}
		public static void main(String[] args) {
		Arithmetic ari = new Arithmetic();
		ari.sum(10,20);
		
	}
}