package array3;
import java.util.Scanner;
public class shuffleArray {
	public static int [] ShuffleArray(int arr[],int n) {
		int i=0;
		int j=n;
		int k[]=new int[2*n];
		int l=0;
		while(l<2*n) {
			if(l%2==0) {
				k[l]=arr[i];
				i++;
			}else {
				k[l]=arr[j];
						j++;
			}
			l++;
		}
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int [2*n];
for(int i=0;i<2*n;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<2*n;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
int Arr[]=ShuffleArray(arr,n);
for(int i=0;i<2*n;i++) {
	System.out.print(Arr[i]+" ");
}
	}

}
