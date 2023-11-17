
import java.util.Scanner;
class Diseriam
{	public static void main(String[] args)
	{	
		Scanner sc =new Scanner(System.in);
	 	System.out.println("Enter the number:");
	 	int n=sc.nextInt();
                int n1=n;
		int sum=0;
		int c=0;
		int p;
		while(n1>0)
		{
			n1=n1/10;
			c=c+1;
		}
		n1=n;
		
		while(n1>0)
		{
			p=1;
			int r =n1%10;
			n1=n1/10;
			

			for(int i=1;i<=c;i++)
				p=p*r;
				sum=sum+p;
				c=c-1;
		}
		if(n==sum)
			System.out.println("Diseriam");
		else
			System.out.println("Not Diseriam");
		}
			
	 





}