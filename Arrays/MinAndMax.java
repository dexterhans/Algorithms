import java.io.*;
class Pair{
	int min;
	int max;
}
public class MinAndMax{ // complexity is 3/2n-2 instead of 2n comparison
	public static Pair findMinMax(int[] arr,int low,int high)
	{
		Pair p=new Pair();
		if(high==low)
		{
			p.min=low;
			p.max=low;
			return p;
		}
		else
			if(high-low==1)
			{
				if(arr[high]>arr[low])
				{
					p.min=arr[low];
					p.max=arr[high];
					return p;
				}
				else
				{
					p.max=arr[low];
					p.min=arr[high];
					return p;
				}
			}
		int mid=(low+high)/2;
		Pair p1=findMinMax(arr,low,mid);
		Pair p2=findMinMax(arr,mid+1,high);
		if(p1.min>p2.min)
		{
			p.min=p2.min;
		}
		else
		{
			p.min=p1.min;
		}
		if(p1.max>p2.max)
		{
			p.max=p1.max;
		}
		else
		{
			p.max=p2.max;
		}
		return p;
	}
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		String[] ip=br.readLine().split(" ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(ip[i]);
		}
		Pair p=findMinMax(arr,0,size-1);
		System.out.println(p.min+" "+p.max);
	}
}
