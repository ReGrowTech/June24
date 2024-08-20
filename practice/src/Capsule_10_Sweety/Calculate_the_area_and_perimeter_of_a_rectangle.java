package Capsule_10_Sweety;

public class Calculate_the_area_and_perimeter_of_a_rectangle
 {
     public static void main(String[] args)
     {
         System.out.println("Wap to calculate the area and perimeter of a rectangle ");
         double length = 5.0; // actual length
         double width = 3.0; //  actual width


         double area = length * width;


         double perimeter = 2 * (length + width);


         System.out.println("Length: " + length);
         System.out.println("Width: " + width);
         System.out.println("Area of the rectangle: " + area);
         System.out.println("Perimeter of the rectangle: " + perimeter);
     }
 }
