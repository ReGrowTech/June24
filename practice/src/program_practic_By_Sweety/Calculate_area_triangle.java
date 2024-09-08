package program_practic_By_Sweety;

import java.util.Scanner;

public class Calculate_area_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // calculate area of triangle by taking user input  
		// 3 side of triangle 
		// sum of 2 side is greater than the third side 
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter  side 1 :  ");
		int s1= sc.nextInt();
		System.out.println("Enter  side 2 :  ");
		int s2= sc.nextInt();
		System.out.println("Enter  side 3 :  ");
		int s3= sc.nextInt();
		
		if( (s1+s2>=s3)&&(s1+s3>=s2)&&(s2+s3>=s1))
		{
			System.out.println("It's a valid tringle ");
		}
		else
		{
			System.out.println("It's not a  valid tringle ");
		}
		
		double peri =s1 + s2 + s3 ;
		double semi =(s1+s2+s3)/0.5;
		
		double area =Math.sqrt(semi *(semi-s1)*(semi-s2)*(semi-s3));
		
		
		System.out.println("Perimeter of Triangle "+peri);
		System.out.println("Area of the triangle "+area);
		
		
		
	}

}
