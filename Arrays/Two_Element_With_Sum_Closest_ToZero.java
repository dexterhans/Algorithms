import java.io.*;
import java.util.*;
public class Two_Element_With_Sum_Closest_ToZero{
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
			{
				arr[i]=Integer.parseInt(ip[i]);
			}

			Arrays.sort(arr);
			int i=0;
			int j=arr.length-1;
			int a=0,b=0,sum=Integer.MAX_VALUE;
			while(i<j)
			{
				if(arr[i]+arr[j]>0)
				{
					if(sum>arr[i]+arr[j])
					{
						sum=arr[i]+arr[j];
						a=i;
						b=j;	
					}
					j--;
				}
				else
				{
					if(sum>Math.abs(arr[i]+arr[j]))
					{
						sum=Math.abs(arr[i]+arr[j]);
						a=i;
						b=j;

					}
					i++;
				}
			}
			System.out.println(arr[a]+" "+arr[b]);
		}
	}
}
