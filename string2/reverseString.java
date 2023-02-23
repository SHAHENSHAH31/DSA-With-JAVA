
package string2;
import java.util.Scanner;

public class reverseString {
	public static void reverseWordWise(String input) {
		int end=input.length()-1,start,j;
		String result="";
		String word="";
		for(int i=input.length()-1;i>=0;i--) {
			if(input.charAt(i)==' ') {
				 start=i+1;
				word="";
				for( j=start;j<=end;j++) {
					word+=input.charAt(j);
				}
				end=i-1;
				result=result+word+" ";
			}
			word="";
			for(j=0;j<=end;j++) {
				word+=input.charAt(j);
			}
			result+=word;
			System.out.print(result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
reverseWordWise(input);


	}

}
