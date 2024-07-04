
public class capsule07 {
public static void main(String[]args) {
	
//	WAP to find the leap year using if else
	
	int year = 2000;
	if((year%100==0 && year%400==0) || (year%4==0 && year%100!=0))
	{
		System.out.println("its a leap year");
	}
	else 
	{
		System.out.println("its not a leap year");
	}
	
	
//	WAP to find the year is leap year using if else 
	
//	int yr = 1900;
//	if((yr%100==0 && yr%400==0)||(yr%4==0 && yr%100!=0))
//		System.out.println("its a leap year");
//	else
//	{
//		System.out.println("its not a leap year");
//	}
	
//	WAP to find the leap year using nested if else
	int yr= 1900;
	if(yr%100==0)
	{
	if(yr%400==0)
	{
		System.out.println("its a leap year");
	}
	else
	{
		System.out.println("its not a leap year");
	}
	}
	
	else if(yr%4==0 && yr%100!=0)
	{
		System.out.println("its not a leap year");
	}
	else
	{
		System.out.println("its not a leap year");
	}
	
	int num = 0;
	if(num<0)
	{
		System.out.println("positive number");
	}
	else if (num>0)
	{
		System.out.println("negative number");
	}
	else {
		System.out.println("number is zero");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
