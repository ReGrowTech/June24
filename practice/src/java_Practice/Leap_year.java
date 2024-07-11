package java_Practice;

public class Leap_year {

	public static void main(String[] args) {
		int year=1900;
		
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println(year+" is leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}

	}

}
