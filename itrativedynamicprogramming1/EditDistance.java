package itrativedynamicprogramming1;
import java.util.Scanner;
public class EditDistance {
public static int editDistance(String s,String t) {
	int m=s.length();
	int n=t.length();
	int dp[][]=new int[m+1][n+1];
	for(int i=0;i<=m;i++)
		dp[i][0]=i;
		for(int j=0;j<=n;j++) 
			dp[0][j]=j;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}else {
					dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1], dp[i-1][j]));
				}
			}
		}
		return dp[m][n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 String s=sc.next();
String t=sc.next();
int ans=editDistance(s,t);
System.out.print(ans);

	}
}
