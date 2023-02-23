package binarytree5;
import java.util.Scanner;

public class BinaryTreeUsingInOrderTraversalAndPreOrder {
	static int preIndex=0;
	public static void printPostOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		printPostOrderTraversal(root.left);
		printPostOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}

	public static BinaryTreeNode<Integer> buildTree(int in[],int pre[],int is,int ie) {
		if(is>ie) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode(pre[preIndex]);
		preIndex++;
		int inIndex=0;
		for(int i=is;i<=ie;i++) {
			if(in[i]==root.data) {
				inIndex=i;
				break;
			}
		}
		root.left=buildTree(in,pre,is,inIndex-1);
		root.right=buildTree(in,pre,inIndex+1,ie);
		return root;
	}
public static BinaryTreeNode<Integer> BinaryTreeUsingInOrderTraversalAndPreOrder(int in[],int pre[],int n) {
	BinaryTreeNode<Integer>root=buildTree( in, pre,0,n-1);
	return root;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int in[]=new int[n];
int pre[]=new int[n];
System.out.println("Enter the inorder traversal");
for(int i=0;i<n;i++) {
	in[i]=sc.nextInt();
}
System.out.println("Enter the preorder traversal");
for(int i=0;i<n;i++) {
	pre[i]=sc.nextInt();
}

BinaryTreeNode<Integer> root=BinaryTreeUsingInOrderTraversalAndPreOrder( in, pre, n);
printPostOrderTraversal( root);
	}

}
