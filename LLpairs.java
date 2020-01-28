//finding pairs of numbers whose sum equals a number
import java.util.Scanner;
public class LLpairs {
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			next=prev=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
			newNode.prev=current;
			newNode.next=null;
		}
	}
	void pairs(int k) {
		Node current=head;
		int flag=0;
		while(current!=null)
		{
			Node current1=current.next;
			while(current1!=null)
			{	
				if(current.data+current1.data==k)
				{
					System.out.println("Pair: ("+current.data+","+current1.data+")");
					flag=1;
				}
				current1=current1.next;
			}
			current=current.next;
		}
		if(flag==0)
		{
			System.out.println("No Pairs");
		}
	}
	void display()
	{
		if(head==null)
		{
			System.out.println("Null");
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println(current.data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LLpairs li=new LLpairs();
		System.out.println("Enter the size of the linked list");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			li.insert(sc.nextInt());
		}
		System.out.println("Enter the number of which you want to make pairs if their sum is equal to it");
		int k=sc.nextInt();
		li.pairs(k);
		//li.display();
	}
	
}
