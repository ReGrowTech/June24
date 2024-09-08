package unit_test_II;

public class Eligibility_Ternary {

	public static void main(String[] args) {

//  Q9. Write a program using ternary operator to determine if a customer is eligible for a discount based on the number of items they purchased. 
//      If the customer buys more than 10 items, they are eligible for a discount, otherwise they are not eligible.
		
		
			int items = 12;
		
			String discount = (items > 10)? "Eligible" : "Not Eligible";
			System.out.println(discount);

	}

}
