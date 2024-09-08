package programing_Capsules_sweety;

import java.util.Scanner;

public class Electric_consumed_capsule_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("calculates the cost of electricity consumption based on the number of units consumed :");
        
		Scanner sc= new Scanner (System.in);
		System.out.println(" Electricity consumed by the user :");
		double ec =sc.nextDouble();
		
		double cost =0;
		
		if(ec<=100)
		{
			cost = ec*10 ;
		}
		else if(ec<=200)
		{
			cost= 100*10 + (ec-100)*15;
		}
		else if(ec<=300)
		{
			cost= 100*10 + 100*15 +(ec-200)*20 ;
	    }
		else
		{
			cost=100*10 +100*15 +100*20 +(ec-300)*25;
		}
		
		
		System.out.println(" The total cost of electricity consumed by the user (cost )in Rs " +cost);
	}

}
