import java.util.*;
public class Sub{
    static int[] Sub(String a1,String b){
       int arr[]=new int[2];
        int i=a1.indexOf(b);
        int l=a1.lastIndexOf(b);
        arr[0]=i;
        arr[1]=l;
       return arr;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String a=sc.nextLine();
     System.out.println("Enter the string to be searched");
     String b=sc.nextLine();
     int arr[]=Sub(a,b);
     System.out.println("The first and last occusrences are"+ arr[0]+" "+arr[1]);
    }
}