package test2;

public class question12 {

	public static void main(String[] args) {
int age = 15;
String result = (age>0 && age<12)?"child":(age>13 && age<19)?"teen":(age>=20 && age>=59)?"adult":"senior";
System.out.println(result);
	
int age1 = 58;
String res = (age1>0 && age1<12)? "child":(age1>13 && age1<19)?"teen":(age>=20 && age1>=59)?"adult":"senior";
System.out.println(res);
	
	

}
}