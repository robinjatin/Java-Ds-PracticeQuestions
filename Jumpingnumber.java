//Jumping numbers
import java.util.*;
public class Jumpingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i<=10)
			{
				System.out.print(i+" ");
			}
			else if(i>10)
			{
				int rem=i;
				int a=rem%10;
				int b=i/10;
				if((a-b)==1||(a-b)==-1)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
}
