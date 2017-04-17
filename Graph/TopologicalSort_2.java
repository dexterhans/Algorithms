	import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
	
	class Graph{
		ArrayList<LinkedList<Integer>> adjList;
		Integer size;
		Graph(int size)
		{
			this.size=size;
			adjList=new ArrayList<LinkedList<Integer>>();
			for(int i=0;i<size;i++)
			{  
				adjList.add(i,new LinkedList<Integer>());
			}
		}
		void addEdge(int u,int v)
		{
			
				adjList.get(u).add(v);
			
		}
		void defineInDegree(int[] inDegree)
		{
			for(int i=0;i<size;i++)
			{
			Iterator<Integer> iterator=adjList.get(i).iterator();
			while(iterator.hasNext())
			{
				int x=iterator.next();
				inDegree[x]++;
			}
			}
		}
		void topologicalSort(Queue<Integer> queue,int[] inDegree)
		{
			int x;
			LinkedList<Integer> list=new LinkedList<Integer>();
			int j=0;
			while(!queue.isEmpty())
			{	
			x=queue.poll();
			j++;
			list.addLast(x);
			Iterator<Integer> iterator=adjList.get(x).iterator();
			while(iterator.hasNext())
			{
				int y=iterator.next();
				inDegree[y]--;
				if(inDegree[y]==0)
					queue.add(y);
			}
			}
			if(j==size)
			{
				Iterator<Integer> iterator=list.iterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}
			}
			else
				System.out.println("IMPOSSIBLE");
		}
		
	}
	public class TopologicalSort_2{
	
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
				String[] ip=br.readLine().split(" ");
				int n = Integer.parseInt(ip[0]);
				int m = Integer.parseInt(ip[1]);
				Graph g=new Graph(n);
				int i=0;
				while(i<m)
				{
					String[] ip1=br.readLine().split(" ");
					g.addEdge(Integer.parseInt(ip1[0]), Integer.parseInt(ip1[1]));
					i++;
				}
				int[] inDegree=new int[n];
				g.defineInDegree(inDegree);
				Queue<Integer> queue=new LinkedList<Integer>();
				for(i=0;i<n;i++)
				{
					if(inDegree[i]==0)
					queue.add(i);
				}
				g.topologicalSort(queue,inDegree);
				
			}
		}
	

