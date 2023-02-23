package recursion1;
import java.util.Scanner;
public class ReturnKeyPadCode {
public static String outputKeypad(int n) {
	  if(n==2){
          return "abc";
      }
      if(n==3){
          return "def";
      }
      if(n==4){
          return "ghi";
      }
      if(n==5){
          return "jkl";
      }
      if(n==6){
          return "mno";
      }
      if(n==7){
          return "pqrs";
      }
      if(n==8){
          return "tuv";
      }
      if(n==9){
          return "wxyz";
      }
      return "";
  }

public static String[] keypad(int input) { 
	if(input==0) {
		String [] output=new String[1];
		output[0]="";
		return output;
	}
	String [] smallOutput=keypad (input/10);
	int n=input%10;
	String s=outputKeypad(n);
	String Output[]= new String [smallOutput.length*s.length()];
	int k=0;
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<smallOutput.length;j++) {
			Output[k]=smallOutput[j]+s.charAt(i);
			k++;
		}
	}
	return Output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter numper for string combination");
int input=sc.nextInt();
String[] output=keypad(input);
for(int i=0;i<output.length;i++) {
	System.out.println(output[i]);
}
	}
	

}
