import java.io.*;
public class FindMissingAndRepeating{
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

			for(int i=0;i<size;i++)
			{
				if(arr[Math.abs(arr[i])-1]>0)
				{
					arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
				}
				else
				{
					System.out.print(Math.abs(arr[i]));	
				}
			}
			for(int i=0;i<size;i++)
			{
				if(arr[i]>0)
				{
					System.out.println(" "+(i+1));
					break;
				}
			}

		}
}
}
