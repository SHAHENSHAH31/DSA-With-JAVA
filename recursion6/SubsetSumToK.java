package recursion6;
import java.util.Scanner;
public class SubsetSumToK {
	public static void subsetSumToK(int arr[],int idx,int sum,String set,int k) {
		if(idx==arr.length) {
			if(sum==k)
			{
			System.out.println(set);
			}
		   return;
		}
		subsetSumToK(arr,idx+1,sum+arr[idx],set+arr[idx]+", ",k);
		subsetSumToK(arr,idx+1,sum,set,k);
	}
public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	subsetSumToK(arr,0,0,"",k);
}
}
