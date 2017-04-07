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
		adjList.get(v).add(u);
	}
	boolean isBipartiteUtil(int[] color,int i)
	{

		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(i);
		color[i]=1;
		while(!queue.isEmpty())
		{
			int x=queue.poll();
			Iterator<Integer> iterator=adjList.get(x).iterator();
			while(iterator.hasNext())
			{

				int v=iterator.next();
				if(color[v]==-1)
				{
					queue.add(v);
					color[v]=1-color[x];

				}
				else
				if(color[v]==color[x])
					return false;
			}
		}
		return true;
	}
	boolean isBipartite()
	{
		int[] color=new int[size];	
		for(int i=0;i<size;i++)
			color[i]=-1;
		for(int i=0;i<size;i++)
		{
			if(color[i]==-1)
			if(isBipartiteUtil(color,i)==false)
				return false;

		}
		return true;	
	}
}
public class Bipartite{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int a0 = 0; a0 < t; a0++){
			String[] ip1 = br.readLine().split(" ");
			int n = Integer.parseInt(ip1[0]);
			int m = Integer.parseInt(ip1[1]);
			Graph g=new Graph(n);
			for(int a1 = 0; a1 < m; a1++){
				String[] ip2 = br.readLine().split(" ");
				int x = Integer.parseInt(ip2[0]);
				int y = Integer.parseInt(ip2[1]);
				g.addEdge(x,y);
			}

	System.out.println(g.isBipartite());
		}
	}
}

