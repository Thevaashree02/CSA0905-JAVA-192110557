import java.util.*;
class decitobioc
{
public static void main(String arg[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("Enter Decimal Number : ");
a=s.nextInt();
String bi=Integer.toBinaryString(a);
String oc=Integer.toOctalString(a);
System.out.println("Binary Equivalent for "+a+" = "+bi);
System.out.println("Octal Equivalent for "+a+" = "+oc);
}
}