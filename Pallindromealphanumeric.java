//pallindrome of alphanumeric numbers
import java.util.*;
public class Pallindromealphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the testcases");
		int test=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the string");
		String str=new String();
		str=sc.nextLine();
		for(int b=0;b<test;b++)
		{
		char str1[]=str.toCharArray();
		char str2[]=new char[str.length()];
		int a=0;
		for(int i=0;i<str.length();i++)
		{
			if(str1[i]>=65&&str1[i]<=90)
			{
				str1[i]+=(char)32;
			}
		}
		for(int i=str.length()-1;i>=0;i--)
		{
			str2[a]=str1[i];
			a++;
		}
		System.out.println(str2);
		int flag=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str1[i]!=str2[i])
			{
				flag=0;
			}
			else if((str1[i]>=32&&str1[i]<=64)||(str1[i]>=91&&str1[i]<=96)||(str1[i]>=123)&&str1[i-1]==str2[i-1]&&str1[i+1]==str2[i+1])
			{
				flag=1;
			}
			else if(str1[i]==str2[i])
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		if(b!=test-1)
		{
		System.out.println("Enter the string");
		str=sc.nextLine();
		}
		}
		
	}

}
