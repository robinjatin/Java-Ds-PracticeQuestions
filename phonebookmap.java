/*Make a phonebook*/
import java.util.*;
public class phonebookmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> hmap= new HashMap<>();
		System.out.println("Enter the input size");
		int n=sc.nextInt();
		System.out.println("Enter the phone no. and the name");
		String s=new String();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt(); 
			sc.nextLine();
			s=sc.nextLine();
			hmap.put(s,a);
		}
		System.out.println("Enter the name of person whose phone number you want to print");
		for(int i=0;i<n;i++)
		{
			String s1=sc.nextLine();
			if(hmap.get(s1)!=null)
			{
				System.out.println(s1+" = "+hmap.get(s1));
			}
			else
			{
				System.out.println("Not Found");
			}
		}
	}
}
