package java_Practice;

public class Palindrome_num {

	public static void main(String[] args) {
		int num=1221,temp=num,rev_num=0;
		
		while(temp>0) {
			int r=temp%10;
			rev_num=rev_num*10+r;
			temp=temp/10;
		}
		if(rev_num==num) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}

	}

}
