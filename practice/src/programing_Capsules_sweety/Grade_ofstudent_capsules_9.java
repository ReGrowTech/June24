package programing_Capsules_sweety;

import java.util.Scanner;

public class Grade_ofstudent_capsules_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("________________________________________________________________________");
	        System.out.println(" Write a program to print the grade according to the marks obtain");
	        System.out.println(" 90%  A");
	        System.out.println(" 85% to 90%   B");
	        System.out.println(" 85% to 80%   C");
	        System.out.println(" 80% to 70%   D");
	        System.out.println(" 70% to 60%   E");
	        System.out.println(" 60% to 50%   Poor");
	        System.out.println("________________________________________________________________________");

	        Scanner sc = new Scanner (System.in);
	        System.out.println(" Enter  student  marks obtain ");
	        int marks=sc.nextInt();

	        String Grade;
	        if(marks>90)
	        {
	            Grade="A";

	        }
	        else if (marks>85 && marks<90)
	        {
	            Grade="B";

	        }
	        else if (marks>80 && marks<85)
	        {
	            Grade="C";

	        }
	        else if (marks>70 && marks<80)
	        {
	            Grade="D";

	        }
	        else if (marks>60 && marks<70)
	        {
	            Grade="E";

	        }
	        else
	        {
	            Grade=" Poor ";

	        }
	        System.out.println(" Grade of the Student "+Grade);
	   

	}

}
