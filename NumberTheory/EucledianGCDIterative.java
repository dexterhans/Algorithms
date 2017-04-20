import java.util.Scanner;

public class EucledianGCDIterative{
	public static int eucledianGCD(int a,int b)//this is a version of euclid's first formulation GCD(a,b)=GCD(a,a-b)=GCD(2a-b,a-b)
	{					// if 2 numbers are prime then they are coprime to addition of those two numbers and difference
		if(a<0)				//of those two numbers.this is the basis to this theorem.:wq

			a=-a;
		if(b<0)
			b=-b;
		while(b!=0)
		{
			int temp=a%b;
			a=b;
			b=temp;
		}
		return a;
		
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test--!=0)
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=eucledianGCD(a,b);
		System.out.println(ans);
		}
	}
}
