/*
	a = 15;  After Swapping  a = 14;
	b = 14;				     b = 15;
*/
class Main{
	public static void main(String[] args){
	 	int a , b;
	    a = 1;
	    b = 2;

	    // Method 1: By using third variable
	    int temp = a;
	    a = b;
	    b = temp;

	    // Method 2: by using + -
        a = a + b; // 1 + 2
        b = a - b; // 1 + 2 - 2 = 1
        a = a - b; // 1 + 2 - 1 = 2

        // Method 3: by using * /
        a = a * b; 
        b = a / b;
        a = a / b;

        // Method 4: by using ^ (xor)
        a = a ^ b;
        b = a ^ b; 
        a = a ^ b;
	
	    System.out.println("value of a : "+a);
	    System.out.println("value of b : "+b);   
		
	}
	

}
