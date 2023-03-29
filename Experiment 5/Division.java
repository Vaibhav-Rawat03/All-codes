import java.util.*;
interface a{
    void Division(int a,int b);
    void modulus(int a,int b);
}
public class Division {
    void Division1(int a, int b){
        if (b!=0){
            System.out.println("a/b ="+a/b);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    void Modulus(int a, int b){
        if(b!=0){
            System.out.println("a%b ="+a%b);
        }
        else{
            System.out.println("Invalid input");
        }
    } 
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st no.");
        int a=sc.nextInt();
        System.out.println("Enter 2nd no.");
        int b=sc.nextInt();
        Division d=new Division();
        d.Division1(a,b);
        d.Modulus(a,b);
    }
}
