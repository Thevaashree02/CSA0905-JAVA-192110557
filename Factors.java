import java.util.*;
class Factors{
public static void main(String arg[]){
int num,count=0,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number :");
num=s.nextInt();
for(i=1;i<=num;i++){
if(num%i==0){
System.out.print(i+" ");}
}
}
}