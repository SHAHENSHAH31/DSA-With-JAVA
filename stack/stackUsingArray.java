package stack;

public class stackUsingArray {
private int data[];
private int topIndex;
public  stackUsingArray() {
	data=new int [10];
	topIndex=-1;
}
/*public  stackUsingArray(int size) {
	data=new int [size];
	topIndex=-1;
}*/
public int size() {
	return topIndex+1;
}
public boolean isEmpity() {
	/*if(topIndex==-1) {
		return true;
	}else {
		return false;
	}*/
	return topIndex==-1;
}
public void push(int elem) { //throws Exception {
	//topIndex++;
	if(topIndex==data.length-1) {
		 //throw StackfullException;
		doublcapacity();
	}
	data[++topIndex]=elem;
}
private void doublcapacity() {
	// TODO Auto-generated method stub
	int temp[]=data;
	data=new int[2*temp.length];
	for(int i=0;i<temp.length-1;i++) {
		data[i]=temp[i];
	}
	
}
public int top() throws Exception {
	if(topIndex==-1) {
		throw new StackEmpityException();
	}
	return topIndex;
}
public int pop() throws Exception{
	if(topIndex==-1) {
		throw new StackEmpityException();
	}
	int temp=data[topIndex];
	topIndex--;
	return temp;
}
}
