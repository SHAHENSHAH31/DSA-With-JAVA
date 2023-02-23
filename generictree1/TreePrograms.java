package generictree1;
import java .util.Scanner;
import java.util.*;

	
public class TreePrograms {
    public static TreeNode<Integer> takeInput(){
    	Scanner sc=new Scanner(System.in);
    	Queue<TreeNode<Integer>> q=new LinkedList<TreeNode<Integer>>();
    	System.out.println("Enter the root data");
    	int rootData=sc.nextInt();
    	if(rootData==-1) {
    		return null;
    	}
    	TreeNode<Integer> root=new TreeNode<Integer>(rootData);
    	q.add(root);
    	while(!q.isEmpty()) {
    		TreeNode<Integer> front=q.remove();
           System.out.println("Enter the no of child for : " + front.data);
           int numberOfChildren=sc.nextInt();
           for(int i=0;i<numberOfChildren;i++) {
        	   System.out.println("Enter the "+i+" th child data for " + front.data);
        	   int childData=sc.nextInt();
        	   TreeNode<Integer> childNode=new TreeNode<Integer>(childData);
        	   front.children.add(childNode);
        	   q.add(childNode);
           }
    	}
    	return root;
    }
    public static void printTree(TreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	System.out.print(root.data+" : ");
    	for(int i=0;i<root.children.size();i++) {
    		System.out.print(root.children.get(i).data+"  ");
    	}
    	System.out.println();
    	for(int i=0;i<root.children.size();i++) {
    		//root=root.children.get(i);
    		TreeNode<Integer> child=root.children.get(i);
    		printTree(child);
    	}
    }
    public static void printLevelWise(TreeNode<Integer> root){
    	Queue<TreeNode<Integer>> mq=new LinkedList<TreeNode<Integer>>();
    	mq.add(root);
    	Queue<TreeNode<Integer>> cq=new LinkedList<TreeNode<Integer>>();
    	while(!mq.isEmpty()) {
    		TreeNode<Integer> front=mq.remove();
    		System.out.print(front.data+" ");
    		for(TreeNode<Integer> child:front.children) {
    			cq.add(child);
    		}
    		//System.out.println();
    		if(mq.isEmpty()) {
    			mq=cq;
    			cq=new LinkedList<TreeNode<Integer>>();
    			System.out.println();
    		}
    	}
    }
    public static int numNodeGreater(TreeNode<Integer> root,int x){
    	if(root==null) {
    		return 0;
    	}
    	int count=0;
    	if(root.data>x) {
    		count=count+1;
    	}
    	for(int i=0;i<root.children.size();i++) {
    		count+=numNodeGreater(root.children.get(i),x);
    	}
    	return count;
    }
    public static int getHeight(TreeNode<Integer> root){
    	if(root==null) {
    		return 0;
    	}
    	int max =1;
    	for(int i=0;i<root.children.size();i++) {
    		int childHeight=1+getHeight(root.children.get(i));
    		if(max<childHeight) {
    			max=childHeight;
    		}
    	}
    	return max;
    }
    public static int countLeafNode(TreeNode<Integer> root) {
    	if(root==null) {
    		return 0;
    	}
    		int count=0;
    	if(root.children.size()==0) {
    		count=1;
    	}
    	for(int i=0;i<root.children.size();i++) {
    		count+=countLeafNode(root.children.get(i));
    	}
    	return count;
    }
    public static void printPostOrder(TreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	for(TreeNode<Integer> child:root.children) {
    		printPostOrder(child);
    	}
    	System.out.print(root.data+" ");
    }
    public static int sumOfAllNodeInTree(TreeNode<Integer> root) {
    	if(root==null) {
    		return 0;
    	}
    	int sum=root.data;
    	for(TreeNode<Integer> child:root.children) {
    		int childSum=sumOfAllNodeInTree(child);
    		sum+=childSum;
    	}
    	return sum;
    }
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
    	if(root==null) {
    		return false;
    	}
    	if(root.data==x) {
    		return true;
    	}
    	for(TreeNode<Integer> child:root.children) {
    		if( checkIfContainsX(child,x)) {
    		return true;	
    		}
    	}
    	return false;
    }
    public static Pair maxSumNode(TreeNode<Integer> root){
    	if(root==null) {
    		return null;
    	}
    	Pair ans=maxSumNodeHelper(root);
    	return ans;
    }
    public static Pair maxSumNodeHelper(TreeNode<Integer> root) {
    	Pair ans=new Pair();
    	ans.node=root;
    	int sum=root.data;
    	for(int i=0;i<root.children.size();i++) {
    		sum+=root.children.get(i).data;
    	}
    	ans.maxSum=sum;
    	for(int i=0;i<root.children.size();i++) {
    		Pair smallAns=maxSumNodeHelper(root.children.get(i));
    		if(smallAns.maxSum>ans.maxSum) {
    			ans.maxSum=smallAns.maxSum;
    			ans.node=smallAns.node;
    		}

    	}
    	return ans;
    }
public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
 if(root == null) return null;
        TreeNode<Integer> nextLargerNode = null;
        if(root.data > n) nextLargerNode = root;
        
        for(int i = 0; i < root.children.size(); i++)
        {
            TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
            if(nextLargerInChild != null) 
            {
                if(nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) 
                {
                    nextLargerNode = nextLargerInChild;
                }
            }
        }
        return nextLargerNode;
    }


static int ceil;
static int floor;
public static void ceilAndFloor(TreeNode<Integer> node,int data) {
	if(node.data>data) {
		if(node.data<ceil) {
			ceil=node.data;
		}
	}
		if(node.data<data) {
			if(node.data>floor) {
				floor=node.data;
			}
		}
		for(TreeNode<Integer> child:node.children) {
			ceilAndFloor(child,data);
		}
	}
public static int kthLargest(TreeNode<Integer> node,int k) {
	floor=Integer.MIN_VALUE;
	int largest=Integer.MAX_VALUE;
	for(int i=0;i<k;i++) {
		ceilAndFloor( node, largest);
		largest=floor;
		floor=Integer.MIN_VALUE;
	}
	return largest;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeNode<Integer> root=takeInput();
printTree(root);
System.out.println("print tree level wise");
printLevelWise(root);
int count =numNodeGreater(root,2);
System.out.println("Number of Node Greater Than X = "+count);
int height=getHeight(root);
System.out.println("Height of tree = "+height);
int leafCount=countLeafNode(root);
System.out.println("Number of Leaf node = "+leafCount);
System.out.print("postorder traversal in generic tree = ");
printPostOrder(root);
System.out.println();
int sum=sumOfAllNodeInTree(root);
System.out.println("Sum of all node in tree = "+sum);

System.out.println("check tree contain give value or not = "+checkIfContainsX( root,6 ));
System.out.println("maximum sum of all children of node including itself = " +maxSumNode(root).maxSum);
System.out.println("node data which children sum is greater then all node children in generic tree = " + maxSumNode(root).node.data);
System.out.println("Next largest node = " + findNextLargerNode( root,  31).data);
//ceil=Integer.MAX_VALUE;
//floor=Integer.MIN_VALUE;
//ceilAndFloor(root, 64);
//System.out.println("CEIL = "+ceil);
//System.out.println("FLOOR = "+floor);
int k=3;
int largest=kthLargest( root, k);
System.out.println("kth largest in tree = "+largest);
	}

}
