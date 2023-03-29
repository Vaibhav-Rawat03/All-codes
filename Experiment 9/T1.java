class T1 extends Thread{
    public void run(){
        System.out.println("Running firts thread");
    }
}
class T2 implements Runnable{
    public void run(){
        System.out.println("Second");
    }
}
class Final{
    public static void main(String args[]){
        T1 thread1=new T1();
        T2 thread2=new T2();
        Thread Bullet2=new Thread(thread2);
        thread1.start();
        Bullet2.start();
    }
}