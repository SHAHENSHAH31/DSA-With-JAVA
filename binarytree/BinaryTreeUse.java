package binarytree;
import java.util.Scanner;
public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
		System.out.print("Enter root data");
		}else {
			if(isLeft) {
				System.out.print("Enter left child of "+ parentData);
			}else {
				System.out.print("Enter right child of "+ parentData);
			}
		}
		Scanner sc=new Scanner(System.in);
		int rootdata=sc.nextInt();
		if(rootdata==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		BinaryTreeNode<Integer> leftchild=takeTreeInputBetter(false,root.data,true);
		BinaryTreeNode<Integer> rightchild=takeTreeInputBetter(false,root.data,false);
		root.left=leftchild;
		root.right=rightchild;
		return root;
	}
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.print("Enter root data");
		Scanner sc=new Scanner(System.in);
		int rootdata=sc.nextInt();
		if(rootdata==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		BinaryTreeNode<Integer> leftchild=takeTreeInput();
		BinaryTreeNode<Integer> rightchild=takeTreeInput();
		root.left=leftchild;
		root.right=rightchild;
		return root;
	}
	public static void printTreeAdvance(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data+",");
		}
		System.out.println();
		printTreeAdvance(root.left);
		printTreeAdvance(root.right);
	}
/*public static void printTree(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return ;
	}
	System.out.println(root.data);
	printTree(root.left);
	printTree(root.right);
}*/
	public static int treeNodeCount(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		 int rootleft=treeNodeCount(root.left);
		 int rootright=treeNodeCount(root.right);
		 return 1+rootleft+rootright;
	}
	int maxlen=0;
	int maxsum=0;
	public void solve(BinaryTreeNode<Integer> root,int sum,int len) {
		if(root==null) {
			if(len>maxlen) 
			{
			   maxlen=len;
			   maxsum=sum;
			}
			else if(len==maxlen) {
				maxsum=Math.max(sum,maxsum);
			}
			return ;
		}
		sum=sum+root.data;
		solve(root.left,sum,len+1);
		solve(root.right,sum,len+1);
	
	}
	public int sumOfLongRootToLeafPath(BinaryTreeNode<Integer> root) 
	{
		
		solve(root,0,0);
		return maxsum;

	}
	public static BinaryTreeNode<Integer> convertTreeIntoLinkedList(BinaryTreeNode<Integer> root){
		BinaryTreeNode<Integer> curr=root;
		while(curr!=null) {
			if(curr.left!=null) {
				BinaryTreeNode<Integer> prev=curr.left;
				while(prev.right!=null) {
					prev=prev.right;
				}
				prev.right=curr.right;
				curr.right=curr.left;
				curr.left=null;
			}
			curr=curr.right;
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTreeNode<Integer> root=takeTreeInputBetter(true,0,true);
int numberofnode=treeNodeCount(root);
printTreeAdvance(root);
System.out.print("Number of node in tree "+numberofnode);
System.out.println();
BinaryTreeNode<Integer> head=convertTreeIntoLinkedList(root);
while(head!=null) {
	System.out.print(head.data+" ");
	head=head.right;
}

	}

}
