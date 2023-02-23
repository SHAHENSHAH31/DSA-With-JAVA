package backtracking2;
import java.util.*;
public class NQUEENS {
	public static boolean isItaSafePlaceForTheQueen(int arr[][],int row,int col) {
		for(int i=row-1,j=col;i>=0;i--) {
			if(arr[i][j]==1) {
				return false;
			}
		}
			for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
				if(arr[i][j]==1) {
					return false;
				}
		}
			for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++) {
				if(arr[i][j]==1) {
					return false;
				}
			}
			return true;
	}
	public static void printAllQueensWithoutCollision(int arr[][],String s,int row) {
		if(row==arr.length) {
			System.out.println(s);
			return;
		}
		for(int col=0;col<arr.length;col++) {
			if(isItaSafePlaceForTheQueen(arr,row,col)==true) {
			arr[row][col]=1;
			printAllQueensWithoutCollision(arr,s+row+"-"+col+",",row+1);
			arr[row][col]=0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int [n][n];
		printAllQueensWithoutCollision(arr, "",0);
			}
	}


