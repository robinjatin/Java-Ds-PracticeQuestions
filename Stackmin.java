//minimum element in a stack
import java.util.*;
public class Stackmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stk=new Stack();
		System.out.println("Enter the input size");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the stack");
		for(int i=0;i<n;i++)
		{
			stk.push(sc.nextInt());
		}
		int min=stk.get(0);	
		for(int i=0;i<n;i++)
		{
			if(min>stk.get(i))
			{
				min=stk.get(i);
			}
		}
		System.out.println("The minimum number in the stack is: "+min);
	}

}
