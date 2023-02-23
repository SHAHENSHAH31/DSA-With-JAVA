package linkedlist;
import java.util.Scanner;
public class LinkedListUse {
	
public static Node<Integer> createLinkedList()
{
	Node<Integer>n1=new Node<Integer>(10);
	Node<Integer>n2=new Node<Integer>(20);
	Node<Integer>n3=new Node<Integer>(30);
	Node<Integer>n4=new Node<Integer>(40);
	Node<Integer>n5=new Node<Integer>(50);
	Node<Integer>n6=new Node<Integer>(60);
	Node<Integer>n7=new Node<Integer>(70);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=n6;
	n6.next=n7;
	return n1;
}

public static void print(Node<Integer>head) {
	//System.out.print(head);
	while(head!=null) {
	System.out.println(head.data);
	head=head.next;
	//System.out.println(head.next);
	}
}
public static Node<Integer> nodeIntoMidOfLinklist(Node<Integer> head){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the new node data");
	int newNodeData=sc.nextInt();
	Node<Integer> node=new Node<>(newNodeData);
	Node<Integer> slow=head,start=head;
	Node<Integer> fast=head,temp=head,t1=null;
	int count=0;
	while (fast!=null&&fast.next!=null){
		slow=slow.next;
		fast=fast.next.next;
		count++;
	}
	int n=0;
	while(start!=null) {
		n++;
		start=start.next;
	}
	if(n%2==0) {
		for(int i=1;i<count;i++) {
			temp=temp.next;
		}
		node.next=slow;
		temp.next=node;
	}
	else {
		temp=slow;
		t1=temp.next;
		slow.next=node;
		node.next=t1;
		}
return head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node<Integer> root=nodeIntoMidOfLinklist( head);
		Node<Integer>head=createLinkedList();
		Node<Integer> root=nodeIntoMidOfLinklist( head);
		print(root);
/*Node<Integer> n=new Node<>(10);
System.out.println(n.data);
System.out.println(n.next);*/
	}

}
