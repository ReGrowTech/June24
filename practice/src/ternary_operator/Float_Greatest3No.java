package ternary_operator;

public class Float_Greatest3No {
	 public static void main(String args[]){
			float num1 = 23.90f;
			float num2 = 24.10f;
			float num3 = 12.35f;
			float res = (num1 > num2 && num1 > num3)? num1 : (num2 > num3)? num2 : num3;
			System.out.println(res);
			}
			}
