package programing_Capsules_sweety;

import java.util.Scanner;

public class Leap_year_using_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a year: ");
	        int year = scanner.nextInt();

	        switch (year % 4) 
	        {
	            case 0:
	            switch (year % 100)
	          {
	            case 0:
	            switch (year % 400)
	            {
	                        
	             case 0:
	             System.out.println(year + " is a leap year.");
	              break;
	                                
	              default:
	               System.out.println(year + " is not a leap year.");
	                       
	               }
	              break;
	              default:
	               System.out.println(year + " is a leap year.");
	               
	              }
	            
	                break;
	                default:
	                System.out.println(year + " is not a leap year.");
	        }
		
	}

}
