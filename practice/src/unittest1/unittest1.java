package unittest1;

public class unittest1 {
public static void main (String[]args) {
//Q1 why is java called platform independent?
	
//java is called platform independent because java compiler compile the source code into byte code and this byte can run in any platform that have jvm install in it.	

//Q3 a 
	
	System.out.println("Difficult"+(5+3*2)+ 'X' +4/2);
	System.out.println('A'+"BC"+(2+3*(4-1))+'Z');
	System.out.println((2+3)+"STR"+('a'+5)+"ING"+(4*2));
	
	
//Q5 write a program that take a name and age as input,add 5 to the age and print the result in the format"Name@Age"?
	
	String name = ("SHAKIR");
	int age = 18;
	System.out.println(name+"@"+(5+age));
	
	
//Q6 convert the character ch='z' into an integer and print the result.
	
	char ch = 'z';
	int y = ch;
	System.out.println(y);
			
//Q6 convert the int number = 256 into a String and print the result;
	
	int num = 256;
	String ab = String.valueOf(num);
	System.out.println(ab);
	
//Q7 
	
	int x = 8;
	int a = x++ + ++x + x-- + --x + x++ + x-- + ++x;
	System.out.println("the value of x "+ x);
	System.out.println("the value of a "+a);
	
	
//Q8 WAP to print the greatest of 2 number without using if else
	int n1= 557;
	int n2= 67;
	String result=(n1>n2)? "n1 is greater":"n2 is greater"; 
	System.out.println(result);
	
	
//Q9 WAP to print the weather the year is leap year or not using nested if else
	int yr = 2000;
	if (yr%100==0)
	{
	if(yr%400==0)
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}
	}
	else if(yr%4==0 && yr%100!=0)
	{
		System.out.println("leap year");
	}
	else 
	{
		System.out.println("not a leap year");
	}
	
	
//Q10 WAP to print the character is alphabet ,special character or digit?
	char bc = '8';
	String res = (bc>='A' && bc<='Z')||(bc>='a' && bc>='z')? "alphabet":(bc>='0' && bc<='9')?"digit":"special character";
	System.out.println(res);
	
//Q11 
	
	int z = 10;
	int c = z-- + ++z + z++ + --z + z-- + ++z + z++ + --z;
	System.out.println(z);
	System.out.println(c);
	
//Q12 WAP To print the number is even or odd using if else 
	
	int b1 = 36;
	if (b1%2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
