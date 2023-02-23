package stringtointeger;
import java.util.Scanner;
public class conversion {
	public static int convertStringToInt(String input) {
		if(input.length()==1) {
			return input.charAt(0)-'0';
		}
		int ans=convertStringToInt(input.substring(1));
		int x=input.charAt(0)-'0';
		 x=x*(int)Math.pow(10, input.length()-1)+ans;
		return x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
String s=sc.nextLine();
System.out.print(conversion.convertStringToInt(s));
	}

}
