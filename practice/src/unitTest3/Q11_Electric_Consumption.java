package unitTest3;

public class Q11_Electric_Consumption {

	public static void main(String[] args) {
		int units = 321;
		if(units>301)
		{
			System.out.println("your Elec Cons is Rs-25/unit ");
		}
		else if(units>=201 && units<=300)
		{
			System.out.println("your Elec Cons is Rs-10/unit ");
		}
		else if (units>=101 && units<=200)
		{
			System.out.println("your Elec Cons is Rs-10/unit ");
		}
		else if(units>=1 && units<=100)
		{
			System.out.println("your Elec Cons is Rs-10/unit ");
		}
		else
		{
			System.out.println("your Elec Cons is Invalid ");
		}
	}

}
