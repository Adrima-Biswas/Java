//WAP to print odd and even number
import java.util.Scanner;
class oddeven {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
        
        if(n%2==0)
        	System.out.println(n + " is the even number");
        else
        	System.out.println(n + " is the odd number");
    }
}
