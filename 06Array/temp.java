
public class 2D_display
{
	public static void main(String[] args) {
	    int [][] arr = {{1,2,3},
	                {4,5,6},
	                {7,8,9}
	    };
	        int n = 3;  // number of row  ==> arr.length
	        int m = 3;  // number of column ==> arr[0].length
	        
	        for(int i=0 ; i<arr.length ; i++){  // i = 0 , 1
	            for(int j=0 ; j<arr[0].length ; j++){   // j = 0
	                System.out.print(" "+arr[i][j]);
	            }
	            System.out.println();
	        }
	    }
	
	}

