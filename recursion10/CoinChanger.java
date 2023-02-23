package recursion10;
import java.util.Scanner;
public class CoinChanger {
public static int coinChange(int arr[],int w,int i) {
	if(w<0) {
		return 0;
	}
		if(w==0) {
			return 1;
		}
		if(w>0&&i==arr.length) {
			return 0;
		}
	  return coinChange(arr,w-arr[i],i)+coinChange(arr,w,i+1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int w=sc.nextInt();
int arr[]=new int [n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int ans=coinChange(arr,w,0);
System.out.print(ans);
  }
}
