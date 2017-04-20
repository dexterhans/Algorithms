import java.util.Scanner;

public class ModularExponentiation{
	public static long modularExponentiation(long base,long exponent)
	{
		long result=1;
		while(exponent>0)
		{
			if(exponent%2==1)
				result=result*base;
			base=base*base;
			exponent=exponent/2;
			
		}
		return result;
	}
	public static void main(String[] args)
	{
		long base,exponent;
		Scanner sc=new Scanner(System.in);
		base=sc.nextLong();
		exponent=sc.nextLong();
		long ans=modularExponentiation(base,exponent);
		System.out.println(ans);
	}
}
