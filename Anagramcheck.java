//Checking if the two strings are anagrams or not
import java.util.*;
public class Anagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = new String();
		s1 = sc.next();
		String s2 = new String();
		s2 = sc.next();
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int flag = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(arr1[i] != arr2[i])
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		sc.close();
	}
}
