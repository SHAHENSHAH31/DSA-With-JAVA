package sorting;
import java.util.Scanner;

public class quickSorting {
	public static int repitation(int arr[],int si,int ei) {
	int	valueCount=0;
	int indexValue=arr[si];
	for(int i=si+1;i<=ei;i++) {
		if(indexValue>arr[i]) {
			valueCount++;
		}
	}
	int temp=arr[si+valueCount];
	arr[si]=temp;
	arr[si+valueCount]=indexValue;
	int i=si;
	int j=ei;
	while(i<j) {
		if(indexValue>arr[i]) {
			i++;
		}
		else if(indexValue<=arr[j]) {
			j--;
		}
		else {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=arr[i];
			i++;
			j--;
		}
	}
	return si+valueCount;
	}
	public static void sorting(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int value=repitation(arr,si,ei);
	     sorting(arr,si,value-1);
		 sorting(arr,value+1,ei);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
		int arr[]=new int[n];
for(int i=0;i<n;i++) 
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
int si=0;
int ei=0;
sorting(arr,si,ei);

	}

}
