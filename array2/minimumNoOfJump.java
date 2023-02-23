package array2;

public class minimumNoOfJump {
	public static int minJump(int [] arr) {
		int max =0,jump=0,chanchal=0;
		if(arr[0]==0) {
			return -1;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			max=Math.max(max, i+arr[i]);
			if(i>chanchal) {
				return -1;
			}
			if(max>=arr.length-1)
			{
				return ++jump;
			}
			if(i==chanchal)
			{
				chanchal=max;
				jump++;
			}
		}
		if(chanchal>=arr.length-1) 
		{
			return jump;
		}
		return -1;
	}

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
       int arr[]= {1,3,2,5,9,2,6,7,6,8,9};
       int jump=minJump(arr);
       System.out.print(jump);
	}

}
