import java.util.*;
import java.lang.*;
import java.io.*;

class SegregateEvenOdd{
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
			int count=0;
			for(int i=0;i<size;i++)
			{
				if(arr[i]%2==0)
					count++;
			}
			int i=0;
			int j=size-1;

			while(true)
			{
				while(i<size && arr[i]%2==0)
				{
					i++;
				}
				while(j>=0 && arr[j]%2==1)
				{
					j--;
				}
				if(i<j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				else
					break;
			}
			Arrays.sort(arr,0,count);
			Arrays.sort(arr,count,size);
		}
	}
}
