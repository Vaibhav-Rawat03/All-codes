import java.util.Scanner;
class Divide{
    int division(int a,int b) throws ArithmeticException{
        try{
            int data=a/b;
            return data;
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
class Div{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd no.");
        int b=sc.nextInt();
        Divide d=new Divide();
        int c=d.division(a,b);
        System.out.println(c);
    }
}