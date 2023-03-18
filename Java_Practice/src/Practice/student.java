package Practice;

public class student {
	
	int stu_roll_no;
	int stu_age;
	
	public void display1() {
		
		System.out.println("Welcome all of you");
			}
	public void display2() {
		
		System.out.println("Automation is easy");
	}
	
	public static  void main(String[] args)
	{
		student stu = new student();
		stu.display1();
		stu.display2();
		stu.stu_roll_no = 11;
		stu.stu_age = 34;
		System.out.println("Student roll no is : " + stu.stu_roll_no);
		System.out.println("Student age is : " + stu.stu_age);
		
	}
}
