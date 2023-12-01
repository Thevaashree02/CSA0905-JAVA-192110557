import java.util.*;
class fivetable extends Thread{
public void run(){
Scanner s=new Scanner(System.in);
int i,num=5,res;
for(i=1;i<=10;i++){
res=num*i;
System.out.println("5 x "+i+" = "+res);}
System.out.println("Thread B Ended.");
}
}
class tentable extends Thread{
public void run(){
int j,num2=10,res2;
for(j=1;j<=10;j++){
res2=num2*j;
System.out.println("10 x "+j+" = "+res2);}
System.out.println("Thread A Ended.");
}
public static void main(String arg[]){
fivetable obj1=new fivetable();
tentable obj2=new tentable();
obj1.start();
obj2.start();
}
}