//Finding the leaders in an array i.e the element should be greater than all the elements which to the right from it.
import java.util.Scanner;
public class Leaderarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		int arr1[]=new int[100];
		int a=0;
		for(int i=0;i<n-1;i++)
		{
			max=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					break;
				}
				else
				{
					if(j==n-1)
					{
						arr1[a]=max;
						a++;
					}
				}
			}
		}
		System.out.println("Array leaders are: ");
		for(int i=0;i<a;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println(arr[n-1]);
	}

}
