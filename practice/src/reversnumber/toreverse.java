package reversnumber;

public class toreverse {
public static void main(String[]args) {
	
int n=141;
int ld;
int rev =0;
int n1=(n=rev);
while(n<0)
{
	ld= n%10;
	n=n/10;
	rev= (rev*10)+ld;
}
	if(n==rev)
	{
		System.out.println("palin drome");
	}
	else
	{
		System.out.println("not a palin drome");
	}
	
	
	
	
	
	
}

}
