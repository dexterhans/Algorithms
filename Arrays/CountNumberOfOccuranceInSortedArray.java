import java.io.*;
public class CountNumberOfOccuranceInSortedArray
{
	public static int getFirst(int[] arr,int x)
	{
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(start<=end)
		{
			if((mid==0 || arr[mid-1]<arr[mid]) && arr[mid]==x)
				return mid;
			if(arr[mid]<x)
				start=mid+1;
			else
				if(arr[mid]>=x)
					end=mid-1;
			mid=(start+end)/2;
		}
		return -1;
	}
	public static int getLast(int[] arr,int x)
	{
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(start<=end)
		{
			if((mid==arr.length-1 || arr[mid+1]>arr[mid]) && arr[mid]==x)
				return mid;
			if(arr[mid]<=x)
				start=mid+1;
			else
				if(arr[mid]>x)
					end=mid-1;
			mid=(start+end)/2;
		}
		return -1;
	}

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
		String[] ip1=br.readLine().split(" ");
		int size=Integer.parseInt(ip1[0]);
		int x=Integer.parseInt(ip1[1]);
		String[] ip=br.readLine().split(" ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=Integer.parseInt(ip[i]);
		int first=getFirst(arr,x);
		int last=getLast(arr,x);
		if(first==-1)
			System.out.println(-1);
		else
			System.out.println(last-first+1);
		}
	}
}
