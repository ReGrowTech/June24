package functions_shad;

public class Printer {

	
	    // Non-returning method (void) to print a message
	    void printMessage(String message) {
	        System.out.println("Message: " + message); // Prints the message
	    }

	    // Non-returning method (void) to print a greeting
	    void greet() {
	        System.out.println("Hello, World!"); // Prints a greeting message
	    }
	

	
	    public static void main(String[] args) {
	        Printer printer = new Printer();
	        
	        // Call non-returning methods
	        printer.printMessage("Welcome to Java!"); // Output: Message: Welcome to Java!
	        printer.greet();                        // Output: Hello, World!
	    }
	}


