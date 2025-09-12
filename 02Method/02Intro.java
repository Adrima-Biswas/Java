/*
	1. A method is a block of code that performs a specific task. 
	   It can take parameters, return a result, or simply execute some actions.

	2. Syntax :
				returnType methodName(parameter1, parameter2, ...) {
    					// method body
    					// code to perform the task
				}

				where,
					a. returnType: The type of value the method returns 
					   (e.g., int, String, void if it doesn't return anything).
					b. methodName: The name of the method (e.g., addNumbers).
					c. parameters: A list of input values that the method can accept (optional). 
					   These are enclosed in parentheses and separated by commas. If there are 
					   no parameters, you leave the parentheses empty.
					d. method body: The code that defines what the method does.

	3. Method Calling : Syntax -->
					methodName(arg1, arg2, ..);

	4. Combination of return type and parameters : types of function/mathod
    	A. no return value with no parameters
    	B. return value with no parameters
    	C. return value with parameters
    	D. no return value with parameters
*/

// A Simple Method that Doesn't Return Anything (void):  type1

class Main {
	public static void sum() {   // It doesn't return anything, 
		int a = 4, b = 9;		 // in this we mainly write some operations and print them
		int sum = a + b;
		System.out.println(sum);
	}
	public static void main(String[] args) { // In this main method we display 
        sum(); // calling                    // the final result by calling the method
        sum(); // calling
        sum(); // calling
        sum(); // calling
	}
}

//  type2
class Main {
	public static int sumFun() {
		int a = 4, b = 9;
		int sum = a + b;
		System.out.println("Hello");
        return sum;   // 13
	}
	public static void main(String[] args) {
      int a = sumFun(); // calling
      System.out.println(a);
	}
}
// 1->7->8(right postion)->2->3->4->5->8->9->10->End

// type3
class Main {
	public static int multiplication(int x, int y) { // x = a, y = b;
		int m = x * y;
		return m;
	}
	public static void main(String[] args) {
		int a = 4, b = 12;
		int result = multiplication(a,b);
	}
}

// tupe4
