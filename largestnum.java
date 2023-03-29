
public class largestnum {
       int largest(int x, int y , int z){
        if (x>y && x>z)
        return x;
        else if (y>z && y>x)
        return y;
        else 
        return z;
       }
    public static void main(String args[]){
        largestnum l1=new largestnum();
        int a=l1.largest(10,20,30);
        System.out.println("Largest number =" + a);

    }
}
