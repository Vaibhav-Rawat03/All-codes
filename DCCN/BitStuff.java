import java.util.Scanner;
class BitStuff{
    int [] bitstuff(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
            for(int j=i+1;j<i+7;j++){
                if(arr[j]==1){
                    count++;
                }
                else if(arr[j]==0){
                    break;
                }
            }
            if(count==6){
                int str=i+5;
                for(int k=arr.length;k>str;k--){
                    arr[k]=arr[k-1];
                }
                arr[str]=0;
            }
            }
        }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary Sequence");
        int arr[]=new int[21];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        BitStuff ob=new BitStuff();
        int arr2[]=new int[20];
        arr2=ob.bitstuff(arr);
        for(int j=0;j<arr2.length;j++){
            System.out.println(arr2[j]);
        }
    }
}