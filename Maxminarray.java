//Printing the ith min,max elements in an array
import java.util.*;
public class Maxminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int mid=0,flag=0;
		if(n%2!=0)
		{
			mid=n/2+1;
			flag=1;
		}
		else
		{
			mid=n/2;
		}
		System.out.println("The resultant array is:");
		for(int i=0;i<mid;i++)
		{
			if(i<mid-1)
			System.out.print(arr[i]+" "+arr[n-i-1]+" ");
			else if(flag==1&&i==mid-1)
			{
				System.out.print(arr[i]+" ");
			}
			else if(flag==0)
				System.out.print(arr[i]+" "+arr[n-i-1]+" ");
		}
	}

}
