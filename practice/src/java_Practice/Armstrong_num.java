package java_Practice;

public class Armstrong_num {

	public static void main(String[] args) {
		int num=153,temp=num;
		double sum=0.0D;
		while (temp>0) {
			int r=temp%10;
			sum=sum+Math.pow(r,3);
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("It is armstrong number");
		else
			System.out.println("It is not armstrong number");

	}

}
