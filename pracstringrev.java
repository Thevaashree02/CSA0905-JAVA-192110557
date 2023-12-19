import java.util.*;
class pracstringrev
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int len,i;
String s1=new String();
String s2=new String();
System.out.print("enter the string:");
s1=s.nextLine();
len=s1.length();
for(i=len-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
System.out.print("reversed string is : "+s2);
}
}
