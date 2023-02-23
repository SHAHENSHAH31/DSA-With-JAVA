package backtracking;
import java.util.Scanner;
public class RatInAMaze {
	/*public  static boolean ratInAMaze(int maze[][]) {
		int n=maze.length;
		int path[][]=new int[n][n];
		return ratInAMaze( maze, path, 0, 0, n); 
	}*/
public static boolean ratInAMaze(int maze[][],int path[][],int i,int j,int n) {
	if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1) {
		return false;
	}
	path[i][j]=1;
	if(i==n-1&&j==n-1) {
		return true;
	}
	if(ratInAMaze(maze,path,i-1,j,n)) {
		return true;
	}
	if(ratInAMaze(maze,path,i,j+1,n)) {
		return true;
	}
	if(ratInAMaze(maze,path,i+1,j,n)) {
		return true;
	}
	if(ratInAMaze(maze,path,i,j-1,n)) {
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int maze[][]=new int[n][n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
	maze[i][j]=sc.nextInt();
	}
}
int path[][]=new int [n][n];
System.out.println(ratInAMaze(maze,path,0,0,n));

	}

}
