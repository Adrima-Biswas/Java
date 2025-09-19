import java.util.*;
public class Main
{
    public static int[] maxRevenue(int[][] salesRecord) {
        
	    int[] answer = new int[100];
	    
	    for(int i=0; i<salesRecord.length; i++){
	        int max = Integer.MIN_VALUE; // reset at evey time when you enter in a new row
	        for(int j=0; j<salesRecord[1].length; j++) {
	            if(salesRecord[i][j] > max) {
	                max = salesRecord[i][j];
	            }
	        }
	        answer[i] = max;
	    }
	    
	    return answer;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int day = sc.nextInt();
	    int product = sc.nextInt();
	    int[][] records = new int[day][product];
	    for(int i=0; i<day; i++){
	        for(int j=0; j<product; j++) {
	            records[i][j] = sc.nextInt();
	        }
	    }
	    
        int[] ans = maxRevenue(records);
        System.out.println("\nmaximum revenues: "+Arrays.toString(ans));
	}
}
