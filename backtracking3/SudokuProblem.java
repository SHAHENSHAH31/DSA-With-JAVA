package backtracking3;
import java.util.Scanner;
public class SudokuProblem {
	public static void display(int [][]board) {
		for(int i=0;i<board[0].length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean isValid(int [][]board,int x,int y,int val) {
		for(int j=0;j<board[0].length;j++) {
			if(board[x][j]==val) {
				return false;
			}
		}
		for(int i=0;i<board.length;i++) {
			if(board[i][y]==val) {
				return false;
			}
		}
		int smi=x/3*3;
		int smj=y/3*3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[smi+i][smj+j]==val) {
					return false;
				}
			}
		}
		return true;
	}
public static void sudokuProblem(int [][]board,int i,int j) {
	if(i==board[0].length) {
		display(board);
		return;
	}
	int ni=0;
	int nj=0;
	if(j==board[0].length-1) {
		ni=i+1;
		nj=0;
	}else {
		ni=i;
		nj=j+1;
	}
	if(board[i][j]!=0) {
		sudokuProblem(board,ni,nj);
	}else {
		for(int po=1;po<=9;po++) {
			if(isValid(board,i,j,po)==true) {
				board[i][j]=po;
				sudokuProblem(board,ni,nj);
				board[i][j]=0;
			}
		}
	}
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
sudokuProblem(arr,0,0);
	}

}
