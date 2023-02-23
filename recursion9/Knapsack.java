package recursion9;
import java.util.Scanner;
public class Knapsack {
public static int knapsack(int val[],int wet[],int w,int i) {
	if(i==val.length) {
		return 0;
	}
	int ans;
	if(wet[i]<=w) {
		int ans1=val[i]+knapsack(val,wet,w-wet[i],i+1);
		int ans2=knapsack(val,wet,w,i+1);
		ans=Math.max(ans1, ans2);
	}
	else {
		ans=knapsack(val,wet,w,i+1);
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int val[]=new int [n];
int wet[]=new int [n];
int w=sc.nextInt();
for(int i=0;i<n;i++) {
	val[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	wet[i]=sc.nextInt();
}
int ans=knapsack(val,wet,w,0);
System.out.print(ans);
	}

}
