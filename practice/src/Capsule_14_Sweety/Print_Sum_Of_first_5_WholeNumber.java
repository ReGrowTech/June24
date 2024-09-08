package Capsule_14_Sweety;

public class Print_Sum_Of_first_5_WholeNumber
{
    public static void main(String[] args)
    {
        System.out.println("WAP to print the Sum Of first 5 Whole  Number  ");

        int sum = 0;
        System.out.println(" Sum value variable  :"+sum);

        for (int i=0 ; i<=5; i++)//ilteration 0,1,2 3 4 5
        {
            System.out.println(i);//0 1 2 3 4

            sum += i ;//0+0 =0 , 0+1=1 , 0+2 ,0+3 , 0+4 ,0+5


        }
        System.out.println(" sum of all the Natural no   "+sum);// 1+2+3+4+5= 15
    }
}
