package linkedlistmergesort;

//import linkedlist.Node;

public class mergesortlinkedlist {
	public static MergeSort<Integer> linkedlist(){
		MergeSort<Integer>n1=new MergeSort<Integer>(10);
		MergeSort<Integer>n2=new MergeSort<Integer>(40);
		MergeSort<Integer>n3=new MergeSort<Integer>(30);
		MergeSort<Integer>n4=new MergeSort<Integer>(70);
		MergeSort<Integer>n5=new MergeSort<Integer>(20);
		MergeSort<Integer>n6=new MergeSort<Integer>(50);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		return n1;
	}
	public static MergeSort<Integer> mergesort(MergeSort<Integer> head){
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			return head;
		}
		MergeSort<Integer> midnode=midpoint(head);
		MergeSort<Integer> h1=midnode.next;
		midnode.next=null;
		MergeSort<Integer> part1=mergesort(head);
		MergeSort<Integer> part2=mergesort(h1);
		MergeSort<Integer> Head	=mergetwosort(part1,part2);
		return Head;
	}
	public static MergeSort<Integer> mergetwosort(	MergeSort<Integer> part1,MergeSort<Integer> part2){
		if(part1==null) {
			return part2;
		}
		if(part2==null) {
			return part1;
		}
		MergeSort<Integer> head=null,tail=null,t1=part1,t2=part2;
		if(t1.data<=t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}
		else {
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		while(t1!=null&&t2!=null) {
			if(t1.data<=t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}else {
				tail.next=t2;
				tail=tail.next;
				t2=t2.next;
			}
		}
		if(t1==null) {
			tail.next=t2;
		}
		if(t2==null) {
			tail.next=t1;
		}
		return head;
	}
	
	public static MergeSort<Integer> midpoint(MergeSort<Integer> head){
	if(head==null) {
		return head;
	}
	MergeSort<Integer> slow=head,fast=head;
	while(fast.next!=null&&fast.next.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort<Integer> head= linkedlist();
		MergeSort<Integer> Head=mergesort(head);
		while(Head!=null) {
			System.out.print(Head.data+" ");
			Head=Head.next;
		}
		
	}

}
