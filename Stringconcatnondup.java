//concatenating two strings with no duplicates
import java.util.*;
public class Stringconcatnondup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of testcases");
		int t=sc.nextInt();
		for(int z=0;z<t;z++)
		{
			String str1=new String(),str2=new String(),str3=new String(),str4=new String();
			System.out.println("Enter the first string");
			str1=sc.next();
			System.out.println("Enter the second string");
			str2=sc.next();
			int a=0;
			for(int i=0;i<str1.length();i++)
			{
				str3+=str1.charAt(i);
				a++;
			}
			for(int i=0;i<str2.length();i++)
			{
				str3+=str2.charAt(i);
				a++;
			}
			int flag=0;
			int c=0;
			char abc[]=str3.toCharArray();
			for(int i=0;i<a;i++)
			{
				for(int j=i+1;j<a;j++)
				{
					if(abc[i]==abc[j])
					{
						flag=0;
					}
					else {
						flag++;
						c++;
					}
				}
			}
			if(flag!=c)
			{
				int arr[]=new int[1000];
				char charr[]=new char[1000];
				int e=0;
				for(int i=0;i<a;i++)
				{
					int freq=1;
					char d=abc[i];
					for(int j=i+1;j<a;j++)
					{
						if(abc[i]==abc[j]&&abc[i]!='*'&&abc[j]!='*')
						{
							freq++;
							abc[j]='*';
						}
					}
					abc[i]='*';
					arr[e]=freq;
					charr[e]=d;
					e++;
				}
				for(int i=0;i<e;i++)
				{
					if(arr[i]==1&&charr[i]!='*')
					str4+=charr[i];
				}	
			System.out.println("The concatenated string is: "+str4);
			}
			else if(flag==c)
				System.out.println(-1);
		}
	}

}
