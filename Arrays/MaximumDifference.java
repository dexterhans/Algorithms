import java.io.*;
public class MaximumDifference{
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
			int x=1;
			int y=0;
			int sum=arr[x]-arr[y];
			int max=x;
			int min=y;
			for(int i=2;i<size;i++)
			{
				x=i;
				if(arr[i-1]<arr[y])
				{
					y=i-1;
				}
				if(arr[x]-arr[y]>sum)
				{
					sum=arr[x]-arr[y];
					max=x;
					min=y;
				}
			}
			System.out.println(sum);

		}
	}
}
