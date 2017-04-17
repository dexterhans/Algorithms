import java.io.*;

public class SelectionSort{
	public static void main(String[] args) throws IOException
	{
	int n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(br.readLine());
	int[] arr=new int[n];
	String[] ip=br.readLine().split(" ");
	for(int i=0;i<n;i++)
		arr[i]=Integer.parseInt(ip[i]);
	int max;
	int swap=0;
	for(int i=0;i<n-1;i++)
	{
		max=0;
		for(int j=1;j<n-i;j++)
		{
			if(arr[j]>arr[max])
				max=j;
		}
		if(max!=n-i-1)
		{
			arr[max]=arr[max]+arr[n-i-1];
			arr[n-i-1]=arr[max]-arr[n-i-1];
			arr[max]=arr[max]-arr[n-i-1];
			swap++;
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.print(swap);
	}
}
