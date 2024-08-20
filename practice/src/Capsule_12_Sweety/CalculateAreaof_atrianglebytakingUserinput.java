package Capsule_12_Sweety;

import java.util.Scanner;

public class CalculateAreaof_atrianglebytakingUserinput

 {
     public static void main(String[] args)
     {
         System.out.println(" Wap to calculate the area of a triangle by taking user input ");
         Scanner sc= new Scanner (System.in);

         System.out.print("Enter the base of the triangle: ");
         double base = sc.nextDouble();
         System.out.println("Base : "+base);


         System.out.print("Enter the height of the triangle: ");
         double height = sc.nextDouble();
         System.out.println("Height : "+height);

         // Calculate the area of the triangle
         double area = 0.5 * base * height;

         // Display the result
         System.out.println("The area of the triangle is: " + area);
     }
 }
