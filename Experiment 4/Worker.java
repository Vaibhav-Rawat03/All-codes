import java.util.*;
class Worker {
    String Name;
    int Salaryrate;
    int hours;
}
class DailyWorker extends Worker{
    void Compay(int hours,int Salaryrate){
     System.out.println("Name of Worker = "+super.Name+"The total pay= "+hours*Salaryrate);
    }
}
class SalariedWorker extends Worker{
    void Compay(int hours,int Salaryrate){
        if(hours<=40){
            System.out.println("Name of Worker = "+super.Name+"The total pay = "+hours*Salaryrate);
        }
        else{
            System.out.println("Name of Worker = "+super.Name+"The total pay ="+40*Salaryrate);
        }
    }
}
class Final{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Daily worker"+"\n"+"Enter 2 for Salaried worker");
        int c=sc.nextInt();
        Worker w=new Worker();
        if(c==1){
         System.out.println("Enter Worker Name");   
         w.Name=sc.nextLine();
         System.out.println("Enter Salary rate");
         w.Salaryrate=sc.nextInt();
         System.out.println("Enter NO. of Days");
         w.hours=sc.nextInt();
         DailyWorker dw=new DailyWorker();
         dw.Compay(hours,Salaryrate); 
     }
     else{
        System.out.println("Enter Worker Name");   
        w.Name=sc.nextLine();
        System.out.println("Enter Salary rate");
        w.Salaryrate=sc.nextInt();
        System.out.println("Enter NO. of Hours");
        w.hours=sc.nextInt();
     }
    }
}
