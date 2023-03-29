import java.io.*;
import java.util.Scanner;
class VehicleException extends Exception{
    String VehicleException(String d1){
        if(d1!="F")
        return d1="F";
        else{
            return d1="B";
        }
    }
}
class Direction{
    String Dir(String d1, String d2){
        if(d1==d2){
        return "Smooth ride";
        }
        else{
        return "Collision course Direction being changed";
        }
}
public class Vehicles {
    public static void main(String args[]){
        System.out.println("Enter the direction of first vehicle"+"\n"+"F for forward"+"\n"+"B for backward");
        Scanner sc=new Scanner(System.in);
        String d1=sc.nextLine();
        System.out.println("Enter the direction of second vehicle"+"\n"+"F for forward"+"\n"+"B for backward");
        String d2=sc.nextLine();
        Direction q=new Direction();
        try{
            String r=q.Dir(d1,d2);
            System.out.println(r);
        }
        catch(VehicleException e){
             String w1=
        }
        
    }
}
