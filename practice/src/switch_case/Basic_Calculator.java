package switch_case;

public class Basic_Calculator {
	public static void main(String args[]) {
	     int num1 = 27;
	     int num2 = 2;
	     char result = '/';
	     switch (result) {
	     case '+':
	    	 System.out.println("The addition of 2 number is :" + (num1 + num2));
	    	 break;
	     case '-':
	    	 System.out.println("The subtraction of 2 number is:" + (num1 - num2));
	    	 break;
	     case '*':
	    	 System.out.println("The multiplication of 2 number is:" + (num1 * num2));
	    	 break;
	     case '/' :
	    	 double div = (double)num1/num2;
	    		 System.out.println("The division of 2 number is:" + div);
	    	  break;
	    	 default:
	    			 System.out.println("Invalid Entry");
	    	 }
	     }
	}


