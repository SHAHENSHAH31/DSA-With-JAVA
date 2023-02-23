package itrativedynamicprogramming;
import java.util.Scanner;
public class fibbonaci {
public static int fibb(int n) {
	if(n==0||n==1) {
		return n;
	}
	int dp[]=new int[n+1];
	dp[0]=0;
	dp[1]=1;
	for(int i=2;i<=n;i++) {
		dp[i]=dp[i-1]+dp[i-2];
	}
	return dp[n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print(fibb(n));
	}

}
