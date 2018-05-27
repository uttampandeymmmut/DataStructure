package nonlinear.tree;

public class Tree {

	public static void main(String[] args)
	{
		TreeUtility tr=new TreeUtility();
		for(int a=10;a<=160;a=a+10)
			tr.add(a);
		tr.inorder();
		tr.preorder();
		tr.postorder();
		tr.levelorder();
		tr.reverseLeveleOrder();
		tr.LeafNodes();
		tr.search(50);
		tr.search(65);
		tr.size();
		System.out.println("\nSize(Number of nodes) of tree is without recursion "+tr.sizeNR());
		tr.findHeight();
		System.out.println("\nNUMBER OF HALF NODES IN TREE : "+tr.CountHalfNode());
		System.out.println("\nNUMBER OF LEAF NODES : "+tr.CountLeafNode());
	}

}
