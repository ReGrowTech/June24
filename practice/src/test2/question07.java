package test2;
import java.util.*;
public class question07 {
public static void main (String[]args) {
	
//int temp = 21;
//String result = (temp>30)?"hot":(temp>=15 && temp<=30)?"warm":"cold";
//System.out.println(result);
	Scanner sc = new Scanner (System.in);
	System.out.println("the degree of weather is");
	
	int deg = sc.nextInt();
	String result = (deg>30)?"hot":(deg>=15 && deg<=30)? "warm":"cold";
	System.out.println(result);
	
	
	
	
	
	
	
}
}
