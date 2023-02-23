package binarytree4;
import java.util.ArrayList;
import java.util.Queue;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class binaryTreeMake {
public static BinaryTreeNode<Integer> binaryTree(boolean isroot,int parentdata,boolean isleft){
	if(isroot) {
		System.out.print("Enter root data");
	}else {
		if(isleft) {
			System.out.print("Enter left child of "+parentdata);
		}else {
			System.out.print("Enter right childe of "+parentdata);
		}
	}
	Scanner sc=new Scanner(System.in);
	int rootdata=sc.nextInt();
	if(rootdata==-1) {
		return null;
	}
	BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
	BinaryTreeNode<Integer> leftchild=binaryTree(false,rootdata,true);
	BinaryTreeNode<Integer> rightchild=binaryTree(false,rootdata,false);
	root.left=leftchild;
	root.right=rightchild;
	return root;
}
public static void zigZagTraversal(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return;
	}
	ArrayList<Integer> result=new ArrayList<Integer>();
	Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
	int level=0;
	 q.add(root);
	 while(!q.isEmpty()) {
		 int size=q.size();
		 ArrayList<Integer> resultlevel=new ArrayList<>();
		// BinaryTreeNode<Integer> temp=q.poll();
		  for(int i=0;i<size;i++) {
			  BinaryTreeNode<Integer> temp=q.poll();
			 if(temp.left!=null) {
				 q.add(temp.left);
			 }
			 if(temp.right!=null) {
				 q.add(temp.right);
			 }
			 if(level%2==0) {
				 resultlevel.add(temp.data);
			 }
			 else
			 {
				 resultlevel.add(0,temp.data);
			 }
			 }
		  level++;
		  for(int i:resultlevel)
		  {
		  result.add(i);
		  }
	 }
	 System.out.print("zig zag print of binary tree "+"= ");
	 for(int i:result) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
}
public static void boundaryTraversalleft(BinaryTreeNode<Integer> root) {
	if(root==null||root.left==null&&root.right==null) {
		return;
	}
	System.out.print(root.data+" ");
	if(root.left!=null) {
	boundaryTraversalleft(root.left);
	}else {
		boundaryTraversalleft(root.right);
	}
}
	public static void boundaryTraversalleaf(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
	if(root.left==null&&root.right==null) {
		System.out.print(root.data+" ");
		return;
	}
	boundaryTraversalleaf(root.left);
	boundaryTraversalleaf(root.right);
}
public static void boundaryTraversal(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return;
	}
	System.out.print("Boundary elemennt of binary tree "+"= ");
	System.out.print(root.data+" ");
	boundaryTraversalleft(root.left);
	boundaryTraversalleaf(root.left);
	boundaryTraversalleaf(root.right);
	boundaryTraversalright(root.right);
	System.out.println();
}
public static void boundaryTraversalright(BinaryTreeNode<Integer> root) {
	if(root==null||root.left==null&&root.right==null) {
		return;
	}
	if(root.right!=null) {
		boundaryTraversalright(root.right);
	}else {
		boundaryTraversalright(root.left);
	}
	System.out.print(root.data+" ");
}
public static ArrayList<Integer> rightViewOfBinaryTree(BinaryTreeNode<Integer> root){
	ArrayList<Integer> arr=new ArrayList<>();
	rightViewOfBinaryTree(root,arr,0);
	return arr;
}
public static void rightViewOfBinaryTree(BinaryTreeNode<Integer> root,ArrayList<Integer> arr,int level) {
	if(root==null) {
		return;
	}
if(level==arr.size()) {
	arr.add(root.data);
}
leftViewOfBinaryTree(root.right,arr,level+1);
leftViewOfBinaryTree(root.left,arr,level+1);
}
public static ArrayList<Integer> leftViewOfBinaryTree(BinaryTreeNode<Integer> root){
	ArrayList<Integer> arr=new ArrayList<>();
	leftViewOfBinaryTree(root,arr,0);
	return arr;
}
public static void leftViewOfBinaryTree(BinaryTreeNode<Integer> root,ArrayList<Integer> arr,int level) {
	if(root==null) {
		return;
	}
if(level==arr.size()) {
	arr.add(root.data);
}
leftViewOfBinaryTree(root.left,arr,level+1);
leftViewOfBinaryTree(root.right,arr,level+1);
}
public static void main(String[] args) {
BinaryTreeNode<Integer> root=binaryTree(true,0,true );
zigZagTraversal(root);
boundaryTraversal(root);
ArrayList<Integer> arr=new ArrayList<>();
arr=leftViewOfBinaryTree(root);
System.out.print("Left view of binary tree "+"= ");
for(int i:arr) {
	System.out.print(i+" ");
}
System.out.println();
ArrayList<Integer> arr1=new ArrayList<>();
arr1=rightViewOfBinaryTree(root);
System.out.print("Right view of binary tree = ");
for(int i:arr1) {
	System.out.print(i+" ");
}

}
}
