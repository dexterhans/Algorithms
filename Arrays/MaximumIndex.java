import java.io.*;
public class MaximumIndex
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
			int[] arr1=new int[size];
			int[] arr2=new int[size];
			arr1[0]=arr[0];
			for(int i=1;i<size;i++)
				arr1[i]=Math.min(arr1[i-1],arr[i]);
			arr2[size-1]=arr[size-1];
			for(int i=size-2;i>=0;i--)
				arr2[i]=Math.max(arr2[i+1],arr[i]);

			int i=0;
			int j=0;
			int max_diff=-1;
			while(i<size && j<size)
			{
				if(arr1[i]<arr2[j])
				{
					
						max_diff=Math.max(max_diff,j-i);
					j++;
				}
				else
					i++;
			}
			System.out.println(max_diff);
		}
	}
}
