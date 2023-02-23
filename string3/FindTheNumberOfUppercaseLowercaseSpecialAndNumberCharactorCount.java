package string3;
import java.util.Scanner;
public class FindTheNumberOfUppercaseLowercaseSpecialAndNumberCharactorCount {
	static int upperCase=0,lowerCase=0,specialCase=0,numberCase=0;
	
public static void findTheNumberOfUppercaseLowercaseSpecialAndNumberCharactorCount(String s) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
			upperCase++;
		}
		else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
			lowerCase++;
		}
		else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
			numberCase++;
		}
		else {
			specialCase++;
		}
	}
	System.out.println("upper case count = "+upperCase);
	System.out.println("lower case count = "+lowerCase);
	System.out.println("special case count ="+specialCase);
	System.out.println("number case count ="+numberCase);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String si=sc.nextLine();
System.out.println("Enter any keybord Value "+si);
String s=sc.next();
findTheNumberOfUppercaseLowercaseSpecialAndNumberCharactorCount(s);
	}

}
