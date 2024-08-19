package caps_14_shad;

public class Do_While_Count_Num {

	public static void main(String[] args) {
		
//Q7.WAP to Count no of Digits Using DO-While Loop.
		
		int n = 8789;
		int cnt = 0;
		
		do {
			n = n / 10;
			cnt++;
		}
		while(n>0);
		System.out.println("Number of digits : "+cnt);
	}

}
