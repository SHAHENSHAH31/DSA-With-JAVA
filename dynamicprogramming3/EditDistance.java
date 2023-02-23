package dynamicprogramming3;
import java.util.Scanner;
public class EditDistance {
	public static int minDistance(String s,String t,int dp[][]) {
		if(s.length()==0) {
			return t.length();
		}
		if(t.length()==0) {
			return s.length();
		}
		if(dp[s.length()][t.length()]!=0) {
			return dp[s.length()][t.length()];
		}
		if(s.charAt(0)==t.charAt(0)) {
			dp[s.length()][t.length()]=minDistance(s.substring(1),t.substring(1),dp);
		return minDistance(s.substring(1),t.substring(1),dp);
		}
		else {
		int delete=minDistance(s.substring(1),t,dp);
		int replace=minDistance(s.substring(1),t.substring(1),dp);
		int insert=minDistance(s,t.substring(1),dp);
		dp[s.length()][t.length()]=1+Math.min(delete,Math.min(replace, insert));
		return 1+Math.min(delete,Math.min(replace, insert));
		}
	}
	public static int editDistance(String s,String t) {
		int dp[][]=new int[s.length()+1][t.length()+1];
		int ans=minDistance(s,t,dp);
		return ans;
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String t=sc.next();
	int dp[][]=new int[s.length()+1][t.length()+1];
	int d=editDistance(s,t);
	System.out.print(d);
}
}
