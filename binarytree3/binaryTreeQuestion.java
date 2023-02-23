package binarytree3;
import java.util.Scanner;
public class binaryTreeQuestion {
public static BinaryTreeNode<Integer> binaryTreeInput(boolean isroot,int parentdata,boolean isleft){
	if(isroot) {
		System.out.print("Enter root data ");
	}
	else {
		if(isleft) {
			System.out.print("Enter left child of "+parentdata);
		}else {
			System.out.print("Enter right child of "+parentdata);
		}
	}
	Scanner sc=new Scanner(System.in);
	int rootdata=sc.nextInt();
	if(rootdata==-1) {
		return null;
	}
	BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
	BinaryTreeNode<Integer> leftchild=binaryTreeInput(false,rootdata,true);
	BinaryTreeNode<Integer> rightchild=binaryTreeInput(false,rootdata,false);
	root.left=leftchild;
	root.right=rightchild;
	return root;
}
public static void printTree(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return;
	}
	System.out.print(root.data+":");
	if(root.left!=null) {
		System.out.print("L"+root.left.data+",");
	}if(root.right!=null) {
		System.out.print("R"+root.right.data);
	}
	System.out.println();
	printTree(root.left);
	printTree(root.right);
	//System.out.println();
}
public static int height(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return 0;
	}
    return Math.max(height(root.left),height(root.right))+1;
}
public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return 0;
	}
	int d1=diameterOfBinaryTree(root.left);
	int d2=diameterOfBinaryTree(root.right);
	int h=height(root.left)+height(root.right)+1;
	return 	Math.max(d1,Math.max(d2, h));
}
public static pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
	if(root==null) {
		pair<Integer,Integer>output=new pair<>();
		output.first=0;
		output.second=0;
		return output;
	}
	pair<Integer,Integer> lo=heightDiameter(root.left);
	pair<Integer,Integer> ro=heightDiameter(root.right);
	int height=1+Math.max(lo.first,ro.first);
	int op1=lo.first+ro.first;
	int op2=lo.second;
	int op3=ro.second;
	int diameter=Math.max(op1,Math.max(op2, op3));
	pair<Integer,Integer>output=new pair<>();
	output.first=height;
	output.second=diameter;
	return output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTreeNode<Integer> root=binaryTreeInput(true,0,true);
printTree(root);
int h=height(root);
System.out.println(h);
int d=diameterOfBinaryTree(root);
System.out.print(d);
pair<Integer,Integer> diameter=heightDiameter(root);
System.out.print(diameter.second);
		}
	}


