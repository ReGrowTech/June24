package capsule_27_bySweety;

import java.util.Scanner;

public class Leap_year {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a year: ");
	        int yr = sc.nextInt();
	        
	        // Call the checkYear method and pass the year
	        checkYear(yr);
	        

	    }
	    
	    public static void checkYear(int yr) // static function 
	    {
	        if ((yr % 100 == 0 && yr % 400 == 0) || (yr % 100 != 0 && yr % 4 == 0))
	        {
	            System.out.println(yr + " is a leap year.");
	        }
	        else 
	        {
	            System.out.println(yr + " is not a leap year.");
	        }
	    }
	}