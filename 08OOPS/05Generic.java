class Test <T> {
    T num;
}
public class Main
{
	public static void main(String[] args) {
	    Test<Integer> t1 = new Test<>(); // By adrima
	    t1.num = 20;	    
	    
	    Test<Double> t2 = new Test<>();  // by mridu
	    t2.num = 3.14;	    
	    
	    Test<Boolean> t3 = new Test<>();  // third-party
	    t3.num = false;
	    
		System.out.println(t1.num+"\t"+t2.num+"\t"+t3.num);
		
	}
	
}
