package array;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
      int arr[] = new int [n];
     arr= printArray(arr,n);
      for(int i=0;i<n;i++) 
      {
    	System.out.print(arr[i]);  
      }
	}
	public static int[] printArray(int arr [],int n) 
	{
		int input []=new int [6];
		int last = arr.length-1;
		int first = 0;
		for (int i = 1 ; i <=arr.length ; i++) 
		{
			if(i % 2 == 0) 
			{
				input [last] = i;
				last--;
			}
			else 
			{
				input [first] = i;
				first++;
			}
		}
		return input;
	}
}
