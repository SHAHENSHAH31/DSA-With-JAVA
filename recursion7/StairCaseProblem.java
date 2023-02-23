package recursion7;
import java.util.Scanner;
public class StairCaseProblem {
public static void stairCase(int n,String path) {
	if(n<0) {
		return;
	}
	if(n==0) {
		System.out.println(path);
		return;
	}
	stairCase(n-1,path+"1");
	stairCase(n-2,path+"2");
	stairCase(n-3,path+"3");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
stairCase(n,"");
	}

}
