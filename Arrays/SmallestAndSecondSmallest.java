import java.io.*;
public class SmallestAndSecondSmallest
{
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
			{
				arr[i]=Integer.parseInt(ip[i]);
			}
			int min=Integer.MAX_VALUE;
			int min_sec=Integer.MAX_VALUE;
			for(int i=0;i<size;i++)
			{
			if(arr[i]<min)
			{
			min_sec=min;
			min=arr[i];
			}	
			else if(arr[i]<min_sec && arr[i]!=min)
			{
			min_sec=arr[i];
			}
			}
			if(min!=Integer.MAX_VALUE && min_sec!=Integer.MAX_VALUE)
			System.out.println(min+""+min_sec);
			else
			 System.out.println(-1);
		}
	}
}

