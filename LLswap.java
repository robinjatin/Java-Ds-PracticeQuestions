//swapping linkedlist elements
import java.util.*;
public class LLswap {
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	static Node head;
	static int count=0,count1=0;
	static void insert(int data)
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
		}
		count++;
	}
	static void swap()
	{
		if(head==null)
		{
			System.out.println("Null");
		}
		else
		{
			Node current=head;
			if(count%2==0)
			{
			while(current!=null)
			{
				
				int d=current.data;
				current.data=current.next.data;
				current.next.data=d;
				current=current.next.next;
				
			}
			}
			else if(count%2!=0)
			{
				while(current.next!=null)
				{
					
					int d=current.data;
					current.data=current.next.data;
					current.next.data=d;
					current=current.next.next;
					
				}
			}
		}
	}
	static void display()
	{
		if(head==null)
		{
			System.out.println("Null");
		}
		else
		{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LLswap li=new LLswap();
		System.out.println("Enter the input size");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			li.insert(sc.nextInt());
		}
		li.display();
		System.out.println("After swapping");
		li.swap();
		li.display();
	}

}
