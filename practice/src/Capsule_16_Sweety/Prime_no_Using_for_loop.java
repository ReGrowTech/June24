package Capsule_16_Sweety;

public class Prime_no_Using_for_loop
{
    public static void main(String[] args) {
        System.out.println(" check whether a prime no or not ");

        int num=9;
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%10==0)
            {
                count++;
            } else if (count==2)
            {
                System.out.println(" its a prime no "+num);
            }
            else{ System.out.println(" its not a prime  no "+num);

            }

        }
    }
}
