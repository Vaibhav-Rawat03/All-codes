import java.util.*;
class Call{ 
    float charge(float duration, int type){
        if(type==1){
          return (duration*5.5f);
        }
        else if(type==2){
            return(duration*3.5f);
        }
        else{
            return(duration*1.5f);
        }
    }
}
class Main{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float cost,duration;
        System.out.println("Press 1 for urgent call"+"\n"+"Press 2 for lightening"+"\n"+"Press 3 for ordinary");
        int type=sc.nextInt();;
        System.out.println("Enter the duration in minutes");
        duration=sc.nextFloat();
        Call t=new Call();
        cost=t.charge(duration,type);
        System.out.println("The total cost= "+cost);   
    }
}        