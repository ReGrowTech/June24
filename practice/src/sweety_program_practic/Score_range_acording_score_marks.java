package sweety_program_practic;

import java.util.Scanner;

public class Score_range_acording_score_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             // give valid  grade according to the score 
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number Score or the marks : ");
		int marks=sc.nextInt();
		 String grade ;
		
		if(marks<=100 && marks>=90)
		{
		  grade="A+";	
		}
		else if(marks<=90 && marks>=81) 
		{
			grade ="A";
		}
		else if(marks<=80 && marks>=71) 
		{
			grade ="B+";
		}
		else if(marks<=70 && marks>=61) 
		{
			grade ="B";
		}
		else if(marks<=60 && marks>=51) 
		{
			grade ="C";
		}
		else if(marks<=50 && marks>=41) 
		{
			grade ="D";
		}
		else
		{
			grade="F";
		}
		
		System.out.println(marks +"  obtain by the student  "+"Grade are "+grade);
		
		
	}

}
