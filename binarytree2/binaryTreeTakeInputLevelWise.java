package binarytree2;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class binaryTreeTakeInputLevelWise {
public static BinaryTreeNode<Integer> takeTreeinputlevelWise(){
	Scanner sc=new Scanner (System.in) ;
	System.out.println("Enter root data");
	int rootData=sc.nextInt();
	if(rootData==-1) {
		return null;
	}
	BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
	Queue<BinaryTreeNode<Integer>> pendingChildren=new LinkedList<BinaryTreeNode<Integer>>();
	pendingChildren.add(root);
	while(!pendingChildren.isEmpty()) {
		BinaryTreeNode<Integer> front=pendingChildren.poll();
		System.out.println("Enter the left child of "+ front.data);
		int left=sc.nextInt();
		if(left!=-1) {
			BinaryTreeNode<Integer> leftchild=new BinaryTreeNode<Integer>(left);
			//pendingChildren.add(root);
			front.left=leftchild;
			pendingChildren.add(leftchild);
		}
		System.out.println("Enter the left child of "+ front.data);
		int right=sc.nextInt();
		if(right!=-1) {
			BinaryTreeNode<Integer> rightchild=new BinaryTreeNode<Integer>(right);
			pendingChildren.add(root);
			front.right=rightchild;
			pendingChildren.add(rightchild);
	}	
	}
	return root;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc=new Scanner (System.in) ;
//int rootData=sc.nextInt();
//BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
BinaryTreeNode<Integer>roothead=takeTreeinputlevelWise();
	}

}
