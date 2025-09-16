import java.util.Scanner;
class dec
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      System.out.print("Enter x(Initial) and y(Final) : ");
      int x = sc.nextInt();
      int y = sc.nextInt();
      for(int i=x;i>=y;i--){   // x > y ;
            System.out.println(" " + i);
        }
	}
}
