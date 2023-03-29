class Inheritance {
    private int i=0;
    public int j=1;
}
class Inherited extends Inheritance{   
    void print(){
        int i=2,j=3;
        System.out.println(i+""+j);
        System.out.println(super.i);
        System.out.println(super.j);
    }
}
class Main{
    public static void main(String[] args){
        Inherited I1=new Inherited();
        I1.print();
    }    
}