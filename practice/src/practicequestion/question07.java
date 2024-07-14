package practicequestion;
import java.util.Scanner;
public class question07 {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the degree");
int temp = sc.nextInt();
String res = (temp>=30)?"hot":(temp>=15 && temp<=30)?"warm":"cold";
System.out.println(res);
}
}
