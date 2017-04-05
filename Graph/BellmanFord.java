import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
	Integer verticeNo;
	Integer weight;
	Node(int no,int weight)
	{
		verticeNo=no;
		this.weight=weight;
	}
	public void setVerticeNo(int a)
	{
		this.verticeNo=a;
	}
	public Integer getVerticeNo()
	{
		return this.verticeNo;
	}
	public void setWeight(int a)
	{
		this.weight=a;
	}
	public Integer getWeight()
	{
		return this.weight;
	}
}
class Graph{
	ArrayList<LinkedList<Node>> adjList;
	Integer size;
	Graph(int size)
	{
		this.size=size;
		adjList=new ArrayList<LinkedList<Node>>();
		for(int i=0;i<=size;i++)
		{
			adjList.add(i,new LinkedList<Node>());
		}
	}
	void addEdge(int u,int v,int w)
	{
		adjList.get(u).add(new Node(v,w));
		adjList.get(v).add(new Node(u,w));
	}
	int[] bellmanFord(int source)
	{
		int[] distance=new int[size];
		for(int i=0;i<size;i++)
		{
			distance[i]=Integer.MAX_VALUE;
		}
		distance[source]=0;
		for(int i=1;i<size;i++)
			for(int j=0;j<size;j++)
			{
				Iterator<Node> iterator=adjList.get(j).iterator();
				while(iterator.hasNext())
				{
					Node node=iterator.next();
					if(distance[j]!=Integer.MAX_VALUE && distance[node.getVerticeNo()]>distance[j]+node.getWeight())
					{	
						distance[node.getVerticeNo()]=distance[j]+node.getWeight();
					}
				}
			}
		for(int j=0;j<size;j++)
		{
			Iterator<Node> iterator=adjList.get(j).iterator();
			while(iterator.hasNext())
			{
				Node node=iterator.next();
				if(distance[j]!=Integer.MAX_VALUE && distance[node.getVerticeNo()]>distance[j]+node.getWeight())
				{
					distance[node.getVerticeNo()]=Integer.MAX_VALUE;
				}
			}
		}
		return distance;
	}
}
public class BellmanFord{

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
				int r = Integer.parseInt(ip2[2]);
				g.addEdge(x-1,y-1,r);
			}
			int s = Integer.parseInt(br.readLine());
			int[] dist=g.bellmanFord(s-1);
			for(int i=0;i<n;i++)
			{
				if(i!=s-1)
				{
					if(dist[i]!=Integer.MAX_VALUE)
						System.out.print(dist[i]+" ");
					else
						System.out.print(-1+" ");

				}
			}
		}
	}
}

