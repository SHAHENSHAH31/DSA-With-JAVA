package queue;
import queues.QueueEmptyException;
import stack1.node;
public class queueLL<T> {
private node<T> front;
private node<T> rare;
int size;
queueLL(){
	front=null;
	rare=null;
	size=0;
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;
}
public void enqueue(T elem) {
	node<T> newnode=new node<>(elem);
	size++;
	if(rare==null) {
		front=newnode;
		rare=newnode;
	}else {
		rare.next=newnode;
		rare=newnode;
	}
}
public T front() throws QueueEmptyException {
	if(front==null) {
		throw new QueueEmptyException();
	}
	return front.data;
}
public T dequeue() throws QueueEmptyException {
	if(front==null) {
		throw new QueueEmptyException();
	}
	T temp= front.data;
	 front=front.next;
	 if(front==null) {
		 rare=null;
	 }
	 size--;
	 return temp;
}
}
