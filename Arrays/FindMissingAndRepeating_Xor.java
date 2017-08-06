import java.io.*;
public class FindMissingAndRepeating_Xor{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			int size=Integer.parseInt(br.readLine());
			String[] ip=br.readLine().split(" ");
			int[] arr=new int[size];
			for(int i=0;i<size;i++)
				arr[i]=Integer.parseInt(ip[i]);
			int sum=0;

			for(int i=0;i<size;i++)
			{
				sum^=arr[i];
				sum^=(i+1);
			}

			int x=0;
			int y=0;
			int bit=0;
			bit=Integer.lowestOneBit(sum);
			for(int i=0;i<size;i++)
			{
				if((arr[i] & bit)!=0)
				{
					x^=arr[i];
				}
				else
				{
					y^=arr[i];
				}
			}
			for(int i=0;i<size;i++)
			{
				if(((i+1)&bit)!=0)
					x^=(i+1);
				else
					y^=(i+1);
			}
			if(x>y)
			System.out.println(x+" "+y);
			else
			 System.out.println(y+" "+x);
		}
	}
}

