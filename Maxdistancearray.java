//finding the max distance between two same elements
import java.util.Scanner;
public class Maxdistancearray {

	static void FindMaxDist(int arr[],int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==arr[i])
				{
					if(j-i>max)
					{
						max=j-i;
					}
				}
			}
		}
		System.out.println("The maximum distance is: "+max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the input size of the array");
			int n=sc.nextInt();
			System.out.println("Enter the elements");
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextInt();
			}
			FindMaxDist(arr,n);
		}
		sc.close();
	}

}
