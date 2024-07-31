package while_loop;

public class Count_Dig {

	public static void main(String[] args) {
		int n = 4632;
		int count = 0;
		
		while(n>0)
		{
			n=n/10;
			count++;
	}
		System.out.println(count);
	}
	

}
