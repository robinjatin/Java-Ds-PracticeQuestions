//Removing duplicates from a Linkedlist
import java.util.Scanner;
public class LLduprem {
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
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
	void removeDuplicates() {
		Node current=head;
		Node current1=null;
		while(current!=null)
		{
			current1=current;
			while(current1!=null&&current.data==current1.data)
			{
				current1=current1.next;
				
			}
			current.next=current1;
			current=current.next;
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
		LLduprem li= new LLduprem();
		System.out.println("Enter the input size of the linkedlist");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the linkedlist");
		for(int i=0;i<n;i++)
		{
			li.insert(sc.nextInt());
		}
		li.removeDuplicates();
		System.out.println("Input after removing duplicates: ");
		li.display();
	}

}
