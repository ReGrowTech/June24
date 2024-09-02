package caps_28_shad;

class Calling_Non_Static {

//Can we call a non-static method to a static method? If yes, then how
	
	public static void main(String[] args) {
		
		Calling_Non_Static.static_pro("Hello,");

	}
	
	public static void static_pro(String msg)
	{
		System.out.println(msg + "My name is shadab");
		
		Calling_Non_Static obj = new Calling_Non_Static();
		obj.non_static(23);
	}
	
	public void non_static(int age)
	{
		System.out.println("I am " + age + " years old");
	}

}
