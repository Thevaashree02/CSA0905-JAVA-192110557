import java.util.*;
class interfacePrime implements Runnable{
public void run(){
Scanner s=new Scanner(System.in);
int num,i,flag=0;
System.out.print("Enter a Number : ");
num=s.nextInt();
for(i=1;i<=num;i++){
if(num%i==0){
flag++;}
}
if(flag==2){
System.out.print(num+" is a prime number.");}
else{
System.out.print(num+" is not a prime number.");}
}
public static void main(String arg[]){
interfacePrime a=new interfacePrime();
Thread b=new Thread(a);
b.start();
}
}