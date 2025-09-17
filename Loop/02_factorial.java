import java.util.*;
class factorial{
	public static void main(String agr[]) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Enter n : ");
	      int n = sc.nextInt();
	      int i=1, fact=1;
	      while(i <= n){
	          fact *= i;
	          i++;
	      }
	         System.out.print("The factorial of "+n+" is : " + fact);
		
	}
}
