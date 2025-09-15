import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the marks: ");
		int a =sc.nextInt();
		if(a>=90){
			System.out.println("outstanding");

		}
		else if(a>=80 && a<90){
			System.out.println("excellent");
		}
		else if(a>=70 && a<80){
			System.out.println("very good");
		}
		else if(a>=60 && a<70){
			System.out.println("good");
		}
		else if(a>=50 && a<60){
			System.out.println("fair");
		}
		else if(a>=40 && a<50){
			System.out.println("below average");
		}
		else if(a>=0 && a<40){
			System.out.println("failed");
		}
		else{
			System.out.println("Incomplete");
		}
		
	}
	
}
