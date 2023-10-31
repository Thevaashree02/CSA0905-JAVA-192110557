import java.util.*;
class fiboverloading
{
	int a,b,c,limit,i=0;
	void calc(int x,int y,int z,int num)	
	{
		a=x;
		b=y;
		c=z;
		limit=num;
		System.out.print(a+" "+b+" ");
		for(i=2;i<limit;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
	public static void main(String arg[])
	{
		int x=0,y=1,z=0,limit;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Limit : ");
		limit=s.nextInt();
		fiboverloading obj=new fiboverloading();
		obj.calc(x,y,z,limit);
	}
}