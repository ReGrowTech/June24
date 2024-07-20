package operators;

public class Un {
	

	
		
		public static void main(String[] args) {
			
			int a = 12;
			a++;
			System.out.println("a = 12, a++ : " + a);
			
			int b = 15;
			++b;
			System.out.println("b = 15, ++b : " + b);
			
	// Postfix
			
			int c = 5;
			System.out.println("c = 5 , c++ :  " + c++);
			System.out.println("value of c after operation : " + c);
			
			
	//Prefix
			
			int d = 10;
			System.out.println("d = 10, ++d : " + ++d);
			System.out.println("value of c after operation : " + d);
			
			
	//
			
			int i = 5;
			i = ++i + i++ + 1;
			System.out.println("i = 5, '++i + i++ + 1' : " + i);
			
	//
			
		    int j = 5;
			  j = ++j + j++ + 1;
			System.out.println("j = 5, '++j + j++ + 1' : " + j);
		
	//
			int x = 5;
			a = ++x + ++x + x++ + x++ + ++x;
			System.out.println("x = 5, value of x after operation : " + x);
			System.out.println("x = 5, '++x + ++x + x++ + x++ + ++x' : " + a);
			
			
			int o = 2;
			int p = ++o + o++ + ++o + ++o + o++ + ++o + 1;
			System.out.println("o = 2, value of o after operation : "+ o);
			System.out.println("o = 2, '++o + o++ + ++o + ++o + o++ + ++o + 1' : " + p);
			
	// Write a program to divide two numbers and print its quotient and remainder. 
			
			int q = 5;
			int r = 2;
			
			int ques = q/r;
			int rem = q%r;
			
			System.out.println("Quotient : " + ques + "  Remainder : "+ rem);
			
		
		}
	}
			
			



