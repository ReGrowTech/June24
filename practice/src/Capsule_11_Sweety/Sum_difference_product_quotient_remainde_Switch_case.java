package Capsule_11_Sweety;

public class Sum_difference_product_quotient_remainde_Switch_case
 {
     public static void main(String[] args)
     {
         System.out.println(" Wap to print the sum ,difference , product , quotient , remainde ");
         System.out.println(" Two number  based on an operator (Using Switch case )");

         int  num1 = 255;
         int  num2 = 9;
         System.out.println(" num1 :"+num1);
         System.out.println(" num2 :"+num2);

         char operator = '%';
         System.out.println(" operator used  : "+operator);


         switch (operator) {
             case '+':
                 System.out.println("The sum is: " + (num1 + num2));
                 break;
             case '-':
                 System.out.println("The difference is: " + (num1 - num2));
                 break;
             case '*':
                 System.out.println("The product is: " + (num1 * num2));
                 break;
             case '/':
                 if (num2 != 0) {
                     System.out.println("The quotient is: " + (num1 / num2));
                 } else {
                     System.out.println("Error! Division by zero.");
                 }
                 break;
             case '%':
                 if (num2 != 0) {
                     System.out.println("The remainder is: " + (num1 % num2));
                 } else {
                     System.out.println("Error! Division by zero.");
                 }
                 break;
             default:
                 System.out.println("Invalid operator. Please use one of +, -, *, /, %.");
                 break;
         }
     }
 }
