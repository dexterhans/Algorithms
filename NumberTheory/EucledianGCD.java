import java.util.Scanner;

public class EucledianGCD{
	public static int eucledianGCD(int a,int b)//how it works?
						// let's consider g is the gcd and a=gx, b=gy, a%b=a-bk=gx-gyk=g(x-yk) so even the 
	{					// number a%b which is less than b is divided by gcd g so we can simplify the gcd 
		if(a<0)				// to GCD(b,a%b) which has same set of divisors.The converse is also true if b and a%b
			a=-a;			// is divided by g, then a and b is divided by g. eventually we get a pair(u,0) where 
		if(b<0)				// u is the GCD.
			b=-b;
		if(b==0)
			return a;
		else
			return eucledianGCD(b, a%b);
		
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
