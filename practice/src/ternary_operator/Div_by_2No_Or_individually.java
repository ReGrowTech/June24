//WAP to print the no which is divisible by both (3&7) or individually by 3 & 7 using ternary

package ternary_operator;

public class Div_by_2No_Or_individually {
	public static void main(String args[])
	{
	  int a = 21;
	String res = (a%3 == 0 && a%7 == 0)||(a%3 == 0 )||(a%7==0)?"is  divisible" : "is not 	divisible" ;
	System.out.println(res);
	}
	
}
