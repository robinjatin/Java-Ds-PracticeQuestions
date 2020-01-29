//checking if there's a loop in a linked list
import java.util.Scanner;
public class LLloop {
	
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
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
		}
	}
	int checkloop(int k)
	{
		if(k==0)
			return 0;
		Node current=head;
		Node current1=head;
		int count=0;
		while(current.next!=null)
		{
			current=current.next;
		}
		while(current1.next!=null&&count<k)
		{
			current1=current1.next;
			count++;
		}
		current.next=current1;
		Node slow=head;
		Node fast=head;
		int flag=0;
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			return 1;
		else
			return 0;
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
		System.out.println("Enter the number of test cases");
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			LLloop li=new LLloop();
			System.out.println("Enter the size of the linked list");
			int n=sc.nextInt();
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
			{
				li.insert(sc.nextInt());
			}
			System.out.println("Enter the position of node for loop");
			int k=sc.nextInt();
			if(li.checkloop(k)==1)
				System.out.println("True");
			else if(li.checkloop(k)==0)
				System.out.println("False");
			li.display();
		}
	}
}
