package unit_test_II;

public class Persons_Age_Ternary {

	public static void main(String[] args) {
		
// Q11. Write a program use ternary operator to categorize a person's age into "Child", "Teen", "Adult" or senior. 
//		Consider ages 0-12 as "Child". 13-19 as "Teen", 20-59 as "Adult", and above 60 as "Senior".
		
		int age = 59;
		
		String categorize = (age >= 0 && age <= 12)? "Child" : (age >= 13 && age <= 19)? "Teen" : (age >= 20 && age <= 59)? "Adult" : "Senior";
		System.out.println(categorize);
		

	}

}
