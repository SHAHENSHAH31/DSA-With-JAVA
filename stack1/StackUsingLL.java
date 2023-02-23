package stack1;

import stack.StackEmpityException;

public class StackUsingLL<T> {
private node<T> head;
private int size;
public StackUsingLL(){
head=null;
size=0;
}
 public int size() {
	return size;
}
 public boolean isEmpity() {
	 return size==0;
 }
 public void push(T elem) {
	 node<T> newnode= new node<T>(elem);
	 newnode.next=head;
	 head=newnode;
	 size++;
 }
 public T top() throws StackEmpityException {
	 if(head==null) {
		 throw new StackEmpityException();
	 }
     return head.data;
 }
 public T pop() throws StackEmpityException {
	 if(head==null) {
		 throw new StackEmpityException();
	 }
	 T temp=head.data;
	  head=head.next;
	 size--;
	 return temp;
 }
}
