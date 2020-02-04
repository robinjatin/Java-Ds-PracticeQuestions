//Maximum valid parentheses
import java.util.*;
public class Longestvalidparentheses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the testcases");
		int t=sc.nextInt();
		for(int a=0;a<t;a++)
		{
			System.out.println("Enter the parenthesis");
			String str=sc.next();
			int count=0;
			int max=0,flag=0;
			for(int i=0;i<str.length();i++)
			{
				
					if(str.charAt(i)=='(')
						count++;
					else
						count--;
					if(count==0)
					{
						max=i;
						flag=1;
					}
			}
			if(flag==0)
			{
				max=1;
			}
			
				System.out.println(max+1);
		}
	}
}
