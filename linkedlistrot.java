//rotating linkedlist n times
import java.util.Scanner;
public class linkedlistrot {
	static Node head;
	static int count=0;
	static int count1=0;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void insert(linkedlistrot li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node last=li.head;
			int flag=0;
			
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;
		}
	}
	public static void rotate(linkedlistrot li,int n)
	{
		for(int i=0;i<n;i++)
		{
			rotate1(li);
		}
		
	}
	public static void rotate1(linkedlistrot li)
	{
		count=0;
		Node qw=li.head;
		Node er=li.head;
		while(qw.next!=null)
		{
			++count;
			qw=qw.next;
		}
		++count;
		count1=0;
		qw.next=er;
		li.head=er.next;
		Node yu=li.head;
		while(yu!=null)
		{
			++count1;
			if(count==count1)
			{
				yu.next=null;
			}
			yu=yu.next;
		}
	}
	public static void display(linkedlistrot li)
	{
		Node current=li.head;
		System.out.println("The LinkedList is as follows: ");
		while(current.next!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println(current.data);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		linkedlistrot li=new linkedlistrot();
		System.out.println("Enter the amount of elements you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			li.insert(li,a);
		}
		System.out.println("Enter the times you want to rotate the string");
		int k=sc.nextInt();
		li.rotate(li,k);
		li.display(li);
	}
}
