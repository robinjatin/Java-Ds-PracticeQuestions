//finding the maximum number in an array window of particular size
import java.util.Scanner;
public class Maxwindowarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the window size");
		int k=sc.nextInt();
		System.out.println("Max elements in the window are");
		int max=0;
		for(int i=0;i<n-k+1;i++)
		{
			max=arr[i];
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
			System.out.print(max+" ");
		}
	}

}
