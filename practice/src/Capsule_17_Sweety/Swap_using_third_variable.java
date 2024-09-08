package Capsule_17_Sweety;

public class Swap_using_third_variable
{
    public static void main(String[] args) {
        System.out.println(" Wap to swap 2 number without using the 3rd variable");

        int num1=10;
        int num2=20;
        System.out.println(" num1 value is "+num1);
        System.out.println(" num2 value is "+num2);
        System.out.println(" Before swapping the value ");

        num1=num1+num2;// 10+20 = 30

        num2=num1-num2;//30-20=10

        num1=num1-num2;//30-10=20

        System.out.println("after swapping the value ");
        System.out.println(" num1 value "+num1);
        System.out.println(" num2 value "+num2);

    }
}
