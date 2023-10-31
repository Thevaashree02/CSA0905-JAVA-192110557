import java.util.*;
class ExcepHandEg
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b values:");
		int a=s.nextInt();
		int b=s.nextInt();
		try
		{
			int x=a/b;
			System.out.println("output=" +x);
		}
		catch(Exception ex)
		{
			System.out.println("division by zero error");
			System.out.println("change b value");
		}
		finally
		{
			System.out.println("always executed");
		}
	}
}