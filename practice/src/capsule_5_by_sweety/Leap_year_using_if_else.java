package capsule_5_by_sweety;

public class Leap_year_using_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int yr =2004;
		
		if((yr%100==0 && yr%400==0)||(yr%100==0 && yr%4==0))
		{
			System.out.println("its a leap year "+yr) ;
		}
		else
		{
			System.out.println("its not  leap year "+yr) ;
		}
		
	}

}
