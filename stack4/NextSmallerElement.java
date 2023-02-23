package stack4;
import java.util.Stack;
import java .util.Scanner;
public class NextSmallerElement {
	public static int [] nextSmallerElement(int arr[],int n) {
		int Arr[]=new int[n];
		Stack<Integer> s=new Stack<Integer>();
		for(int i=n-1;i>=0;i--) {
			while(!s.isEmpty()&&s.peek()>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				Arr[i]=-1;
			}else {
				Arr[i]=s.peek();
			}
			s.push(arr[i]);
		}
		return Arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int Arr[]=nextSmallerElement(arr,n);
for(int i=0;i<n;i++) {
	System.out.print(Arr[i]+" ");
}
	}

}
