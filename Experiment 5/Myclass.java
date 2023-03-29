interface A{
   void meth1();
   void meth2();
}
public class Myclass implements A {
    public void meth1(){
        System.out.println("meth 1 implemented");
    }
    public void meth2(){
        System.out.println("Meth 2 implemented");
    }
}
class Main{
    public static void main(String args[]){
        Myclass m=new Myclass();
        m.meth1();
        m.meth2();
    }
}
