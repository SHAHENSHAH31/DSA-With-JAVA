package array1;
import java.util.Scanner;
public class TwoMatrixSum {
public static int[][] twoMatrixSum(int mat1[][],int mat2[][],int n,int m){
	int matrix3[][]=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			matrix3[i][j]=mat1[i][j]+mat2[i][j];
		}
	}
	return matrix3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int matrix1[][]=new int[n][m];
int matrix2[][]=new int[n][m];
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		matrix1[i][j]=sc.nextInt();
	}
}
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		matrix2[i][j]=sc.nextInt();
	}
}
int matrix3[][]=twoMatrixSum(matrix1,matrix2,n,m);
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		System.out.print(matrix3[i][j]+" ");
	}
	System.out.println();
}
	}

}
