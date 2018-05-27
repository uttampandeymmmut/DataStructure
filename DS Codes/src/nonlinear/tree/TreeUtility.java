package nonlinear.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeUtility
{
	TNode root;
	TreeUtility()
	{
		root=null;
	}
	
	//Add method of tree
	public void add(int d)
	{
		TNode tmp=root;
		TNode t=new TNode(d);
		if(tmp==null)
		{
			root=t;
			return;
		}
		Queue<TNode> queue=new LinkedList<TNode>();
		queue.add(tmp);
		while(!queue.isEmpty())
		{
			TNode tmpN=queue.poll();
			if(tmpN.left!=null)
				queue.add(tmpN.left);
			else
			{
				tmpN.left=t;
				return;
			}
			if(tmpN.right!=null)
				queue.add(tmpN.right);
			else
			{
				tmpN.right=t;
				return;
			}
		}
	}

	//inorder traversion method of tree
	
	public void inorder()
	{
		System.out.println("=====================  INORDER TRAVERSION  ========================\n");
		inorder1(root);
		System.out.println("\n");
	}//inorder method
	public void inorder1(TNode t)
	{
		if(t ==null)
			return;
		inorder1(t.left);
		System.out.print(t.data+" -> ");
		inorder1(t.right);
	}

	//preorder traversion method of tree
	public void preorder()
	{
		System.out.println("======================  PREORDER TRAVERSION  =======================\n");
		preorder1(root);
		System.out.println("\n");
	}//preorder method
	public void preorder1(TNode t)
	{
		if(t ==null)
			return;
		System.out.print(t.data+" -> ");
		preorder1(t.left);
		preorder1(t.right);
	}
	
	//Postorder traversion method of tree
	public void postorder()
	{
		System.out.println("=====================  POSTORDER TRAVERSION  =======================\n");
		postorder1(root);
		System.out.println("\n");
	}//postorder method
	public void postorder1(TNode t)
	{
		if(t ==null)
			return;
		postorder1(t.left);
		postorder1(t.right);
		System.out.print(t.data+" -> ");
	}

	//levelorder traversion method of tree
	public void levelorder()
	{
		TNode startNode=root;
		System.out.println("=====================  LEVELORDER TRAVERSION  =======================\n");
		Queue<TNode> queue=new LinkedList<TNode>();
		queue.add(startNode);
		while(!queue.isEmpty())
		{
			TNode tempNode=queue.poll();
			System.out.print(tempNode.data+"  ");
			if(tempNode.left!=null)
				queue.add(tempNode.left);
			if(tempNode.right!=null)
				queue.add(tempNode.right);
		}
		System.out.println();
	}
	
	//print nodes in reverse of level order
	public void reverseLeveleOrder()
	{
		Queue<TNode> q=new LinkedList<TNode>();
		Stack<Integer> st=new Stack<Integer>();
		System.out.println("\n===============  LEVELORDER TRAVERSION IN REVERSE  ================\n");
		q.add(root);
		while(!q.isEmpty())
		{
			TNode tmp=q.poll();
			st.add(tmp.data);
			if(tmp.left != null)
				q.add(tmp.left);
			if(tmp.right != null)
				q.add(tmp.right);
		}
		while(!st.isEmpty())
		System.out.print(st.pop()+"  ");
		System.out.println();
	}

	//search method of tree
	public void search(int t)
	{
		TNode tmp=root;
		Queue<TNode> queue=new LinkedList<TNode>();
		queue.add(tmp);
		while(!queue.isEmpty())
		{
			TNode tmpN=queue.poll();
			if(t==tmpN.data)
			{
				System.out.println("\n"+t+" exist in tree");
				return;
			}
			if(tmpN.left!=null)
				queue.add(tmpN.left);
			if(tmpN.right!=null)
				queue.add(tmpN.right);
		}
		System.out.println("\n"+t+" is not existing in tree");
	}

	//size of tree with recursion (Number of nodes)
	public void size()
	{
		System.out.println("\nSize(Number of nodes) of tree is"+sizeOfTree(root));
	}
	public int sizeOfTree(TNode t)
	{
		if(t==null)
			return 0;
		else
			return (sizeOfTree(t.left)+1+sizeOfTree(t.right));
	}
	
	//size of tree without recursion (Number of nodes)
	public int sizeNR()
	{
		TNode tmp=root;
		int c=0;
		Queue<TNode> q=new LinkedList<TNode>();
		q.add(tmp);
		while(!q.isEmpty())
		{
			TNode n=q.poll();
			c++;
			if(n.left!=null)
				q.add(n.left);
			if(n.right!=null)
				q.add(n.right);
		}
		 return c;
	}

	//height of tree method
	public void findHeight()
	{
		System.out.println("\nHeight of tree is "+heightOfTree(this.root));
	}
	public int heightOfTree(TNode tmp)
	{
		if (tmp == null)
			return 0;
		int hLeftSub = heightOfTree(tmp.left);
		int hRightSub = heightOfTree(tmp.right);
		return Math.max(hLeftSub, hRightSub) + 1;
	}

	//print Leaf Nodes of tree
	public void LeafNodes()
	{
		TNode tmp=root;
		Queue<TNode> q=new LinkedList<TNode>();
		q.add(tmp);
		System.out.println("\n=======================  LEAF NODES OF TREE  ==========================\n");
		while(!q.isEmpty())
		{
			TNode t=q.poll();
			if((t.left == null)  && (t.right == null))
				System.out.print(t.data+"  ");
			if(t.left != null)
				q.add(t.left);
			if(t.right != null)
				q.add(t.right);
		}
		System.out.println();
	}
	
	//count LeafNodes of tree
	public int CountLeafNode()
	{
		TNode tmp=root;
		int c=0;
		Queue<TNode> q=new LinkedList<TNode>();
		q.add(tmp);
		while(!q.isEmpty())
		{
			TNode t=q.poll();
			if((t.left == null)  && (t.right == null))
				c++;
			if(t.left != null)
				q.add(t.left);
			if(t.right != null)
				q.add(t.right);
		}
		return c;
	}

	//count half Nodes(which node having only one child )
	public int CountHalfNode()
	{
		TNode tmp=root;
		int c=0;
		Queue<TNode> q=new LinkedList<TNode>();
		q.add(tmp);
		while(!q.isEmpty())
		{
			TNode t=q.poll();
			if((t.left != null)  && (t.right == null))
				c++;
			if(t.left != null)
				q.add(t.left);
			if(t.right != null)
				q.add(t.right);
		}
		return c;
	}


}
