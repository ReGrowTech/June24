//WAP to print grade of a student depending upon GRADE


package if_else;

public class Grade_of_Student {
	public static void main(String args[])
	{
	  int marks = 75;
	if(marks>=91)
	{
	System.out.println("your grade is A");
	}
	else if (marks >= 81 && marks <=90)
	{
	System.out.println("your grade is B");
	}
	else if (marks >= 71 && marks <=80)
	{
	System.out.println("your grade is C");
	}
	else if (marks >= 50 && marks <=70)
	{
	System.out.println("your grade is D");
	}
	else
	{
	System.out.println("sorry you are fail");
	}
	}	
	}

