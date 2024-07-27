package switch_;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Enter 'F' for Fan , 'L' for Light");
		
		char option = 'L';
		
		switch(option)
		{
		case 'F':
			System.out.println("Switch on the Fan");
			break;
		
		case 'L':
			System.out.println("Switch on the Light");
			break;
		
		default :
			System.out.println("Invalid input");            
		}

	}

}
