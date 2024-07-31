package cap_16;

public class Q3_Electricity_Consumption {

	public static void main(String[] args) {
		int elecUnit = 305;
		int bill = 0;
		if(elecUnit>=1 && elecUnit<=100)
		{
		System.out.println(bill = elecUnit * 10);	
		}
		else if(elecUnit>=101 && elecUnit<=200)
		{
		System.out.println(1000+(elecUnit*10));	
		}
		else if(elecUnit>=201 && elecUnit<=300)
		{
			System.out.println(2000+(elecUnit*10));
		}
		else if(elecUnit>301)
		{
			System.out.println(3000+(elecUnit*25));
		}
		else
		{
			System.out.println(bill = 0);
		}
	}

}
