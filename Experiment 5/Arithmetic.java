interface test{
    int square(int n);
}
class Arithmetic implements test{
    public int square(int n){
        return (n*n);
    }
}
class Testint{
    public static void main(String args[]){
    Arithmetic a=new Arithmetic();
    int s=a.square(5);
    System.out.println(s);
   }
}