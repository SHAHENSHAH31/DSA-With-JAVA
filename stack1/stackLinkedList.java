package stack1;

import stack.StackEmpityException;
import stack.StackfullException;

public class stackLinkedList {

	public static void main(String[] args) throws StackEmpityException,StackfullException {
StackUsingLL<Integer> Stack=new StackUsingLL<>();
int arr[]= {2,5,8,6,9};
for(int i=0;i<arr.length;i++) {
	Stack.push(arr[i]);
}
while(!Stack.isEmpity()) {
System.out.println(Stack.pop());
}
	}
}

