package Pattern;
import java.util.Scanner;
public class Spiral {
	public static void Spiralpattern(int matrix[][]) 
	{
		int rows=matrix.length;
		if(rows==0) {
			return;
		}
		int cols=matrix[0].length;
		int i,rowStart=0,colStart=0;
		int total=rows*cols;
		int count=0;
		while(count<total) {
			//section 1
			for(i=colStart;i<cols&&count<total;i++) {
				System.out.print(matrix[rowStart][i]+" ");
				count++;
			}
			rowStart++;
			//section 2
			for(i=rowStart;i<rows&&count<total;i++) {
				System.out.print(matrix[i][cols-1]+" ");
				count++;
			}
			cols--;
			//section 3
			for( i=cols-1;i>=colStart&&count<total;i--) {
				System.out.print(matrix[rows-1][i]+" ");
				count++;
			}
			rows--;
			//section 4
			for(i=rows-1;i>=rowStart&&count<total;i--) {
				System.out.print(matrix[i][colStart]+" ");
				count++;
			}
			colStart++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter thelength of arr" +"n" +"m");
		int n=s.nextInt();
		int m=s.nextInt();
		//System.out.println("enter thelength of arr" +"n" ,+"m");
		int [][] arr=new int[n][m];
		for(int i=0;i<arr.length;i++) 
		{
		for(int j=0;j<arr[m].length;j++) 
		{
			arr[i][j]=s.nextInt();
		}
		}
for(int i=0;i<arr.length;i++) 
{
	for(int j=0;j<arr[m].length;j++) 
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
Spiralpattern(arr);
	}

}
