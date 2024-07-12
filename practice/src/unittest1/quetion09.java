package unittest1;

public class quetion09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q9 WAP to print the weather the year is leap year or not using nested if else
			int yr = 2000;
			if (yr%100==0)
			{
			if(yr%400==0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("not a leap year");
			}
			}
			else if(yr%4==0 && yr%100!=0)
			{
				System.out.println("leap year");
			}
			else 
			{
				System.out.println("not a leap year");
			}
}

}
