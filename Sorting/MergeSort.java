import java.io.*;

public class MergeSort{
	static void merge(int[] arr,int a,int mid,int b)
	{
		int[] arr1=new int[mid-a+1];
		int[] arr2=new int[b-mid];
		
		for (int i=0; i<mid-a+1; ++i)
            arr1[i] = arr[a + i];
        for (int j=0; j<b-mid; ++j)
            arr2[j] = arr[mid + 1+ j];
        
		int i=0,k=a,j=0;
		
		while(i<mid-a+1 && j<b-mid)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				arr[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<mid-a+1)
		{
			arr[k]=arr1[i];
			k++;
			i++;
		}
		while(j<b-mid)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
		
	}
	static void mergeSort(int[] arr,int a,int b)
	{
		if(a<b)
		{
		int mid=a+(b-a)/2;
		mergeSort(arr, a, mid);
		mergeSort(arr, mid+1, b);
		merge(arr,a,mid,b);
		}
	}
	public static void main(String[] args) throws IOException
	{
	int n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(br.readLine());
	int[] arr=new int[n];
	String[] ip=br.readLine().split(" ");
	for(int i=0;i<n;i++)
		arr[i]=Integer.parseInt(ip[i]);
	
	mergeSort(arr,0,n-1);
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	}
}
