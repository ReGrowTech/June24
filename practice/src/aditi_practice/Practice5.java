package aditi_practice;

public class Practice5 {
	
	public void display() {
		int a = 5;
		int b = 6;
		int sum = a+b;
		System.out.println("Addition of two numbers :  " + sum);
		
	}
	
	public int[] displayMul( int a1, int b1) {
		int mul = a1 + b1;
		System.out.println("Multiplication of two numbers : " + mul);
		
		return new int[] {mul};
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice5 sc = new Practice5();
		sc.display();
		 sc.displayMul(4, 5);
		}

}
