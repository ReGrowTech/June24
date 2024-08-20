package Capsule_17_Sweety;

public class Swapping_using_third_variable
{
    public static void main(String[] args) {
        System.out.println(" Write a program to swap two number using third variable ");

        int num1=10;
        int num2=15;

        System.out.println(" num1 value is "+num1);
        System.out.println(" num2 value is "+num2);
        System.out.println(" Befor swaping the value ");
        System.out.println("_____________________________________");
        System.out.println(" number after the swap ");
        int temp=0;
        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println(" num1 "+num1);
        System.out.println(" num2 "+num2);
    }
}
