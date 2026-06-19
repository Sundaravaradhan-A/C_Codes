abstract class Shape{
    double area;
    abstract void findArea();
    Shape(){
        area=0.0;
        System.out.println("Super Class Constructor");
    }
    public void display(){
        System.out.println("Area = "+area+"cm");
    }
}
class Triangle extends Shape{
    private int b;
    private int h;
    
    Triangle(int b,int h){
        this.b = b;
        this.h = h;
        System.out.println("Sub class constructor");
    }
    
    void findArea(){
        area = 0.5*b*h;
        
    }
}
class Circle extends Shape{
    private int r;
    
    Circle(int r){
        this.r = r;
        System.out.println("Sub class constructor");
    }
    
    void findArea(){
        area = 3.14*r*r;
        
    }
}
class Rectangle extends Shape{
    private int l;
    private int b;
    
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
        System.out.println("Sub Class Construction");
    }
    void findArea(){
        area = l*b;
    }
}
class Hexagon extends Shape{
    private int s;
    
    Hexagon( int s){
        this.s = s;
        System.out.println("Sub Class Construction");
    }
    void findArea(){
        area= ((3*1.732)/2)*s*s;
    }
}
public class Main
{
	public static void main(String[] args) {
            Shape s;
            s = new Triangle(5,4);
            s.findArea();
            s.display();
            s= new Circle(2);
            s.findArea();
            s.display();
            s=new Rectangle(5,4);
            s.findArea();
            s.display();
            s=new Hexagon(4);
            s.findArea();
            s.display();
	}
}

/* OUTPUT
  Super Class Constructor
Sub class constructor
Area = 10.0cm
Super Class Constructor
Sub class constructor
Area = 12.56cm
Super Class Constructor
Sub Class Construction
Area = 20.0cm
Super Class Constructor
Sub Class Construction
Area = 41.568cm     
*/
