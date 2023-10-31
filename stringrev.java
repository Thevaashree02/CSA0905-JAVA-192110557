import java.util.*;
class stringrev
{
public static void main(String arg[])
{
int len,i;
Scanner s=new Scanner(System.in);
String s1=new String();
String s2=new String();
System.out.print("Enter a String = ");
s1=s.nextLine();
len=s1.length();
for(i=len-1;i>=0;i--){
s2=s2+s1.charAt(i);}
System.out.println("Reversed String = "+s2);
}
}