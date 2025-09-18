import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int[][] arr= new int[3][3];
	    System.out.println("enter then value: ");
	    for(int i=0; i<arr.length; i++){
	        for(int j=0; j<arr[0].length; j++){
	            arr[i][j]= sc.nextInt();
	        }
	    }
	    int sum=0;
		System.out.println("Display: ");
		for(int i=0; i<arr.length; i++){
		    for(int j=0; j<arr[0].length; j++){
		        if(i==j){
		           sum = sum + arr[i][j];
		        }
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		    
		}
		System.out.println("sum "+sum);
	}
}
