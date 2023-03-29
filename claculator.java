import java.util.*;
public class claculator {
     int largest(int a,int x,int y){
     
     if(a==1)
     return x+y;
     else if(a==2)
     return x-y;
     else if(a==3)
     return x*y;
     else if(a==4)
     return (int)(x/y);
     else 
     return 0;
     }

     public static void main(String args[])
     {
        int x,y;
        System.out.println("Enter values to be operated on");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Press 1 for addition "+"\n"+"press 2 for subtraction "+"\n"+"press 3 for multiplication"+"\n" + "press 4 for division");
        int a=sc.nextInt();
        claculator c1=new claculator();
        int c=c1.largest(a,x,y);
        System.out.println(c);
     }
   
 }

