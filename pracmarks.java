import java.util.*;
class pracmarks
{
public static void main(String arg[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("mark:");
a=s.nextInt();
if(a>=90)
{
System.out.println("A garde");
}
else if(a>=80 && a<90)
{
System.out.println("B garde");
}
else
{
System.out.println("FAIL");
}
}
}