class Nested_if
{
public static void main(String[]ar)
{
int a=30, b=30, c=30;
if (a>=b && a>=c)
{
if (a==b && a==c)
	{
		System.out.println("a,b,c are equal");
	}
else if (a==b)
	{ 
		System.out.println("a and b are equal and greater than c");
	}
else if (a==c)
	{
		System.out.println("a and c are equal and greater than b");
	}
else
	{
		System.out.println("a is greater than b and c");
	}
}
else if (b>=c)
{
if (b==c)
	{
		System.out.println("b and c are equal and greater than a");
	}
else
	{
		System.out.println("b is greater than a and c");
	}
}			
else
{
		System.out.println("c is greater than a and b");
}
}
}
		
