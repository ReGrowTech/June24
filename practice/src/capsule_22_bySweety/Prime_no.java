package capsule_22_bySweety;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr [][] = {{4,67,56,9},{2,1,91,7}};
	        
	        
	       for(int r = 0; r < arr.length; r++)
	        {
	          for(int c = 0; c < arr[r].length; c++)
	          {
	           int cnt = 0;
	                
	                
	           for(int i = 1; i <= arr[r][c]; i++) 
	           {
	                    if(arr[r][c] % i == 0) 
	                    {
	                        cnt++;
	                    }
	                }
	                
	               
	                if(cnt == 2) 
	                {
	                    System.out.println(arr[r][c]);
	                }
	            }
	        }
	}

}
