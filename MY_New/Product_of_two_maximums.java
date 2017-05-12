import java.util.*;
import java.io.*;
public class Product_of_two_maximums {
public static void main(String[] args) throws Exception
{
	int t;
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	t=Integer.parseInt(reader.readLine());
	while(t--!=0)
	{
		int n=Integer.parseInt(reader.readLine());
		int[] arr=new int[n];
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>(1,new Comparator<Integer>() {
			public int compare(Integer a,Integer b)
			{
				return -a.compareTo(b);
			}

			
		});
		String[] ip=reader.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(ip[i]);
			queue.add(arr[i]);
		}
		System.out.println(queue.poll()*queue.poll());
		queue.clear();
	}
}
}

