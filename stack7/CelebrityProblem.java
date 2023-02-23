package stack7;
import java.util.Scanner;
import java.util.Stack;
public class CelebrityProblem {
	public static boolean knows(int arr[][],int a,int b,int n) {
		if(arr[a][b]==1) {
			return true;
		}else {
			return false;
		}
	}
public static int celebrityProblem(int arr[][],int n) {
	Stack<Integer> s=new Stack<Integer>();
	for(int i=0;i<n;i++) {
		s.push(i);
	}
	while(s.size()>1) {
		int a=s.peek();
		s.pop();
		int b=s.peek();
		s.pop();
		if(knows(arr,a,b,n)) {
			s.push(b);
		}else {
			s.push(a);
		}
	}
	int ans=s.peek();
	int count=0;
	for(int i=0;i<n;i++) {
		if(arr[ans][i]==0) {
			count++;
		}
	}
		if(count!=n) {
			return -1;
		}
		int countn=0;
		for(int i=0;i<n;i++) {
			if(arr[i][ans]==1) {
				countn++;
			}
		}
		if(countn!=n-1) {
			return -1;
		}
		return ans;
	
}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in)) {
	int n=sc.nextInt();
	int arr[][]=new int [n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.print(celebrityProblem(arr,n));
}
	}

}
