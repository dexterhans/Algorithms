import java.io.*;

public class Geeks_lomuto{
        static int findPivot(int[] arr,int a,int b)
        {
	
	int pivot=arr[b];
	int j=0;
	for(int i=0;i<=b-1;i++)// run i till high-1 and for every value lower than or equal to pivot swap with a higher value indicated by j
	{
	if(arr[i]<=pivot)
	{
	if(i!=j)
	{
	arr[i]=arr[i]+arr[j];
	arr[j]=arr[i]-arr[j];
	arr[i]=arr[i]-arr[j];
	}
	j++;
	}
	}
	if(b!=j)// swap the higher value than pivot indicated by j by the pivot in the end and return j.
        {
        arr[b]=arr[b]+arr[j];
        arr[j]=arr[b]-arr[j];
        arr[b]=arr[b]-arr[j];
        }

	return j;
        }
        static void quickSort(int[] arr,int a,int b)
        {
                if(a<b)
                {
                int pivot=findPivot(arr,a,b);
                quickSort(arr,a,pivot-1);
                quickSort(arr,pivot+1,b);
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

        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        }
}

