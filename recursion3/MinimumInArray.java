package recursion3;
import java.util.Scanner;
public class MinimumInArray {
public static void minInArray(int arr[],int start,int min) {
	if(start==arr.length) {
		System.out.println(min);
		return;
	}
	int newMin=min;
	if(arr[start]<newMin) {
		newMin=arr[start];
	}
	minInArray(arr,start+1,newMin);
}
public static int minInArray(int arr[],int start) {
	if(start==arr.length) {
		return Integer.MAX_VALUE;
	}
	int minValue=minInArray(arr,start+1);
	if(minValue>arr[start]) {
		minValue=arr[start];
	}
	return minValue;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lenght of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+"th element of array");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
int min=minInArray(arr,0);
System.out.println(min);
minInArray(arr,0,Integer.MAX_VALUE);
	}

}
