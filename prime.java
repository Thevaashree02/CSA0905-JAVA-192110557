import java.util.*;
class prime
{
public static void main(String arg[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
n=s.nextInt();
if(n==0||n==1)
{
System.out.println("it is neither prime nor composite!!");}
else{
for(i=2;i<n;i++){
if(n%i==0){
System.out.println("it is composite!!");
break;}
else{
System.out.println("it is prime!!");}
break;
}
}
}
}