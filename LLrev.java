//Reversing a linkedlist
import java.util.*;
public class LLrev {
	static Node head;
	static class Node{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static void add(int d)
	{
		Node newNode=new Node(d);
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
		}
	}
	public static void rev()
	{
		Node prev=null;
		Node temp=null;
		Node current=head;
		while(current!=null)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		head=prev;
	}
	public static void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("Null");
		}
		else
		{
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
		LLrev l1=new LLrev();
		System.out.println("Enter the input size of the LL");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the LL");
		for(int i=0;i<n;i++)
		{
			add(sc.nextInt());
		}
		System.out.println("Displaying the LL after reversing:");
		rev();
		display();
	}
}
