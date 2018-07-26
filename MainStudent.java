import java.util.Scanner;
class Student
{
	int sid;
	String sname;
	int m,p,c,total;
	float avg;
	Scanner scan = new Scanner (System.in);
void accept_stud()
{
	System.out.println("Enter the student name");
	sname=scan.nextLine();
	System.out.println("Enter the student id");
	sid=scan.nextInt();
	System.out.println("Enter the marks of Maths, Physics, Chemistry");
	m=scan.nextInt();
	p=scan.nextInt();
	c=scan.nextInt();
	

//float calculate_marks()

	total=m+p+c;
	avg=total/3;
	
}
void disp_Std()
{
	System.out.println("display student details");
	System.out.println("student id : " + sid);
	System.out.println("student name : " +sname);
	//float result =  calulate_marks;
	System.out.println("total marks : " + total);
	System.out.println("average : " + avg);
}
}
class MainStudent
{
	public static void main(String []ar)
	{
		Student stud = new Student();
		stud.accept_stud();
		//stud.calculate_marks();
		stud.disp_Std();
	}
}