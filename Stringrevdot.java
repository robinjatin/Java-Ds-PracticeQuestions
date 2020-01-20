//Reversing the string with respect to dots
import java.util.*;
public class Stringrevdot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int a=0;a<t;a++)
		{
			String str=sc.next();
			String[] arr=str.split("\\.");
			for(int i=arr.length-1;i>0;i--)
			{
				System.out.print(arr[i]+".");
			}
			System.out.println(arr[0]);
		}
	}
}
