//Checking if an array justifies the Pythagorean theorem
import java.util.*;
public class Pythagoreantriplet {
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of testcases");
		int t = sc.nextInt();
		for(int a = 0;a < t;a++)
		{
			System.out.println("Enter the size of array");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the elements in the array");
			for(int i = 0;i < n;i++)
			{
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int flag = 0;
			for(int i = 0;i < n;i++)
			{
				int b = arr[i]*arr[i];
				for(int j = 0;j < n-1;j++)
				{
					if((b == (Math.pow(arr[j], 2)+Math.pow(arr[j+1], 2))))
					{
						flag++;
					}
				}
			}
			if(flag > 0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
		sc.close();
	}
}
