Interface Area{
    static final float pi=3.142f; 
    float calc_area(float x, float y);
    }
    class Rectangle implements Area{
    public float calc_area (float x, float y){
        return(x*y);
    }
    }
    class Circle implements Area{
    public float calc_area (float x, float y){
    return(pi*x*x);
    }
    }
    class Main2{
    public static void main(String args[])
    {
    Rectangle r=new Rectangle();
    Circle c=new Circle();
    Area ar;
    ar=r;
    System.out.println("Area of the rectangle="+ar.calc_area(10,20));
    System.out.println("Area of the circles "+ar.calc_area(10,0));
    }
    }