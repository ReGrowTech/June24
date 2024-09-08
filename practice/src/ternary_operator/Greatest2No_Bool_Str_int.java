//WAP in ternary op to find the greatest of 2 numbers ans should be in number,string,boolean.

package ternary_operator;

public class Greatest2No_Bool_Str_int {
	 public static void main(String args[]){ 
			int num1 = 100;
			int num2 = 112;
			int res1 = (num1>num2)? num1 : num2;
			String res2 = (num1>num2)? "yes" : "no";
			boolean res3 = (num1>num2)? true : false;
			System.out.println("The greatest no is:" + res1);
			System.out.println("The greatest no is:" + res2);
			System.out.println("The greatest no is:" + res3);
		}

}
