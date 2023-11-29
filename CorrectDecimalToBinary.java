import java.util.*;
class CorrectDecimalToBinary
{
public static void main(String arg[])
{
int r,n,res=0,i=0;
Scanner s=new Scanner(System.in);
System.out.print("enter the decimal number: ");
n=s.nextInt();
while(n!=0)
{
r=n%2;
res=res+(r*(int)Math.pow(10,i));
n=n/2;
i++;
}
System.out.print("the binary number is :"+res);
}
}
