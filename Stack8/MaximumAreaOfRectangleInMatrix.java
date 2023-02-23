package Stack8;
import java.util.Scanner;
import java.util.Stack;
public class MaximumAreaOfRectangleInMatrix 
{
	public static int [] nextSmallerElement(int arr[])
	{
		Stack<Integer> s=new Stack<Integer>();
		int next []=new int [arr.length];
		s.push(-1);
		for(int i=arr.length-1;i>=0;i--) 
		{
			int curr=arr[i];
			while(s.peek()!=-1&&arr[s.peek()]>=curr) 
			{
				s.pop();
			}
			next[i]=s.peek();
			s.push(i);
		}
		return next;
	}
	public static int [] previousSmallerElement(int arr[])
	{
		Stack<Integer> s=new Stack<Integer>();
		int prev []=new int [arr.length];
		s.push(-1);
		for(int i=0;i<arr.length;i++) 
		{
			int curr=arr[i];
		    while(s.peek()!=-1&&arr[s.peek()]>=curr) 
		   {
			   s.pop();
		   }
		    prev[i]=s.peek();
		    s.push(i);
		}
		return prev;
	}
	public static int largestAreaOfRectangleInHistogram(int arr[])
	{
		int prev[]=previousSmallerElement(arr);
		int next[]=nextSmallerElement(arr);
		int area=-111;
		for(int i=0;i<arr.length;i++) 
		{
			int l=arr[i];
			if(next[i]==-1) 
			{
				next[i]=arr.length;
			}
			int b=next[i]-prev[i]-1;
			int newarea=l*b;
			area=Math.max(newarea, area);
		}
		return area;
	}
	public static int maximumAreaOfRectangleInMatrix(int arr[][],int n,int m) 
	{
		int curRow[]=arr[0];
		int area=largestAreaOfRectangleInHistogram(curRow);
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==1) 
				{
					curRow[j]+=1;
				}
				else
				{
					curRow[j]=0;
				}
				//area=Math.max(area,largestAreaOfRectangleInHistogram(arr[i],m) );
			}
			int curAns=largestAreaOfRectangleInHistogram(curRow);
			area=Math.max(area,curAns );
		}
		return area;
	}

	public static void main(String[] args) 
	{
		try (// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in)) 
		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
//  int area=  maximumAreaOfRectangleInMatrix(arr,n);
  System.out.print(maximumAreaOfRectangleInMatrix(arr,n,m));
	}
	}

}
