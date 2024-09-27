package capsule_26_bySweety;

public class Two_D_Array_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [][] ={{2,9,6} , {7,86,35} , {4,8,90} };
	
		for(int r =0;r<a.length ;r++)
		{
			for(int c=0 ;c< a[r].length ;c++)
			{
			int n = a[r][c];	
			Two_D_Array_even.even_concept(n);
			}
		}
	}
	public static void even_concept(int x)
	{
		if(x%2==0)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}
}


