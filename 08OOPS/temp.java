abstract class Animal{
    public abstract void animalSound();
    
    public void sleep(){ 
        System.out.println("Zzz..!");
    }
}
class Pig extends Animal{
    int num = 90;
    public void animalSound(){
        System.out.println("wee wee...");
    }
}
public class Main
{
	public static void main(String[] args) {
	   // Pig myPig = new Pig();
	   // myPig.animalSound();
	   // myPig.sleep();
	    
	   // Animal a = new Animal(); // Animal is abstract; cannot be instantiated
	    Animal a = new Pig();
	    System.out.println(a.num); // To access num variable we need to create reference of Pig class
	   // a.animalSound();
	}
}





























