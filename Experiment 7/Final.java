import java.util.Scanner;
class Name{
    Scanner sc=new Scanner(System.in);
    String[] Array(){
        String arr[]=new String[10];
        System.out.println("Enter The Names in order");
        for(int i=0;i<10;i++){
        arr[i]=sc.nextLine();
        }
        return arr;
    }
    int[] Array2(){
        int arr[]=new int[10];
        System.out.println("Enter the roll no corresponing to names");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
class Final{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Name n=new Name();
    String arr[]=n.Array();
    int arr2[]=n.Array2();
    System.out.println("Enter the index no to be searched");
    int s=sc.nextInt();
    try{
        System.out.println(arr[s]+"  "+arr2[s]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Enter no between 1 to 10");
    }
    catch(Exception e){
        System.out.println("Exception occured"+e);
    }
    }
}