//Palindrome of alphanumeric numbers
import java.util.*;
public class Palindromealphanumeric {

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
		char str1[]=new char[str.length()];
		char str2[]=new char[str.length()];
		int a=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' '&&((ch>=65&&ch<=90)||(ch>=97&&ch<=122)))
			{
				str1[a]=ch;
				a++;
			}
		}
		for(int i=0;i<a;i++)
		{
			if(str1[i]>=65&&str1[i]<=90)
			{
				str1[i]+=(char)32;
			}
		}
		int c=0;
		for(int i=a-1;i>=0;i--)
		{
			str2[c]=str1[i];
			c++;
		}
		int flag=0;
		for(int i=0;i<a;i++)
		{
			if(str1[i]!=str2[i])
				flag=1;
		}
		if(flag==0)
		{
			System.out.println("YES");
		}
		else if(flag==1)
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
