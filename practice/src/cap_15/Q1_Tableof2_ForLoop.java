package cap_15;

public class Q1_Tableof2_ForLoop {

	public static void main(String[] args) {
		//using for - loop
		int n = 2;
		for(int i = 1; i<=10; i++)
		{
			System.out.println(n + " X " + i + " = " + (n*i));
		}

		
		//using while-loop
		int j = 1;
		int s =3;
		while(j<=10)
		{
			System.out.println(s + " X " + j + " = " + (s*j));
			j++;
		}
	}

}
