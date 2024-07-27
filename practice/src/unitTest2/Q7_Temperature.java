package unitTest2;

public class Q7_Temperature {

	public static void main(String[] args) {
		int temp = 26;                                                                
		 String res = (temp>30)? "Hot":(temp>=15 && temp<=30)? "Warm" : "Cold";
		 System.out.println(res);

	}

}
