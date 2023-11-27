import java.util.*;
class A5_CompositeBetween{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int l1,l2,i,j;
System.out.print("Enter lower limit : ");
l1=s.nextInt();
System.out.print("Enter Upper limit : ");
l2=s.nextInt();
for(i=l1+1;i<l2;i++){
int flag=0;
for(j=1;j<=i;j++){
if(i%j==0){
flag=flag+1;}
}
if(flag>2){
System.out.print(i+" ");}
}
}
}