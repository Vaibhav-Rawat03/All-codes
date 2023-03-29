public class Employ {
    String name;
    int empid,salary;
    int increase;
       Employ(String name,int empid,int salary){
       this.name=name;
       this.empid=empid;
       this.salary=salary;
       System.out.println("Name is "+getname()+"\n"+"Salary is  "+getsalary()+"\n"+"Employee id is "+getid());
    }
    String getname(){
        return name;
    }
    int getsalary(){
        return salary;
    }
    int getid(){
        return empid;
    }
    int increase_sal(int salary,int increase){
        int newsal=((increase/100)*salary) + salary;
        return newsal;
    }
}
class Manager extends Employ{
    String department;
    Manager(String department,String name,int empid,int salary ){
        super(name, empid, salary);
        this.department=department;
        System.out.println("Department is "+department+"\n"+"Name is "+getname()+"\n"+"Salary is  "+getsalary()+"\n"+"Employee id is "+getid());
    }
}
class Main{
    public static void main(String args[]){
      Employ e=new Employ("Adtya",1001,1000000);
      Manager m=new Manager("IT","SOnu",1111,200000);
    }
}
