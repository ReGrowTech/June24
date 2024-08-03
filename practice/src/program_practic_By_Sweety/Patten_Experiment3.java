package program_practic_By_Sweety;

public class Patten_Experiment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='e';
		for(char row='a';row<=ch;row++)
		{
			for(char colum='a';colum<=(ch-row+1);colum++)
			{
				System.out.print(" ");
			}
			
			for(char str ='a';str<=row;str++)
			{
				
				System.out.print(str);
			}
			System.out.println();
		}
	}

}
