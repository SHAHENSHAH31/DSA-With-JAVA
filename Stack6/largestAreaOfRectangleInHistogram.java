package Stack6;
import java.util.Scanner;
import java.util.Stack;
public class largestAreaOfRectangleInHistogram {
	public static int [] indexOfNextSmallerElement(int arr[],int n) {
		Stack<Integer> s=new Stack<Integer>();
		int next []=new int [n];
		s.push(-1);
		for(int i=n-1;i>=0;i--) {
			while(s.peek()!=-1&&arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			next[i]=s.peek();
			s.push(i);
		}
		return next;
	}
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
    public static int  largestAreaOfRectangle(int arr[],int n) {
    	int prev []= indexOfPrevSmallerElement(arr,n);
    	int next []= indexOfNextSmallerElement(arr,n);
    	int area=-111;
    	for(int i=0;i<n;i++) {
    		int l=arr[i];
    		if(next[i]==-1) {
    			next[i]=n;
    		}
    		int b=next[i]-prev[i]-1;
    		int newarea=l*b;
    	    area=Math.max(newarea, area);
    	}
    	return area;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int arr []=new int [n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int area=largestAreaOfRectangle(arr,n);
System.out.print(area);
	}

}
