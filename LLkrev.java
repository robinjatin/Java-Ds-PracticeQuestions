//reversing k numbers in a linked list
import java.util.Scanner;
public class LLkrev {
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
	Node revk(Node node,int k) {
		Node current=node;
		int count=0;
		Node prev=null;
		Node temp=null;
		while(current!=null&&count<k)
		{
				temp=current.next;
				current.next=prev;
				prev=current;
				current=temp;
				count++;
		}
		if(current!=null)
		{
			node.next=revk(current,k);
		}
		return prev;
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
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LLkrev li=new LLkrev();
		System.out.println("Enter the size of the linked list");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			li.insert(sc.nextInt());
		}
		System.out.println("Enter the number for reversing");
		int k=sc.nextInt();
		li.head=li.revk(li.head,k);
		li.display();
	}
}
