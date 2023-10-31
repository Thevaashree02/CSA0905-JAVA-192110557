import java.util.*;
class StringTest
{
public static void main(String arg[])
{
Scanner a= new Scanner(System.in);
String s1=("ILovejava");
String s2=("ilovejava");
String res1;
res1=s1.toLowerCase();
System.out.println("String to lower"+"="+res1);
String res2=s1.toUpperCase();
System.out.println("String to upper"+"="+res2);
String res3=s1.replace("o","i");
System.out.println("String replace"+"="+res3);
String res4=s1.substring(1);
System.out.println("Substring"+"="+res4);
String res5=s1.substring(1,5);
System.out.println("Substring"+"="+res5);
int res6=s1.indexOf("L");
System.out.println("Position of L"+"="+res6);
int res7=s1.length();
System.out.println("Length of string s1"+"="+res7);
if(s1.equals(s2)){
System.out.println("String s1 is equal to string s2");}
else{
System.out.println("String s1 is not equal to string s2");}
int pos;
System.out.print("Enter pos:");
pos=a.nextInt();
char c = s1.charAt(pos);
System.out.println("Character at index " + pos + ": " + c);
}
}