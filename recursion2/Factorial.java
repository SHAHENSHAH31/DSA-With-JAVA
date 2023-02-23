package recursion2;

public class Factorial {
	public static void factorial(int input,int ans) {
		if(input==0) {
			System.out.println(ans);
			return;
		}
		ans=input*ans;
		factorial(input-1,ans);
	}
public static int factorial1(int input) {
	if(input==1) {
		return 1;
	}
	int ans= input*factorial1(input-1);
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
System.out.println(factorial1(n));
factorial(n,1);
	}

}
