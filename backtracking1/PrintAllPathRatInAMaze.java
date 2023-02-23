package backtracking1;
import java.util.Scanner;
public class PrintAllPathRatInAMaze {
	//static String s="";
public static void printAllPathRatInAMaze(int arr[][],int path[][],int i,int j,int n) {
	if(i<0||i>=n||j<0||j>=n||arr[i][j]==0||path[i][j]==1) {
		return;
	}
	path[i][j]=1;
	if(i==n-1&&j==n-1) {
		for(int a=0;a<n;a++) {
			for(int b=0;b<n;b++) {
				System.out.print(path[a][b]+"");
			}
			System.out.println();
		}
		path[i][j]=0;
		return;
	}
	printAllPathRatInAMaze( arr, path, i-1, j, n);
	printAllPathRatInAMaze( arr, path, i, j+1, n);
	printAllPathRatInAMaze( arr, path, i+1, j, n);
	printAllPathRatInAMaze( arr, path, i, j-1, n);
	path[i][j]=0;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[][]=new int[n][n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		arr[i][j]=sc.nextInt();
	}
}
int path[][]=new int[n][n];
printAllPathRatInAMaze(arr,path,0,0,n);
	}

}
