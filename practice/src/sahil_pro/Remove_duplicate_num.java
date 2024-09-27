package sahil_pro;

public class Remove_duplicate_num {

	public static void main(String[] args) {
				
				String str="H no 66 Line 06 77 8 7 9 1 0";
				String newStr="";
				for(int i=0;i<str.length();i++) {
					
					char ch=str.charAt(i);
					if(Character.isDigit(ch)) {
						newStr=newStr+ch;
					}
				}
				System.out.println("Non Duplicate numbers are:");
				for(int j=0;j<10;j++) {
					int count=0;
					for(int k=0;k<newStr.length();k++) {
						if(j==Character.getNumericValue(((newStr.charAt(k))))){
							count++;
						}
					}
					if(count<2&&count!=0) {
						System.out.print(j+" ");
						
					}
				}

			}

		}
