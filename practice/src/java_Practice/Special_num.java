package java_Practice;

public class Special_num {

	public static void main(String[] args) {

		int num=145;
		int temp=num,sum=0;
		
		while(temp>0) {
			int r=temp%10;
			int prod=1;
			for(int i=1;i<=r;i++) {
				prod=prod*i;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("It is special no ");
		else
			System.out.println("It is not special no ");
	}

}
