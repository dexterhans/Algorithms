import java.io.*;
public class LengthUnsortedSubarray
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
				arr[i]=Integer.parseInt(ip[i]);

			int i=0;
			while(i<size-1 && arr[i]<=arr[i+1])
			{
				i++;
			}
			int j=size-1;
			while(j>0 && arr[j-1]<arr[j])
			{
				j--;
			}

			int min=arr[i],max=arr[i];
			for(int x=i+1;x<=j;x++)
			{
				if(min>arr[x])
				{
				min=arr[x];
				}
				if(max<arr[x])
				{
				max=arr[x];
				}
			}
			for(int x=0;x<size;x++)
			{
				if(arr[x]>min)
				{
					i=x;
					break;
				}
			}
			for(int x=size-1;x>=0;x--)
			{
				if(arr[x]<max)
				{
					j=x;
					break;
				}
			}
			System.out.println(i+" "+j);

		}
	}
}
