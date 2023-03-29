import java.util.*;
public class square {
    void addition(int arr[]){
        int add=0;
        for (int i=0;i<10;i++){
            System.out.println("The new no. are =" + arr[i]*arr[i]);
        
        }
        for (int j=0;j<10;j++){
             add=arr[j]+add;

        }
        System.out.println("the sum of origibal no. is" + add);
    }
    public static void main(String args[]){
        int arr[]=new int[10];
        System.out.println("Enter 10 no.");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        square a1=new square();
        a1.addition(arr);
    }
}