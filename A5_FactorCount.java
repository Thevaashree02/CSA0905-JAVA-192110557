import java.util.*;
class A5_FactorCount{
public static void main(String arg[]){
int num,count=0,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number :");
num=s.nextInt();
for(i=1;i<=num;i++){
if(num%i==0){
count=count+1;}
}
System.out.print("Number of Factors = "+count);
}
}