package Capsule_11_Sweety;

public class Score_range_according_to_the_score
   {
       public static void main(String[] args)
       {
           System.out.println(" Wap to print the score range according to the score ");
           int score = 97;
           String Grade;


           if (score >= 91 && score <= 100)
           {
               Grade= "A+";
               System.out.println("The score " + score + " is in the range 90-100. " +Grade);
           }
           else if (score >= 81 && score < 90)
           {

               Grade= "A";
               System.out.println("The score " + score + " is in the range 80-89. " +Grade);
           }
           else if (score >= 71 && score < 80)
           {
               Grade= "B+";
               System.out.println("The score " + score + " is in the range 70-79. " +Grade);
           }
           else if (score >= 61 && score < 70)
           {
               Grade= "B";
               System.out.println("The score " + score + " is in the range 60-69. " +Grade);
           }
           else if (score >= 51 && score < 60)
           {
               Grade= "C";
               System.out.println("The score " + score + " is in the range 50-59. " +Grade);
           }
           else if (score >= 41 && score < 50)
           {
               Grade= "D";
               System.out.println("The score " + score + " is in the range 41-50 " +Grade);
           }
           else if (score >= 40 )
           {
               Grade= "F ";
               System.out.println("Fail  " +Grade );
           }

       }
   }
