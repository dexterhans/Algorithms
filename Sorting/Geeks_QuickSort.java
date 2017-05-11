import java.io.*;

public class Geeks_QuickSort{
        static int findPivot(int[] arr,int a,int b)
        {

                int pivot=arr[a];
                int x=a;
                int y=b;

                while(true)
                {
                        while(arr[x]<pivot)
                        {
                                x++;
                        }
                        while(arr[y]>pivot)
                        {
                                y--;
                        }
                        if(x<y)
		        {
                        arr[x]=arr[y]+arr[x];
                        arr[y]=arr[x]-arr[y];
                        arr[x]=arr[x]-arr[y];
                        y--;
                        x++;
                        }
			else
			return y;// no return x 3 4 3 4 2 2 3

                }
                
        }
        static void quickSort(int[] arr,int a,int b)
        {
                if(a<b)
                {
                int pivot=findPivot(arr,a,b);
                quickSort(arr,a,pivot);
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

