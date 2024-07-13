package ternary_operator;

public class Greatest3No {
	 public static void main(String args[]){
			int  a = 23;
			int b = 246;
			int c = 99;
			int res = (a>b && a>c)? a : (b>c)? b : c;
			System.out.println(res);
	 }
}
