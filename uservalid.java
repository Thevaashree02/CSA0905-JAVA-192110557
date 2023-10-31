import java.util.*;
class uservalid
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
String s1;
String s2;
System.out.print("Enter username = ");
s1=s.nextLine();
System.out.print("Re-Enter username = ");
s2=s.nextLine();
if(s1.equals(s2)){
System.out.print("Username is valid");}
else{
System.out.print("Username is invalid");}
}
}