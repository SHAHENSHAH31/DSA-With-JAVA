package string1;

public class Reversed {
	public static String stringReversed(String str) {
		String reversed="";
	for(int i =0;i<str.length();i++) {
		 reversed= str.charAt(i)+reversed;
	}
	return reversed;
	}
	public static void main(String[] args) {
		String str="abcde";
		String reversed=stringReversed(str);
		System.out.print(reversed);
	}

}
