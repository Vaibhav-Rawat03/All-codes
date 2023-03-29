import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
     static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
    public static void main (String[] args) {
        int N;
        System.out.println("Enter a no. less than 50");
        Scanner sc=new Scanner(System.in);
        N = sc.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        if (N>50){
            System.out.println("Wrong Input");
        }
        else{
        System.out.println("Enter the values of 1st and 2nd card in this sequence");    
        for (int i=0;i<N;i++){
           a[i]=sc.nextInt();
           b[i]=sc.nextInt();
        }
        int A=findGCD(a, N);
        int B=findGCD(b, N);
        System.out.println(lcm(A, B));
        }  
    }
    }