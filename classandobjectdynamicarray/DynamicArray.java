package classandobjectdynamicarray;

public class DynamicArray {
int data [];
int nextElementIndex;
public DynamicArray() 
{
	data = new int [5];
	nextElementIndex=0;
}
public int size()
{
	return nextElementIndex;
}
public boolean isEmpty()
{
	return nextElementIndex==0;
}
public void set(int i,int elem)
{
	if(i>nextElementIndex) 
	{
		return ;
	}
	data[i]=elem;
}
public int get(int i)
{
	if(i>=nextElementIndex)
	{
		return -1;
	}
	return data[i];
}
public void add(int elem)
{
	if(nextElementIndex==data.length)
	{
		doubleCapacity();
	}
	data[nextElementIndex]=elem;
	nextElementIndex++;
}
public void doubleCapacity() 
{
	int temp[]=data;
	data= new int [temp.length*2];
	for(int i=0;i<temp.length;i++) 
	{
		data[i]=temp[i];
	}
}
public int lastRemove() 
{
	if(nextElementIndex==0)
	{
		return -1;
	}
	int temp=data[nextElementIndex-1];
	data[nextElementIndex-1]=0;
	nextElementIndex--;
	return temp;
}
}
