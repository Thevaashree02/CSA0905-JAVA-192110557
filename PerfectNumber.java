 import java.util.*;
class PerfectNumber{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int num,i,res=0;
System.out.print("Enter a Number : ");
num=s.nextInt();
for(i=1;i<num;i++){
if(num%i==0){
res=res+i;}
}
if(num==res){
System.out.print(num+" is a perfect Number.");}
else{
System.out.print(num+" is not a perfect Number.");}
}
}