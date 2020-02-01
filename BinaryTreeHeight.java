//Finding height of a binary tree
class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
public class BinaryTreeHeight {
	
	Node root;
	static int hl=0, hr=0;
	BinaryTreeHeight()
	{
		root = null;
	}
	void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	void height(Node root) {
		int heightl=0,heightr=0;
		heightl=heightleft(root);
		heightr=heightright(root);
		if(heightl>heightr)
		{
			System.out.println(heightl);
		}
		else
		{
			System.out.println(heightr);
		}
	}
	int heightleft(Node root)
	{
		
		if(root.left!=null)
		{
			heightleft(root.left);
			hl++;
		}
		return hl;
	}
	int heightright(Node root)
	{
		
		if(root.right!=null)
		{
			heightleft(root.right);
			hr++;
		}
		return hr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeHeight bt=new BinaryTreeHeight();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.height(bt.root);
		//bt.inorder(bt.root);
	}

}
