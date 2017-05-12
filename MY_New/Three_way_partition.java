import java.io.*;
public class Three_way_partition{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			int size=Integer.parseInt(br.readLine());
			int[] arr=new int[size];
			String[] ip1=br.readLine().split(" ");
			for(int i=0;i<size;i++)
				arr[i]=Integer.parseInt(ip1[i]);
			String[] ip2=br.readLine().split(" ");
			int low,high;
			low=Integer.parseInt(ip2[0]);
			high=Integer.parseInt(ip2[1]);
			int start=0;
			int end=size-1;
			for(int i=0;i<=end;)
			{
				if(arr[i]<low)
				{
					 int temp = arr[start];
                			arr[start] = arr[i];
                			arr[i] = temp;
					start++;
					i++;
				}
				else if(arr[i]>high)
				{
					int temp = arr[end];
                			arr[end] = arr[i];
                			arr[i] = temp;
					end--;				
				}
				else
					i++;
			}
		for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");	
		}
	}
}
