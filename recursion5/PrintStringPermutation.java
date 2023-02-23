package recursion5;
import java.util.Scanner;
public class PrintStringPermutation {
public static void printStringPermutation(String input,String output) {
	if(input.length()==0) {
		System.out.println(output);
		return;
	}
	for(int i=0;i<input.length();i++) {
		char c=input.charAt(i);
		String left=input.substring(0,i);
		String right=input.substring(i+1);
		String s=left+right;
		printStringPermutation(s, output+c);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input=sc.next();
printStringPermutation(input,"");
	}

}
