package Capsule_16_Sweety;



public class Factorial_of_no_using_For_loop
{
    public static void main(String[] args)
    {
        System.out.println(" WAP to print the factorial of a number using for loop ");
        // factorial of a number =5 >>>>>  5*4*3*2*1


        int num=5;
        int factorial=1;

        for(int i=num;i >0 ;i--)
        {
            factorial= factorial*i;

        }
        System.out.println(" Factorial of "+num +" is "+factorial);
    }
}
