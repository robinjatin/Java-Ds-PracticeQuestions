//checking if we have to remove a character once or never to make it a valid string.
import java.util.ArrayList;
import java.util.Scanner;

public class Samecharstringcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t=sc.nextInt();
		for(int z=0;z<t;z++)
		{
			System.out.println("Enter the string");
			String str=new String();
			str=sc.next();
			StringBuilder str1=new StringBuilder(str);
			ArrayList<Integer> freq=new ArrayList<>();
			ArrayList<Character> value=new ArrayList<>();
			int freq1=1;
			char ele=0;
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!='%')
				ele=str1.charAt(i);
				for(int j=i+1;j<str1.length();j++)
				{
					if(str1.charAt(i)==str1.charAt(j)&&str1.charAt(i)!='%')
					{
						freq1++;
						char b='%';
						str1.setCharAt(j,b);
					}
				}
				if(str1.charAt(i)!='%')
				{
					freq.add(freq1);
					value.add(ele);
				}
				freq1=1;
				ele=0;
			}
			int count=0;
			ArrayList<Integer>al=new ArrayList<>();
			ArrayList<Integer>alfreq=new ArrayList<>();
			for(int i=0;i<freq.size();i++)
			{
				for(int j=i+1;j<freq.size();j++)
				{
					if(freq.get(i)==freq.get(j))
					{
						count++;
					}
				}
				al.add(freq.get(i));
				alfreq.add(count);
				count=0;
			}
			int min=0;
			for(int i=0;i<al.size();i++)
			{
				if(min>=alfreq.get(i))
				{
					min=al.get(i);
				}
			}
			int check=0;
			for(int i=0;i<value.size();i++)
			{
				if(freq.get(i)>min)
				{
					check++;
				}
			}
			if(check>1)
			{
				System.out.println("NO");
				
			}
			if(check<=1)
			{
				System.out.println("YES");
			}
		}
		sc.close();
	}
}
