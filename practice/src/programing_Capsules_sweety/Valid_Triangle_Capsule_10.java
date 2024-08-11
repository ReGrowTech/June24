package programing_Capsules_sweety;

import java.util.Scanner;

public class Valid_Triangle_Capsule_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // calculate area of triangle by taking user input  
				// 3 side of triangle 
				// sum of 2 side is greater than the third side 
				
				Scanner sc =new Scanner (System.in);
				System.out.print("Enter  side 1 :  ");
				int s1= sc.nextInt();
				System.out.print("Enter  side 2 :  ");
				int s2= sc.nextInt();
				System.out.print("Enter  side 3 :  ");
				int s3= sc.nextInt();
				
				if( (s1+s2>=s3)&&(s1+s3>=s2)&&(s2+s3>=s1))
				{
					System.out.println("It's a valid tringle ");
				}
				else
				{
					System.out.println("It's not a  valid tringle ");
				}
				
				
				
				
	}

}
