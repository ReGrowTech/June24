package cap_14;

public class Q3_Continue_PrintEven {
	public static void main (String args[])
	{
		int a = 1;
		int n =20;
		
		System.out.println("The Even Numbers are =");
		while(a<=n)
		{
				if(a%2!=0)
				{
					a++;
					continue;
				}
				System.out.println(a);
				a++;
			}
		
		}
		
	}

