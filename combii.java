import java.util.*;
public class combii{
    void combine(int arr[]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(i!=j && j!=k && k!=i){
                        System.out.println(arr[i]+""+arr[j]+""+arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]=new int[3];
        Scanner sc=new Scanner(System.in);
       for (int i=0;i<3;i++){
           arr[i]=sc.nextInt();
       }
        combii c1=new combii();
        c1.combine(arr);
    }
}