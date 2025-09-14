// WAP to print largest and smallest number. 
import java.util.Scanner;
class maxmin{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three values : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int l=a,s=a;
		if(b>l)
			l=b;
		if(c>l)
			l=c;
		System.out.println(l + " is the largest number");
		if(b<s)
			s=b;
		if(c<s)
			s=c;
		System.out.println(s + " is the smallest number");
	}
}
