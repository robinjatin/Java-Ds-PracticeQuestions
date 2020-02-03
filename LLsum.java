//finding sum of two linked lists
import java.util.*;
public class LLsum {
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head,head1,head2;
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
	void insert1(int data)
	{
		Node newNode=new Node(data);
		if(head1==null)
		{
			head1=newNode;
		}
		else
		{
			Node current=head1;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
		}
	}
	void insert2(int data)
	{
		Node newNode=new Node(data);
		if(head2==null)
		{
			head2=newNode;
		}
		else
		{
			Node current=head2;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
		}
	}
	static int sum(Node li1,Node li2)
	{
		int a=0,b=0;
		int add=0;
		Node current1=li1;
		Node current2=li2;
		Node current11=li1;
		Node current22=li2;
		while(current1!=null)
		{
			a++;
			current1=current1.next;
		}
		int arr1[]=new int[a];
		int i=0;
		while(current11!=null)
		{
			arr1[i]=current11.data;
			i++;
			current11=current11.next;
		}
		while(current2!=null)
		{
			b++;
			current2=current2.next;
		}
		int arr2[]=new int[b];
		int j=0;
		while(current22!=null)
		{
			arr2[j]=current22.data;
			j++;
			current22=current22.next;
		}
		String str1=new String(),str2=new String();
		for(int c=0;c<a;c++)
		{
			str1+=arr1[c];
		}
		for(int c=0;c<b;c++)
		{
			str2+=arr2[c];
		}
		int a1=Integer.parseInt(str1);
		int b1=Integer.parseInt(str2);
		add=a1+b1;
		return add;
	}
     static void display(Node head)
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
		System.out.println("Enter the number of testcases");
		int t=sc.nextInt();
		for(int z=0;z<t;z++)
		{
			LLsum li1=new LLsum();
			LLsum li2=new LLsum();
		 	LLsum li3=new LLsum();
		System.out.println("Enter the size of the first and second linked lists");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter the elements of the first linked list");
		for(int i=0;i<n1;i++)
		{
			li1.insert(sc.nextInt());
		}
		System.out.println("Enter the elements of the second linked list");
		for(int i=0;i<n2;i++)
		{
			li2.insert1(sc.nextInt());
		}
		int add=sum(li1.head,li2.head1);
		int rem=0;
		while(add>0)
		{
			rem=add%10;
			li3.insert2(rem);
			add=add/10;
		}
		li3.display(li3.head2);
	}
	}
}
