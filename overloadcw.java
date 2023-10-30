import java.util.*;
class overloadcw
{
	
		void display()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter name:");
		String name=s.nextLine();
		System.out.println();
		System.out.println(name);
	}
	void display(String name1)
	{
		int i;
		for(i=1;i<=2;i++)
		{
			System.out.println(name1);
		}
	}
		void display(String name2,int n)
	{
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.println(name2);
		}
	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter name1");
		String name1=s.nextLine();
		System.out.println("enter name2");
		String name2=s.nextLine();
		System.out.println("enter n:");
		int n=s.nextInt();
		overloadcw obj=new overloadcw();
		obj.display();
		obj.display(name1);
		obj.display(name2,n);
	}
}
			