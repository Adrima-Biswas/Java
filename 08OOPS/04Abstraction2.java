abstract class Shape{
    public abstract void perimeter();
    public abstract void area();
}

class Circle extends Shape{
    public int radius;
    
    Circle(int radius){
        this.radius = radius;
    }
    
    @Override
    public void perimeter(){
        double p = 2 * Math.PI * radius;
        System.out.println("perimeter of circle: "+p);
    }
    
    @Override
    public void area(){
        double a = Math.PI * Math.pow(radius,2);
        System.out.println("area of circle: "+a);
		
    }
	
}

class Rectangle extends Shape{
    public int l;
    public int b;
    
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    
    @Override
    public void perimeter(){
        int p1 = 2 * (l + b);
        System.out.println("perimeter of rectangle: "+p1);
    }
    
    @Override
    public void area(){
        int r1 = l * b;
        System.out.println("area of rectangle: "+r1);  
    }
}

public class Main
{
	public static void main(String[] args) {
	    Rectangle r = new Rectangle(3,5);
	    Circle c = new Circle(7);
	   // c.radius = 7;
	    c.perimeter();
	    c.area();
	   // r.l = 3;
	   // r.b = 5;
	    r.perimeter();
	    r.area();

		
	}
}

