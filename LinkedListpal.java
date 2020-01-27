/*Write a Java program to check if a singly linked list is a palindrome or not*/
import java.util.Scanner;

public class LinkedListpal {
	static Node head;
	public static Scanner sc=new Scanner(System.in);
	static class Node
	{	
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
			
		}
	}
	public static void insert(LinkedListpal li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
			newNode.next=null;
			newNode.prev=null;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
			newNode.prev=last;
			newNode.next=null;
			
		}
	
	}
	public static void display(LinkedListpal li)
	{
		Node current=li.head;
		if(li.head==null)
		{
			System.out.println("No list is present");
		}
		else
		{
			System.out.println("The list is: ");
			while(current.next!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println(current.data);
		}
	}
	public static void palindromecheck(LinkedListpal li)
	{
		Node current=li.head;
		int arr[]=new int[100];
		int a=0;
		while(current!=null)
		{
			arr[a]=current.data;
			current=current.next;
			a++;
		}
		int flag=0;
		for(int i=0;i<a;i++)
		{
			if(arr[i]!=arr[a-i-1])
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListpal li=new LinkedListpal();
		String s=new String();
		System.out.println("Enter no of elements you want in the linked list");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			insert(li,sc.nextInt());
		}
		palindromecheck(li);
		//display(li);
	}
}
