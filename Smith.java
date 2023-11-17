import java.util.Scanner;
class Smith
{
  int Tofindsum(int n)
 {	int s=0;
	while(n>0)
	{
	 s=s+n%10;
	 n=n/10;
	}
	return s;
 }
int Primefact(int n)
	{
	  int i=2,sum=0;
	  while(n>1)	
	  {
	    if(n%i==0)
 	    {
		sum=sum+Tofindsum(i);
		n=n/i;
	    }
	    else 
		i++;
	    } 
             return sum;
	}
public static void main(String[] args)
{	Scanner sc = new Scanner(System.in);
	Smith ob=new Smith();
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int a=ob.Tofindsum(n);
	int b=ob.Primefact(n);
	if(a==b)
	 System.out.println("smith");
	else
	System.out.println("not smith");
	}
}