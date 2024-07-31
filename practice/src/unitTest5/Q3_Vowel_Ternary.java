package unitTest5;

public class Q3_Vowel_Ternary {

	public static void main(String[] args) {
		char ch = 'e';
		String res = ((ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' || ch =='U')||
				(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
				?"Vowel":"Consonent";
		System.out.println(res);
	}

}
