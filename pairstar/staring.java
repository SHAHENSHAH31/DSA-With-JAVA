package pairstar;
import java.util.Scanner;
public class staring {
	public static String Star(String s) {
		if(s.length()==1) {
			return s;
		}
		String smaller=Star(s.substring(1));
		if(s.charAt(0)==smaller.charAt(0)) {
			return smaller=s.charAt(0)+"*"+smaller;
		}
		else {
			return smaller=s.charAt(0)+smaller;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.print(staring.Star(s));
	}

}
