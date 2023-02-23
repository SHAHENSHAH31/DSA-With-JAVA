package stack3;
import java.util.Scanner;
import java.util.Stack;
public class prevMinimum {
public static int[] PrevMinimum(int arr[]) {
	Stack<Integer> s= new Stack<Integer>();
	int Arr[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
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
int min[]=PrevMinimum(arr);
for(int i=0;i<n;i++) {
	System.out.print(min[i]+" ");
}
	}

}
