package array4;
import java.util.Scanner;
public class kthMissingPosttiveNumber {
public static int missingNumber(int arr[],int n,int k) {
	int i=0;
	int j=0;
	int l=0;
	while(l!=k) {
		i++;
		if(j<n&&i==arr[j]) {
			j++;
		}else {
			l++;
		}
	}
	return i; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int [n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int i=missingNumber(arr,n,k);
System.out.print(i);
	}

}
