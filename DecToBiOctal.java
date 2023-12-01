import java.util.*;
class DecToBiOctal{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int num,num2,res=0,res2=0,rem,rem2,i=0,j=0;
System.out.print("Enter a Decimal Number : ");
num=s.nextInt();
num2=num;
while(num>0){
rem=num%8;
res=res+(rem*(int)Math.pow(10,i));
num=num/8;
i++;
}
System.out.println("Octal Equivalent = "+res);
while(num2>0){
rem2=num2%2;
res2=res2+(rem2*(int)Math.pow(10,j));
num2=num2/2;
j++;
}
System.out.println("Binary Equivalent = "+res2);
}
}