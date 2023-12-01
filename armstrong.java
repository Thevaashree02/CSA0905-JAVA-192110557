import java.util.*;
class armstrong
{
public static void main(String arg[])
{
int n,n1,sum=0,rem;
Scanner s=new Scanner(System.in);
System.out.println("enter number");
n=s.nextInt();
n1=n;
while(n>0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(n1==sum)
{
System.out.println("The number " +n1+ " is an Armstrong number");
}
else
{
System.out.println("not an Armstrong number");
}
}
}