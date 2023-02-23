package dynamicprogramming2;

import java.util.Scanner;

public class MinnimumCostPath {
	public static int minCostPath(int arr[][],int i,int j,int n,int m,int dp[][]) {
		if(i==n-1&&j==m-1) {
			return arr[i][j];
		}
		if(i>=n||j>=m) {
			return Integer.MAX_VALUE;
		}
		int ans1,ans2,ans3;
		if(dp[i+1][j]==Integer.MIN_VALUE) {
		 ans1=minCostPath(arr,i+1,j,n,m,dp);
		dp[i+1][j]=ans1;
		}else {
		ans1=dp[i+1][j];
		}
		if(dp[i][j+1]==Integer.MIN_VALUE) {
		 ans2=minCostPath(arr,i,j+1,n,m,dp);
		 dp[i][j+1]=ans2;
		}else {
			ans2=dp[i][j+1];
		}
		if(dp[i+1][j+1]==Integer.MIN_VALUE) {
		 ans3=minCostPath(arr,i+1,j+1,n,m,dp);
		 dp[i+1][j+1]=ans3;
		}else {
			ans3=dp[i+1][j+1];
		}
	     return arr[i][j]+Math.min(ans1,Math.min(ans2, ans3));
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[][]=new int [n][m];
	int dp[][]=new int[n+1][m+1];
	for(int j=0;j<m;j++) {
		for(int i=0;i<n;i++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int j=0;j<m;j++) {
		for(int i=0;i<n;i++) {
			dp[i][j]=Integer.MIN_VALUE;
		}
	}
	int ans=minCostPath(arr,0,0,n,m,dp);
	System.out.println(ans);
		}

	}

