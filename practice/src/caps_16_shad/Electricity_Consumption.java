package caps_16_shad;

public class Electricity_Consumption {

	public static void main(String[] args) {
		
//3.WAP to print the cost of electricity consumption, based on the no. of unit.
//		a. 1 to 100 Units - Free.
//		b. 101 to 200 Units - Rs 10/unit.
//		c. 201 to 300 Units - Rs 20/unit. 
//		d. 301 and above Rs 25/unit.
		
		int ele_un = 300;
		int bill = 0;
		
		if(ele_un > 100 && ele_un <= 200)
		{
			bill = (ele_un - 100)*10;
			System.out.println("Your bill amount is : " + bill);
		}
		else if(ele_un > 200 && ele_un <= 300)
		{
			bill = 1000 + (ele_un - 200)*20;
			System.out.println("Your bill amount is : " + bill);
		}
		else if (ele_un > 300)
		{
			bill = 1000 + 2000 + (ele_un - 300)*25;
			System.out.println("Your bill amount is : " + bill);
		}
		else
		{
			System.out.println("Your bill amount is : " + bill);
		}
	}

}
