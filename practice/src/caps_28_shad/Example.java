package caps_28_shad;

public class Example {

	 public static void main(String[] args) 
	 {
		 staticMethod(); // Call the static method 
	  }
	 
	 	
	    public static void staticMethod() 
	    {
	        Example obj = new Example(); // Call the non-static method
	        obj.nonStaticMethod();
	    }

	    
	    public void nonStaticMethod() 
	    {
	        System.out.println("Non-static method called.");
	    }

	}


