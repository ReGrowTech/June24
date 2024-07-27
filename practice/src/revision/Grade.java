package revision;

public class Grade {

public static void main(String [] args){

	int marks = 95;
	
	
	if(marks<=100)
	{
		if( marks <=35)
		{
			System.out.println("Fail...Better luck next time");
		}

		else if( marks <= 70)
		{
			System.out.println("You got D Grade");
		}

		else if( marks <= 80)
		{
			System.out.println("You got C Grade");
		}

		else if(marks <= 90)
		{
			System.out.println("You got B Grade");
		}
	
		else if( marks <= 100)
		{
			System.out.println("Congats.. You got A Grade");
		}
	}

	else
	{
		System.out.println("Idiot..Enter a valid marks");
	}
}
	



}
