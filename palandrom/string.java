package palandrom;
import java.util.Scanner;
public class string {
	public static String palandromi(String s1,int si,int ei) {
		String s="";
		while(si==ei) {
		if(s1.charAt(si)==s1.charAt(ei)) {
			s=s+s1.charAt(si);
			si++;
			ei--;
		}
		else { 
			si++;
		}
		}
		return s;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	int si=0;
	int ei=s1.length()-1;
String s=palandromi(s1,si,ei);
System.out.print(s);
}
}
