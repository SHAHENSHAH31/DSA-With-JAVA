package queue;

import queues.QueueEmptyException;

public class QueueUse {


	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		queueLL<Integer> queue=new queueLL<>();
		int arr[]= {3,5,6,2,7,8};
		for(int x:arr) {
			queue.enqueue(x);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}
