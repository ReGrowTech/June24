package practicefortest;
import java.util.*;
public class revision {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
//int n1 = sc.nextInt();
//System.out.println("enter 2nd number");
//int n2 = sc.nextInt();
//int res= (n1>n2)?n1:n2;
//System.out.println(res +"is greater");

//System.out.println('A'+"BC"+(2+3*(4-1))+'z');
//System.out.println((2+3)+"STR"+('a'+5)+"ING"+(4*2));
//
//String name= "SHAKIR";
//int age = 18;
//System.out.println(name+'@'+(age+5));
//
//
//char ch ='Z';
//int a = ch;
//System.out.println(a);
//
//
//int ab =556;
//String b=String.valueOf(ab);
//System.out.println(b);
//
//
//int x = 8;
//int c= x++ + ++x + ++x + x++ + x-- + ++x + x-- + x-- + x++ + --x;
//System.out.println(c);


//System.out.println("enter the year");
//int yr = sc.nextInt();
//if(yr%100==0)
//{
//	if(yr%400==0)
//	{
//		System.out.println("its a leap year");
//	}
//	else
//	{
//		System.out.println("not a leap year");
//	}
//}
// else if(yr%4==0)
// {
//    if(yr%100!=0)
// {
//    	System.out.println("its a leap year"); 
// }
// 
// }
// else 
// {
//	 System.out.println("not a leap year");
// }

//System.out.println("enter the number");
//char n1= sc.next().charAt(0);
//String result = (n1>='A' && n1<='Z')||(n1>='a' && n1<='z')?"Alphabet":(n1>='0' && n1<='9')?"digit":"special character";
//System.out.println(result);

//int z = 10;
//int c = z-- + --z + z-- + ++z + z++ + z-- + ++z;
//
//System.out.println(c);
//System.out.println("enter the number");
////int n1 = sc.nextInt();
////if(n1%2==0)
//{
//	System.out.println("even number");
//}
//else
//{
//	System.out.println("odd number");
//	
//}
//int n1 = sc.nextInt();
//if(n1%3==0 && n1%7==0)
//{
//	System.out.println("divisible by both 3 and 7");
//}
//else if(n1%3==0)
//{
//	System.out.println("divisible by 3 only");
//}
//else if(n1%7==0)
//{
//	System.out.println("divisible by 7 only");
//}
//else
//{
//	System.out.println("invalid number");
//}

int temp = 34;
//String res = (temp>30)?"Hot":(temp>=15 && temp<=30)?"warm":"cold";
//System.out.println(res);
if(temp>30)
{
	System.out.println("hot");
	
}
else if(temp>=15 && temp<=30)
{
	System.out.println("warm");
	
}
else {
	System.out.println("cold");
}



int item = 91;
String res = (item>=10)? "eligible":"not eligible";
System.out.println(res);



int num= -8;
//String reult =(num>0 && num%2==0)?"positive and even":(num<0 && num%2==0)?"negative and even":"invalid number";
//System.out.println(reult);

if(num>0 && num%2==0)
{
	System.out.println("positiv number and even");
}
else if(num<0 && num%2==0)
{
	System.out.println("negative number and even");
}
else
{
	System.out.println("invalid number");
}


int age = 75;
if(age>0 && age<12)
{
	System.out.println("child");

}
else if(age>13 && age<19)
{
	System.out.println("teen");
}

else if(age>20 && age<59)
{
	 System.out.println("adult");	
}

 else
 {
	 System.out.println("senior");
 }






}
}











