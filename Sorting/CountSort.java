import java.io.*;

public class sample{
        public static void  CountSort(int[] arr,int n)
        {
        	int max=Integer.MIN_VALUE;
        	for(int i=0;i<n;i++)
        	{
        		if(max<arr[i])
        			max=arr[i];
        	}
        	int[] temp=new int[max+1];
        	for(int i=0;i<n;i++)
        	{
        		temp[arr[i]]++;
        	}
        	for(int i=1;i<=max;i++)
        		temp[i]+=temp[i-1];
        	int[] output=new int[n];
        	for(int i=0;i<n;i++)
        	{
        		output[temp[arr[i]]-1]=arr[i];
        		temp[arr[i]]--;
        	}
        	for(int i=0;i<n;i++)
        	{
        		arr[i]=output[i];
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

        CountSort(arr,n);
        for(int i=0;i<n;i++)
        {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        }
}

