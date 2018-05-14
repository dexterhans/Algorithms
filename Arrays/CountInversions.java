import java.io.*;
public class CountInversions
{
	public static int merge(int[] arr,int left, int mid,int right)
	{
		
	int x=0;
	int count=0;
	int[] temp=new int[right-left+1];
	int i=left,j=mid+1,k=0;
	while(i<=mid && j<=right)
	{
	if(arr[i]<=arr[j])
	{
	temp[k++]=arr[i++];
	}
	else
	{
	temp[k++]=arr[j++];
	count+=mid-i+1;
	}
	}
	while(i<=mid)
	temp[k++]=arr[i++];
	while(j<=right)
	temp[k++]=arr[j++];
	k=0;
	for(i=left;i<=right;i++)
	arr[i]=temp[k++];
	return count;
	}
	public static int mergeSort(int[] arr,int left,int right)
	{
		int count=0;
		if(left<right)
		{
			int mid=(left+right)/2;
			count=mergeSort(arr,left,mid);
			count+=mergeSort(arr,mid+1,right);
			count+=merge(arr,left,mid,right);
		}
		return count;
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
			System.out.println(mergeSort(arr,0,arr.length-1));	
		//	 for(int i=0;i<size;i++)
                  //             System.out.println(arr[i]);
		}
	}
}
