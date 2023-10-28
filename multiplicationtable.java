import java.util.*;
class multiplicationtable 
{
public static void main(String arg[]) 
{
int m,n,r,i;
Scanner s= new Scanner(System.in);
System.out.println("Enter the value of M: ");
m =s.nextInt();
System.out.println("Enter the value of N: ");
n =s.nextInt();
for(i=1;i<= n;i++) 
{
r= i*m;
System.out.println(i+"x"+m +"="+r);
}
}
}
