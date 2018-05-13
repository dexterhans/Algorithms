import java.io.*;
public class CheckIfArrayElementsAreConsecutive
{
        public static void main(String[] args) throws Exception
        {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int size=Integer.parseInt(br.readLine());
                String[] ip=br.readLine().split(" ");
                int[] arr=new int[size];
                for(int i=0;i<size;i++)
                {
                        arr[i]=Integer.parseInt(ip[i]);
                }
                int min=0;
                int max=0;
                if(arr[0]>arr[1])
                {
                        min=arr[1];
                        max=arr[0];
                }
                else
                {
                        min=arr[0];
                        max=arr[1];
                }
                for(int i=2;i<size;i++)
                {
                        if(arr[i]<min)
                                min=arr[i];
                        else
                                if(arr[i]>max)
                                        max=arr[i];
                }
                System.out.println(min+ "  "+max);
                c:
                if(max-min+1==size)
                {
                        for(int i=0;i<size;i++)
                        {
                        int j;
                        if(arr[i]>0)
                        j=arr[i]-min;
                        else
                        j=-arr[i]-min;
                        if(arr[j]>0)
                        {
                        arr[j]=-arr[j];
                        }
                        else
                        {
                        System.out.println(false);
                        break c;
                        }

                        }
                 System.out.println(true);

                }
                else
                System.out.println(false);
        }
}
