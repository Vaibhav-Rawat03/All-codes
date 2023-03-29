import java.util.*;
public class months {
   void mon(int a){
    String q;
    switch (a){
        case 1:
        q="January";
        break;
        case 2:
        q="February";
        break;
        case 3:
        q="March";
        break;
        case 4:
        q="April";
        break;
        case 5:
        q="May";
        break;
        case 6:
        q="June";
        break;
        case 7:
        q="July";
        break;
        case 8:
        q="August";
        break;
        case 9:
        q="September";
        break;
        case 10:
        q="October";
        break;
        case 11:
        q="November";
        break;
        case 12:
        q="December";
        break;
        default:
        q="Wrong input";
    }
    System.out.println(q);
   }
   public static void main(String args[]){
    int a;
    System.out.println("Enter the month no.");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    months m1=new months();
    m1.mon(a);
   }
}
