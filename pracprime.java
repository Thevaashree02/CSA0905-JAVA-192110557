import java.util.*;
class pracprime
{
public static void main(String arg[])
{
int x,y,r;
Scanner s=new Scanner(System.in);
System.out.println("enter the num : ");
r=s.nextInt();
x=1;
y=0;
while(x<=r)
{
if((r % x)==0)
y=y+1;
x++;
}
if(y==2)
System.out.println("prime");
else
System.out.println("not a prime");
}
}
	