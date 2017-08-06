import java.io.*;
public class Segregate012{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		String[] ip=br.readLine().split(" ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=Integer.parseInt(ip[i]);
		int i=0;
		int j=0;
		int k=size-1;
		while(j<=k)
		{
			
			if(arr[j]==0)
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				j++;
			}
			else
			if(arr[j]==2)
			{
				int temp=arr[j];
                                arr[j]=arr[k];
                                arr[k]=temp;
				k--;
			}
			else
			{
				j++;
			}
		}
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	}
}
