package programing_Capsules_sweety;

import java.util.Scanner;

public class Leap_year_capsule_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) 
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0) 
                {
                    System.out.println(year + " is a leap year.");
                }
                else
                {
                    System.out.println(year + " is not a leap year.");
                }
            }
            else 
            {
                System.out.println(year + " is a leap year.");
            }
        }
        else 
        {
            System.out.println(year + " is not a leap year.");
        }   
	}

}
