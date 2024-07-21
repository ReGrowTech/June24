package programing_Capsules_sweety;

import java.util.Scanner;

public class Shopping_ammount_capsule_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shopping amount: ");
        double amount = scanner.nextDouble();
        double discount = 0;

        // Calculate discount based on the amount
        if (amount <= 800) {
            discount = 0;
        } else if (amount <= 1500) {
            discount = amount * 0.10;
        } else if (amount <= 2500) {
            discount = amount * 0.15;
        } else if (amount <= 3000) {
            discount = amount * 0.20;
        } else {
            discount = amount * 0.30;
        }

        // Calculate final amount after discount
        double finalAmount = amount - discount;

        // Print original amount, discount, and final amount
        System.out.println("Original amount: Rs " + amount);
        System.out.println("Discount: Rs " + discount);
        System.out.println("Amount to be paid after discount: Rs " + finalAmount);

	}

}
