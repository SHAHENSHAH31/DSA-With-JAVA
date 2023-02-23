package linkedlistinserttheelement;

import linkedlist.Node;
import java.util.Scanner;
public class LinkedListuse {
	public static LinkedList<Integer> createLinkedList()
	{
		Scanner sc=new Scanner (System.in);
		LinkedList<Integer>n1=new LinkedList<Integer>(10);
		LinkedList<Integer>n2=new LinkedList<Integer>(20);
		LinkedList<Integer>n3=new LinkedList<Integer>(30);
		LinkedList<Integer>n4=new LinkedList<Integer>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	public static LinkedList<Integer> insertElement(LinkedList<Integer> head,int element,int pos) {
		if(head==null&&pos>0){
			return head;
		}
		if(pos==0) {
			LinkedList<Integer> newnode=new LinkedList<Integer>(element);
			newnode.next=head;
			return newnode;
		}else {
			head.next=insertElement(head.next,element,pos-1);
			return head;
		}
	}
public static void print(LinkedList<Integer>head) {
	while(head!=null) {
		System.out.println(head.data);
		head=head.next;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> head=createLinkedList();
LinkedList<Integer>newhead=insertElement(head,35,3);
print(newhead);
	}

}
