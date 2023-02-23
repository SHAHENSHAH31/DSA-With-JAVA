package queues;

public class QueuesUsingArrays {
private int data[];
private int front;
private int rare;
private int size;
public QueuesUsingArrays() {
	data= new int [5];
	front=-1;
	rare=-1;
}
public QueuesUsingArrays(int capacity) {
	data= new int [capacity];
	front=-1;
	rare=-1;
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;
}
public void enqueue(int elem)  {
	if(size==data.length) {
		doubleCapacity();
	}
	if (size==0) {
		front=0;
	}
	rare=(rare+1)%data.length;
	//if(rare==data.length) {
		//rare=0;
	//}
	data[rare]=elem;
	size++;
}
private void doubleCapacity() {
	// TODO Auto-generated method stub
	int temp[]=data;
	data=new int [2*temp.length];
	int index=0;
	for(int i=front;i<temp.length;i++) {
		data[index]=temp[i];
	}
	for(int i=0;i<front-1;i++) {
		data[index]=temp[i];
	}
	front=0;
	rare=temp.length-1;
	
}
public int front() throws QueueEmptyException {
	if(size==0) {
		throw new QueueEmptyException();
	}
	return data[front];
}
public int dequeue() throws QueueEmptyException {
	if(size==0) {
		throw new QueueEmptyException();
	}
	int temp=data[front];
	front=(front+1)%data.length;
	/*if(front==data.length) {
		front=0;
	}*/
	size--;
	if(size==0) {
		front=-1;
		rare=-1;
	}
	return temp;
}
}
