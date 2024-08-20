package Capsule_17_Sweety;

public class Fibonacci_series
{
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        // next number is the sum of the previous two no
        // like 0+1=1
        // like 1+1=2

        int num=8;

        int first_no=0 ;
        int sec_no=1;

        int next_num;

        System.out.print("fibonacci series  " + first_no +" ,"+ sec_no +" ,");// the above print statement is for the first no and the second no

        for (int loop_ilt=1;loop_ilt<=num;loop_ilt++)
        {
            next_num=first_no+sec_no;
            System.out.print(next_num+ " ,");

            first_no=sec_no;
            sec_no=next_num;
        }



    }
}
