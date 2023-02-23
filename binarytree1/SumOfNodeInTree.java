package binarytree1;
import java.util.Scanner;
import java.util.ArrayList;
public class SumOfNodeInTree {
	public static binaryTreeNode<Integer> binaryTree(boolean isRoot,int parentData,boolean isleft){
		if(isRoot) {
		  System.out.print("Enter root data");
		}else {
			if(isleft) {
				System.out.print("Enter left child of "+ parentData);
			}else {
				System.out.print("Enter right child of "+ parentData);
			}
		}
		Scanner sc=new Scanner (System.in);
		int rootdata = sc.nextInt();
		if(rootdata==-1) {
			return null;
		}
		 binaryTreeNode<Integer> root=new  binaryTreeNode<Integer>(rootdata);
		 binaryTreeNode<Integer> rootleft= binaryTree(false
				 ,root.data,true);
		 binaryTreeNode<Integer> rootright= binaryTree(false,root.data,false);
		 root.left=rootleft;
		 root.right=rootright;
		 return root;
	}
	public static int sumNode(binaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int rootleft=sumNode(root.left);
		int rootright=sumNode(root.right);
		return root.data+rootleft+rootright;
	}
public static ArrayList<Integer> nodeToRootPath(binaryTreeNode<Integer> root,int x){
	if(root==null) {
		return null ;
	}
	if(root.data==x) {
		ArrayList<Integer> output=new ArrayList<>();
		output.add(root.data);
		return output;
	}
	ArrayList<Integer> leftoutput=nodeToRootPath(root.left,x);
	if(leftoutput!=null) {
		leftoutput.add(root.data);
		return leftoutput;
	}
	ArrayList<Integer> rightoutput=nodeToRootPath(root.right,x);
	if(rightoutput!=null) {
		rightoutput.add(root.data);
		return rightoutput;
	}
	return null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Scanner sc =new Scanner(System.in); 
		//int root=sc.nextInt();
		binaryTreeNode<Integer> root=binaryTree(true,0,true);
		int sum = sumNode(root);
		System.out.print(sum);
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		ArrayList<Integer> arr;
		arr=nodeToRootPath(root,x);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
