package Nodelinkedlist;
import java.util.Scanner;
import linkedlistmergesort.MergeSort;

public class insertLinkedList {
	public static node<Integer> linkedList(){
		node<Integer> n1=new node<>(10);
		node<Integer> n2=new node<>(20);
		node<Integer> n3=new node<>(30);
		node<Integer> n4=new node<>(40);
		node<Integer> n5=new node<>(50);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		return n1;
	}
	public static node<Integer> insertNewNode(node<Integer> head,node<Integer>newnode,int n){
		if(n==0) {
			return newnode.next=head;
		}
		node<Integer> temp=head;
		int count=0;
		while(n!=count) {
			temp=temp.next;
			count++;
		}
		if(temp!=null) {
		newnode.next=temp.next.next;
		temp.next=newnode;
		}
		return head;
		
	}
     public static node<Integer> deletenode(node<Integer> head,int n){
    	 node<Integer> temp=head;
    	 if(n==0) {
    		 return head=head.next;
    	 }
    	int count=1;
    	 while(count!=n) {
    		 temp=temp.next;
    		 count++;
    	 }
    	 temp.next=temp.next.next;
    	 return head;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=linkedList();
		Scanner sc=new Scanner (System.in);
		//int n=sc.nextInt();
		//node<Integer> newnode= new node<Integer>(60);
		//node<Integer> newhead=insertNewNode(head,newnode,n);
		//while(newhead!=null) {
			//System.out.print(newhead.data+" ");
			//newhead=newhead.next;
		//}
		int n=sc.nextInt();
		node<Integer> newnode= deletenode(head,n);
		while(newnode!=null) {
			System.out.print(newnode.data+" ");
			newnode=newnode.next;
		}
	}

}
