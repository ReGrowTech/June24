package capsules.capsules_V;

public class Find_Output {

	public static void main(String[] args) {
		
// Question 1.
		int x = 3;
		int z = ++x + ++x + x++ + ++x + x++ ;
		System.out.println(x);
		System.out.println(z);
		
		
		int n = 3;
		n = ++n + ++n + n++ + ++n + n++ ;
		System.out.println(n);

//Question 2.
		
		System.out.println('a' + "ReGrow" + 1 + 7 + 3);
		
		System.out.println('a' + 'b' + "ReGrow" + 1 + 7 + 3);
		
		System.out.println('a' + 'b' + "ReGrow" + 1 + 7 + (3 + 1 ));
		
		System.out.println('a' +  1 + "ReGrow" + 1 +  7 + 3);
		
		System.out.println('a' + 'b' + "ReGrow" + 1 + 7 + 3  + 'A');
		
		System.out.println('a' + "ReGrow" + 1 + 7 + (3 + 'a'));
		

	}

}
