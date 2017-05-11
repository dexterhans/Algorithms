import java.io.*;

public class QuickSort{
        static int findPivot(int[] arr,int a,int b)
        {

                int pivot=arr[b];
                int x=a;
                int y=b;

                while(x<y)// if we put <= it causes problem in case of 4 3 2 1
                {
                        while(x<b && arr[x]<=pivot)// to make sure it doesn't go out of bounds and skips everything less pivot
                        {
                                x++;
                        }
                        while(y>a && arr[y]>=pivot)
                        {
                                y--;
                        }
                        if(x<y)// to make sure swap doesn't happen when x>=y and x++,y-- is not necessary as we skip pivots, so the two left 
				// and right pointer won't get stuck at the same pivot which happens when the pivot is not skipped and ends up 					// in a infinite loop.
                        {
                        arr[x]=arr[y]+arr[x];
                        arr[y]=arr[x]-arr[y];
                        arr[x]=arr[x]-arr[y];
                       // y--;
                       // x++;
                        }
                       
                }
                arr[b]=arr[x];//this won't be necessary if we were not skipping the pivot resulting in swaps to bring the pivot in correct posi
                arr[x]=pivot;// -tion, but in hoare's when we put arr[x]<pivot and arr[y]>pivot we don't get the pivot placed at correct positi					// -on but the two parts 0 to pivot and pivot+1 to n-1 gets partitioned as less than pivot and greater resp.
                return x;	// not in this case though as we have used <= and >=
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

