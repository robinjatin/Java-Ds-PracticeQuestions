//Second largest number in an array
import java.util.*;
public class Secondlargestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the input of array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest: "+arr[n-1]);
		System.out.println("Second Largest: "+arr[n-2]);
		sc.close();
	}

}
