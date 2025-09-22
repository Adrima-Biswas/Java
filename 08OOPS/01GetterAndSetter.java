/*
 1. class & Object
 2. constructor
*/
class Pen{
    int price;
    String colour;
    
    public Pen(int p, String c){
        // this.price = price;
        // this.colour = colour;        
        price = p;
        colour = c;
    }
    
    public void getDetails(){
        System.out.println("Price : "+price);
        System.out.println("Colour : "+colour);
    }
    public void setDetails(int price , String colour){
        this.price = price;
        this.colour = colour;
    }
    public void personalDetails(){
        System.out.println("You are in pen class ... ");
    }
}

public class Main
{
	public static void main(String[] args) {
	    Pen pentonic = new Pen(20,"blue");
	    pentonic.getDetails();
	   // pentonic.price = 10; 
	   // pentonic.colour = "black"; 
	    pentonic.setDetails(10, "black");
	    
	    pentonic.getDetails();
	    pentonic.personalDetails();
	    
// 		System.out.println(pentonic.price);
		
	}
	
}
