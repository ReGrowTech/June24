package practicequestion;
import java.util.*;
public class question11 {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int num = sc.nextInt();
//String result = (age>=0 && age<=12)?"child":(age>=13 && age<=19)?"teen":(age>=20 && age<=59)?"adult":"Senior";
//System.out.println(result);

//if(age>=0 && age<=12)
//{
//	System.out.println("this is child");
//}
//else if (age>=13 && age<=19)
//{
//	System.out.println("this is teen");
//}
//else if (age>=20 && age<=59)
//{
//	System.out.println("this adult");
//}
//else
//{
//	System.out.println("senior");
//}
//String result= (num>0)?"positive number":(num<0)?"negative number":"number is 0";
//System.out.println(result);
if(num%2==0 && num>0)
{
	System.out.println("the number is even and positive");
}
else if(num%2==0 && num<0)
{
	System.out.println("the number is even and negative");
}
else
{
	System.out.println("invalid number");
}
	












}
}
