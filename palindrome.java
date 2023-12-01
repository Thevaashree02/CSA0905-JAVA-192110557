import java.util.*;
class palindrome
{
public static void main(String arg[])
{
int n,n1,rem,rev=0;
Scanner s=new Scanner(System.in);
System.out.println("enter number");
n=s.nextInt();
n1=n;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("reverse is :" +rev);
if(n1==rev)
{
System.out.println("The number " +n1+ " is a palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}