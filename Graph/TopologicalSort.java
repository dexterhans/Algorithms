
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Scanner;



class Graph{
        private Integer vertices;
        //private int time=0;
        ArrayList<LinkedList<Integer>> adjList;
        Graph(int n)
        {
                this.vertices=n;
                adjList=new ArrayList<LinkedList<Integer>>();
                for(int i=0;i<=vertices;i++)
                        adjList.add(i,new LinkedList<Integer>());// just like initializing with new Integer() we do this. 

        }
        void addEdge(int v,int w)
        {
                adjList.get(v).add(w);
        }
        void DFS(int start,boolean[] visited,LinkedList<Integer> list)
        {
                visited[start]=true;
               // System.out.println(start);
                Iterator<Integer> iterator=adjList.get(start).iterator();
                while(iterator.hasNext())
                {
                        int x=iterator.next();
                        if(visited[x]==false)
                                DFS(x,visited,list);
                }
                list.addFirst(start);
        }
}
class TopologicalSort{

        public static void main(String[] args)
        {

                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                Graph g=new Graph(n);
                g.addEdge(1,3);
                g.addEdge(1,2);
                g.addEdge(1,5);
                g.addEdge(2,4);
                g.addEdge(4,3);
                g.addEdge(3,5);
                boolean[] visited=new boolean[n+1];
                LinkedList<Integer> list=new LinkedList<Integer>();
		int[] inDegree=new int[n+1];
		for(int i=1;i<=n;i++)
		{
		Iterator<Integer> iterator=g.adjList.get(i).iterator();
		while(iterator.hasNext())
		{
		int x=iterator.next();
		inDegree[x]=1;
		}
		//stem.out.print(inDegree[i]+" ");
	
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			if(inDegree[i]==0)
		 	g.DFS(i,visited,list);
		}
                Iterator<Integer> iterator=list.iterator();
                while(iterator.hasNext())
                {
                	System.out.print(iterator.next()+" ");
                }
        }
}

