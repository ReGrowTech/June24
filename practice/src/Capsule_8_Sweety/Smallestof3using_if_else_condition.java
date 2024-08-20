package Capsule_8_Sweety;

public class Smallestof3using_if_else_condition {
 public static void main(String[] args) {
  System.out.println("WAP in java to find the smallest of 3 no using if else condition");

  int num1 = 35640;
  int num2 = 54;
  int num3 = 740;
  System.out.println("num1    " + num1);
  System.out.println("num2    " + num2);
  System.out.println("num3    " + num3);


  if (num1 < num2 && num1 < num3)
  {
   System.out.println("it is the smalest no " + num1);

  }
  else if (num2 < num1 && num2 < num3)
  {
   System.out.println("it is the smallest no " + num2);

  }
  else
  {
   System.out.println("it is the smallest "+num3);
  }
 }
}