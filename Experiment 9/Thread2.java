class T1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i=i+2){
            System.out.println(i);
            try{
                wait(100);
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }

        
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=1;i<=11;i=i+2){
          System.out.println(i);  
        }
        
    }
}
class Main{
    public static void main(String args[]){
        T1 thread1=new T1();
        Thread2 thread2=new Thread2();
        thread1.start();
        thread2.start();
        try{
                thread1.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        
    }
}