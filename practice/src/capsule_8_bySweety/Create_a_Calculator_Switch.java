package capsule_8_bySweety;

import java.util.*;

public class Create_a_Calculator_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Simple calculator ");
		System.out.println(" Choice + =  Addition Operator");
		System.out.println(" Choice - =  Substraction Operator");
		System.out.println(" Choice * =  Multiply Operator");
		System.out.println(" Choice / =  Divide Operator");
		System.out.println(" Choice % =  Mode Operator");
		System.out.println();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 no  :  ");
		int a= sc.nextInt ();
		int b= sc.nextInt();
		
		System.out.println();
		System.out.print("Enter Your Choice  :  ");
		char ch = sc.next().charAt(0);
		
		System.out.println();
		
		switch(ch)
		{
		case '+' : int add = a+b ;
		           System.out.println(" addition of 2 no  "+ add );
		           break ;
		           
		case '-' : int sub = a-b ;
                   System.out.println(" subtracion of 2 no  "+ sub );
                   break ;
                    
		case '*' : int mul = a*b ;
                   System.out.println(" multiply of 2 no  "+ mul );
                   break ;
                    
		case '/' : int div = a/b ;
                 System.out.println(" division of 2 no  "+ div );
                 break ;    
                    
		case '%' : int mod = a%b ;
                 System.out.println(" modulus of 2 no  "+ mod );
                 break ;    
                    
                    
                default : System.out.println(" Invalide Choice  " );
                    
                    
		}
	}

}
