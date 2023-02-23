package stack5;
import java.util.Scanner;
import java.util.Stack;

public class previousSmallerElement {
	public static int [] indexOfPrevSmallerElement(int arr[],int n) {
		Stack<Integer> s=new Stack<Integer>();
		int prev []=new int [n];
		s.push(-1);
		for(int i=0;i<n;i++) {
			while(s.peek()!=-1&&arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			prev[i]=s.peek();
			s.push(i);
		}
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int arr[]=new int [n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int prev[]=indexOfPrevSmallerElement( arr, n);
for(int i=0;i<n;i++) {
	System.out.print(prev[i]+" ");
}
	}

}
