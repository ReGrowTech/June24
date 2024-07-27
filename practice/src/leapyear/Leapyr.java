package leapyear;
public class Leapyr{
	public static void main(String args[]) {
		int yr=2024;
		if((yr%100==0)&&(yr%400==0) || (yr%100==0)&&(yr%4==0)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}
	}
}