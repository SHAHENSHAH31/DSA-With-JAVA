package binarysearchtree;

public class bst {
private BinaryTreeNode<Integer> root;
private int size;
private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x) {
	if(node==null) {
		return false;
	}
	if(node.data==x) {
		return true;
	}
	if(node.data<x) {
		return isPresentHelper(node.left,x);
	}else {
		return isPresentHelper(node.left,x);
	}
}

public boolean isPresent(int x) {
	return isPresentHelper(root,x);
}
private static void printHelper(BinaryTreeNode<Integer> node) {
	if(node==null) {
		return;
	}
   System.out.print(node.data+":");
   if(node.left!=null) {
	   System.out.print("L"+node.left.data+",");
   }
   if(node.right!=null) {
	   System.out.print("R"+node.right.data);
   }
   System.out.println();
   printHelper(node.left);
   printHelper(node.right);
   	
}
public void printTree() {
	printHelper(root);
}
public int size() {
	return size;
}
private  static BinaryTreeNode<Integer> insert (BinaryTreeNode<Integer> node,int x) {
	if(node==null) {
		BinaryTreeNode<Integer> newRoot= new BinaryTreeNode<>(x);
		return newRoot;
	}
	if(x>=node.data) {
		node.right=insert (node.right,x);
	}else {
		node.left=insert (node.left,x);
	}
	return node;
}
public void insert(int x) {
	 root=insert( root, x);
	 size++;
}
private static int minimum(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return Integer.MAX_VALUE;
	}
	int minLeft=minimum(root.left);
	int minRight=minimum(root.right);
	return Math.min(root.data, Math.min(minLeft,minRight));
}
private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root,int x) {
	if(root==null) {
		return new BSTDeleteReturn(null,false);
	}
	if(root.data<x) {
		BSTDeleteReturn outputRight=deleteDataHelper(root.right,x);
		root.right=outputRight.root;
		outputRight.root=root;
		return outputRight;
	}
	if(root.data>x) {
		BSTDeleteReturn outputLeft=deleteDataHelper(root.left,x);
		root.left=outputLeft.root;
		outputLeft.root=root;
		return outputLeft;
	}
	if(root.left==null&&root.right==null) {
		return new BSTDeleteReturn(null,true);
	}
	if(root.left!=null&&root.right==null) {
		return new BSTDeleteReturn(root.left,true);
	}
	if(root.left==null&&root.right!=null) {
		return new BSTDeleteReturn(root.right,true);
	}
	int rightMin=minimum(root.right);
	root.data=rightMin;
	BSTDeleteReturn outputRight=deleteDataHelper(root.right,rightMin);
	root.right=outputRight.root;
	return new BSTDeleteReturn(root,true);
}
public boolean deleteData(int x) {
	BSTDeleteReturn output=deleteDataHelper(root,x);
	root=output.root;
	if(output.delete) {
		size--;
	}
	return output.delete;
	
}
}
