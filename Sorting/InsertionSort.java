import java.io.*;

public class InsertionSort{
	public static void main(String[] args) throws IOException
	{
	int n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(br.readLine());
	int[] arr=new int[n];
	String[] ip=br.readLine().split(" ");
	for(int i=0;i<n;i++)
		arr[i]=Integer.parseInt(ip[i]);
	int swap=0;
	for(int i=1;i<n;i++)
	{
		int j=i;
		
		while(j>=1 && arr[j]<arr[j-1])
		{
		arr[j]=arr[j]+arr[j-1];
		arr[j-1]=arr[j]-arr[j-1];
		arr[j]=arr[j]-arr[j-1];
		j--;
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
