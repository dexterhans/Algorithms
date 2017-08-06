import java.io.*;
public class  FixedPointInArray
{
	public static int binarySearch(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(start<=end)
		{
			if(arr[mid]==mid)
				return mid;
			else
				if(arr[mid]>mid)
					end=mid-1;
				else
					if(arr[mid]<mid)
						start=mid+1;
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
			int size=Integer.parseInt(br.readLine());
			String[] ip=br.readLine().split(" ");
			int[] arr=new int[size];
			for(int i=0;i<size;i++)
				arr[i]=Integer.parseInt(ip[i]);
			System.out.println("hi  "+ binarySearch(arr));
		}
	}
}
