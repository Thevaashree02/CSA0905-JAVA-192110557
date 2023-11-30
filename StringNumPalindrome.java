import java.util.*;
class StringNumPalindrome
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int ch;
System.out.println("1.For String Palindrome");
System.out.println("2.For number palindrome");
System.out.println("Enter your choice :");
ch=s.nextInt();
s.nextLine();
switch(ch){
case 1:
int len,i;
String s1=new String();
String s2=new String();
System.out.print("Enter a String = ");
s1=s.nextLine();
String original=s1;
len=s1.length();
for(i=len-1;i>=0;i--){
s2=s2+s1.charAt(i);}
System.out.println("Reversed String = "+s2);
if(s2.equals(original)){
System.out.println("It is a Palindrome.");}
else{
System.out.println("Not a Palindrome.");}
break;
case 2:
int n,n1,rem,rev=0;
System.out.println("enter number:");
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
break;
default:
System.out.println("Invalid choice. Please select 1 or 2.");
break;
}
}
}