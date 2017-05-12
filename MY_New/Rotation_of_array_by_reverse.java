import java.io.*;
class Rotation_of_array_by_reverse{
	public static void main(String[] args) throws Exception
	{
		int t;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			String[] ip1=br.readLine().split(" ");
			int n=Integer.parseInt(ip1[0]);
			int d=Integer.parseInt(ip1[1]);
			String[] ip2=br.readLine().split(" ");
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(ip2[i]);
			for(int i=0;i<n/2;i++)
			{
				if(i!=n-1-i)
				{
					arr[i]=arr[i]+arr[n-i-1];
					arr[n-i-1]=arr[i]-arr[n-i-1];
					arr[i]=arr[i]-arr[n-i-1];
				}
			}
			for(int i=0;i<(n-d)/2;i++)
			{
				int a=n-d-1-i;
				if(i!=a)
				{
					arr[i]=arr[i]+arr[a];
					arr[a]=arr[i]-arr[a];
					arr[i]=arr[i]-arr[a];
				}
			}
			int j=0;
			for(int i=n-d;i<n-d/2;i++)
			{
				int a=n-1-j;
				if(i!=a)
				{
					arr[i]=arr[i]+arr[a];
					arr[a]=arr[i]-arr[a];
					arr[i]=arr[i]-arr[a];
				}
				j++;
			}
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}

	}
}
