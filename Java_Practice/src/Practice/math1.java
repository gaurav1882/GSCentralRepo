package Practice;
public class math1 {
	//(((((10+2)+2)-2)*2)/2)
	// ((((10/2)-2)+2)-2)*2)
	public int sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum result is  : " + c );
		return c;
	}
	public  int sum1 (int a, int b) {
		int c1=a+b;
		System.out.println("Sum result is  : " + c1 );
		return c1;
	}
	public int subtract (int a, int b) {
		int d = a-b;
		System.out.println("Subtract result is  : " + d );
		return d;
	}
	public int multi (int a, int b) {
		int e = a*b;
		System.out.println("Multiplication result is  : " + e );
		return e;
	}
	public int div (int a, int b) {
		int f = a/b;
		System.out.println("Div result is  : " + f );
		System.out.println("Final result of assignment 1 is : " + f);
		return f;
	}
	public int div1(int a, int b) {
		int a1 = a/b;
		System.out.println("Div result is  : " + a1);
		return a1;
	}
	public int sub (int a, int b) {

		int b1 = a-b;
		System.out.println("Sub result is  : " + b1);
		return b1;
	}
	public int add(int a, int b) {
		int c1 = a+b;
		System.out.println("Sum result is  : " + c1);
		return c1;
	}
	public int sub1(int a, int b) {
		int s1 = a-b;
		System.out.println("Subtract result is  : " + s1);
		return s1;
	}
	public int product(int a, int b) {
		int p1 = a*b;
		System.out.println("Product result is  : " + p1);
		System.out.println("Final result of assignment 2 is  : " +p1);
		return p1;
	}
	public static void main(String[] args) {
		math1 m1 = new math1();
		int sum_res = m1.sum(10, 2);
		int sum1_res = m1.sum1(sum_res, 2);
		int subtract_res = m1.subtract(sum1_res, 2);
		int multi_res = m1.multi(subtract_res, 2);
		int div_res = m1.div(multi_res, 2);
		System.out.println("*********************************");
		int div_res1 = m1.div1(10, 2);
		int sub_res1 = m1.sub(div_res1, 2);
		int add_res1 = m1.add(sub_res1, 2);
		int sub1_res1 = m1.sub1(add_res1, 2);
		int pro_res1 = m1.product(sub1_res1, 2);
	}
}