import java.util.*;
class SumOfDigit
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int n,num,rem,sum=0;
System.out.print("enter N value:");
n=s.nextInt();
System.out.print("Enter a "+n+" digit number: ");
num=s.nextInt();
while(num>0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.print("result: "+sum);
}
}