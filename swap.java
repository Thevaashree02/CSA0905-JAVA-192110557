import java.util.*;
class swap
{
public static void main(String arg[])
{
int a,b,temp;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
a=s.nextInt();
System.out.println("enter b value");
b=s.nextInt();
System.out.println("value of a before swapping=" +a);
System.out.println("value of b before swapping=" +b);
temp=a;
a=b;
b=temp;
System.out.println("value of a after swapping=" +a);
System.out.println("value of b after swapping=" +b);
}
}