public class Capital{
    StringBuffer cap(StringBuffer a){
        a=a.toUpperCase();
        return a;
    }
}
class Main{
    public static void main(String args[]){
        StringBuffer s=new StringBuffer("Halo");
        Capital c1=new Capital();
        StringBuffer w=c1.cap(s);
        System.out.print(w);
    }
}