package capsule_05;

public class capsule_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x = 3;
//		int z = ++x + ++x + x++ + ++x + x++;
//		System.out.println(x);
//		System.out.println(z);
		
		
		
		int x =3;
		   x = ++x + ++x + x++ + ++x + x++;
		   System.out.println(x);
		   
		   
		   
		   System.out.println('a'+ "ReGrow"+1+7+3);
		   System.out.println('a'+'b'+ "ReGrow"+1+7+3);
		   System.out.println('a'+'b'+ "ReGrow"+1+7+(3+1));
		   System.out.println('a'+1+ "ReGrow"+1+7+3);
		   System.out.println('a'+'b'+ "ReGrow"+1+7+3+'A');
		   System.out.println('a'+ "ReGrow"+1+7+(3+'a'));
		   
		   
		   int a = 55;
		   int b = 65;
		   int result= (b>a)? b:a;
		   System.out.println(result);
		   
		   
		   int n = 68;
		   String res= (n%2==0)? "even":"odd";
		   System.out.println(res);
		   
		   
		   int d= 10;
		   int e =2;
		   if(d>e)
		   {
			   System.out.println("the greatest number is"+d);
		   }
		   else
		   {
			   System.out.println("the greatest number is"+e);
		   }
		   
		   
		   int m1=36;
		   if(m1%2==0)
		   {
			   System.out.println("its a even number");
		   }
		   else 
		   {
			   System.out.println("its a odd number");
		   }
		   
		   int b1=35;
		   int b2 =34;
		   int b3 = 65;
		   if(b1>b2 && b1>b3)
		   {
			   System.out.println(b1+" is the greatest number ");
		   }
		   else if(b2>b1 && b2>b3)
		   {
			   System.out.println(b2+" is the greatest number ");
		   }
		   else {
			   System.out.println(b3+" is the greatest number ");
		   }
		   
		   

	}

}
