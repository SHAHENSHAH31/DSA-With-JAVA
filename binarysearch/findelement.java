package binarysearch;
import java.util.Scanner;
public class findelement {
	public static int uniqueElement(int arr[],int start,int end,int x) {
		if(start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		if (arr[mid]==x) {
			return mid;
		}
		else if(arr[mid]<x) {
			return uniqueElement(arr,mid+1,end,x);
		}
		else {
			return uniqueElement(arr,start,mid-1,x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		int start=0;
		int end=n-1;
	System.out.print(uniqueElement(arr,start,end,x));

	}

}
