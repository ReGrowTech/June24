package program_practic_By_Sweety;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int num = 8;
		int fr=0;
		int se=1;
		int next_n;
		System.out.print(fr + " "+se +" ");
		
		for(int i=1;i<=num;i++)
		{
		next_n=fr+se;
		System.out.print(next_n +" ");
		
		fr=se;
		se=next_n;
		}
	}

}
