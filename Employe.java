class Employe
{
	int eid;
	String empName;
	int salary;
	void accept_Emp(int eno, String ename, int sal)
	{
		eid=eno;
		empName=ename;
		salary=sal;
	}
	void display_Emp()
	{
		System.out.println("Empid " + eid);
		System.out.println("Empname " + empName);
		System.out.println("salary " + salary);
	}
public static void main(String args[])
	{
		Employe eobj= new Employe();
		eobj.accept_Emp(100,"niit", 12000);
		eobj.display_Emp();
	}
}