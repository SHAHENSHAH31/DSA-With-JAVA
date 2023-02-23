package Graphs;
import java.util.Scanner;
public class AdjacencyMatrix {
public static void depthFirstTraversal(int adjMatrix[][],int currentVertex,boolean visited[]) {
	visited[currentVertex]=true;
	System.out.print(currentVertex + " ");
	for(int i=0;i<adjMatrix.length;i++) {
		if(adjMatrix[currentVertex][i]==1&&visited[i]==false) {
			depthFirstTraversal(adjMatrix,i,visited);
		}
	}
}
public static void depthFirstTraversal(int adjMatrix[][]) {
	boolean visited[]=new boolean[adjMatrix.length];
	depthFirstTraversal(adjMatrix,0,visited);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int e=sc.nextInt();
int adjMatrix[][]=new int[n][n];
for(int i=0;i<e;i++) {
	int v1=sc.nextInt();
	int v2=sc.nextInt();
	adjMatrix[v1][v2]=1;
	adjMatrix[v2][v1]=1;
}
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(adjMatrix[i][j]+" ");
	}
	System.out.println();
}
	}

}
