import java.util.*;
class AvgSumUntillEncountered{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int num,Psum=0,Pcount=0,Nsum=0,Ncount=0;
double avg1,avg2;
System.out.println("Enter -1 to Exit.");
do{
System.out.print("Enter the Element : ");
num=s.nextInt();
if(num!=-1){
if(num>0){
Psum=Psum+num;
Pcount=Pcount+1;}
else if(num<0){
Nsum=Nsum+num;
Ncount=Ncount+1;}
}
}while(num!=-1);
avg1=Psum/Pcount;
avg2=Nsum/Ncount;
System.out.println("Positive Numbers Average = "+avg1);
System.out.println("Negative Numbers Average = "+avg2);
}
}