package recursion4;
import java.util.Scanner;
public class PrintSubsequences {
public static void printSubsequences(String input,String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		printSubsequences(input.substring(1),output);
		printSubsequences(input.substring(1),output+input.charAt(0));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String input=sc.next();
		printSubsequences( input, "");
	}

}
