import java.util.Scanner;



public class Aopr{

	
	public static int sum(int x , int y){ // x = 6 , y = 2
		int S = x + y; // s = 6 + 2
		return S; // 8
		

	}
	
	public static int sub(int a , int b){ // a = 6 ; b = 2
		int m = a - b; // m = 6 - 2
		return m; // 4
		
	}
	
	public static int div(int p , int q){ // p = 6 , q = 2
		int r = p / q; // r = 6/2
		return r; // 3
		
	}
	
	public static int mul(int v , int i){ // v = 6 , i = 2
		int d = v * i; // d = 6*2
		return d; // 12
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value a b: ");  // 6 2
		int a = sc.nextInt(); // 6
		int b = sc.nextInt(); // 2
		int ans1 = sum(a , b); // sum(6,2) then ans1 = 8
		int ans2 = sub(a , b); // sub(6,2) then ans2 = 4
		int ans3 = div(a , b); // div(6,2) then ans3 = 3
		int ans4 = mul(a , b); // mul(6,2) then ans4 = 12

		System.out.println("sum of "+a+" and "+b+" : "+ans1);
		System.out.println("sub of "+a+" and "+b+" : "+ans2);
		System.out.println("div of "+a+" and "+b+" : "+ans3);
		System.out.println("mul of "+a+" and "+b+" : "+ans4);
		
	}
	
}


