public class Thread3 extends Thread{
    int a=0;
    synchronized void thread1(){
     a=a+1;
     System.out.println("thread1");
    } 
    synchronized void thread2(){
        a=a+1;
        System.out.println("thread2");
       } 
       synchronized void thread3(){
        a=a+1;
        System.out.println("thread3");
       }
       synchronized void thread4(){
        a=a+1;
        System.out.println("thread4");
       } 
       synchronized void thread5(){
        a=a+1;
        System.out.println("thread5");
       } 
       synchronized void thread6(){
        a=a+1;
        System.out.println("thread6");
       } 
}
class End{
    public static void main(String args[]){
        Thread3 t=new Thread3();
        Thread t1=new Thread(){
         public void run(){
            t.thread1(); 
            t.thread2();
            t.thread3();
            t.thread4();
            t.thread5();
            t.thread6();
         }
        };
        t1.start();
        
    }
}
