package unitTest2;

public class Q11_child_adult_teen_senior {
public static void main(String args[]) {
	int age = 24;
	String result = (age>=0 && age<=12)?"Child":(age>=13 && age<=19)?"Teen":(age>=20 && age<=59)?"Adult":
		"Senior";
	System.out.println(result);
}
}
