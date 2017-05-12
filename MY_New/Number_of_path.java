import java.util.*;
import java.lang.*;
import java.io.*;

public class Number_of_path{
	public static long fact(long n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) throws Exception {
		int t;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			String[] ip=br.readLine().split(" ");
			int a=Integer.parseInt(ip[0]);
			int b=Integer.parseInt(ip[1]);
			a--;
			b--;
			long ans=fact(a+b);
			ans=ans/fact(a);
			ans=ans/fact(b);
			System.out.println(ans);
		}
	}
}
