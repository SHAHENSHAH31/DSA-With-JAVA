package recursion8;
import java.util.Scanner;
public class MinnimumCostPath {
public static int minCostPath(int arr[][],int i,int j,int n,int m) {
	if(i==n-1&&j==m-1) {
		return arr[i][j];
	}
	if(i>=n||j>=m) {
		return Integer.MAX_VALUE;
	}
	int ans1=minCostPath(arr,i+1,j,n,m);
	int ans2=minCostPath(arr,i,j+1,n,m);
	int ans3=minCostPath(arr,i+1,j+1,n,m);
     return arr[i][j]+Math.min(ans1,Math.min(ans2, ans3));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int arr[][]=new int [n][m];
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		arr[i][j]=sc.nextInt();
	}
}
int ans=minCostPath(arr,0,0,n,m);
System.out.println(ans);
	}

}
