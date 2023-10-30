import java.util.*;
class addoverloading
{
	int n1,n2,n3,total1,total2;
	void calc(int a,int b)
	{
		n1=a;
		n2=b;
		total1=a+b;
		System.out.println(n1+"+"+n2+"="+total1);
	}
	void calc(int a,int b,int c)
	{
		n1=a;
		n2=b;
		n3=c;
		total2=a+b+c;
		System.out.println(n1+"+"+n2+"+"+n3+"="+total2);
	}
	public static void main(String arg[])
	{
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number :");
		x=s.nextInt();
		System.out.print("Enter another number :");
		y=s.nextInt();
		System.out.print("Enter another number :");
		z=s.nextInt();
		addoverloading obj=new addoverloading();
		obj.calc(x,y);
		obj.calc(x,y,z);
	}
}