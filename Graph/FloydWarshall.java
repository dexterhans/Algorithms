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
		for(int i=0;i<size;i++)
		{  
			adjList.add(i,new LinkedList<Node>());
		}
	}
	void addEdge(int u,int v,int w)
	{
		adjList.get(u).add(new Node(v,w));
	}
	void floydWarshall()
	{
		int[][] dist=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{	
				if(i!=j)
					dist[i][j]=100000;
			}
		}
		for(int i=0;i<size;i++)
		{	
			Iterator<Node> iterator=adjList.get(i).iterator();
			while(iterator.hasNext())
			{
				Node node=iterator.next();
				dist[i][node.getVerticeNo()]=node.getWeight();
			}
		}
		for(int k=0;k<size;k++)
			for(int i=0;i<size;i++)
				for(int j=0;j<size;j++)
				{
					if (dist[i][k] + dist[k][j] < dist[i][j])
						dist[i][j] = dist[i][k] + dist[k][j];
				}

		for(int i=0;i<size;i++)
			{
			for(int j=0;j<size;j++)
			{
			System.out.print(dist[i][j]+" ");
			}
			System.out.println();
			}


	}
}
public class FloydWarshall{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String[] ip1 = br.readLine().split(" ");
		int n = Integer.parseInt(ip1[0]);
		int m = Integer.parseInt(ip1[1]);
		Graph g=new Graph(n);
		for(int a1 = 0; a1 < m; a1++){
			String[] ip2 = br.readLine().split(" ");
			int x = Integer.parseInt(ip2[0]);
			int y = Integer.parseInt(ip2[1]);
			int r = Integer.parseInt(ip2[2]);
			g.addEdge(x,y,r);
		}
		g.floydWarshall();
	}
}


