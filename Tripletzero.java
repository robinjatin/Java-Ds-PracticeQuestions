//triplet equals zero or not
import java.util.*;
public class Tripletzero {

	static boolean findTriplets(int arr[],int n)
	{
		int flag=0;
		int sum=0;
		for(int i=0;i<n-3+1;i++)
		{
			for(int j=i;j<i+3;j++)
			{
				sum+=arr[j];
			}
			if(sum==0)
			{
				flag=1;
			}
			sum=0;
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of testcases");
		int t=sc.nextInt();
		for(int z=0;z<t;z++)
		{
			System.out.println("Enter the input size of the array");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			boolean a=findTriplets(arr,n);
			if(a==true)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

}
