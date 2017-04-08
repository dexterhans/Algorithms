import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Scanner;



class Graph{
        private Integer vertices;
        private ArrayList<LinkedList<Integer>> adjList;
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
        int DFS(int start,int[] visited)
        {
                visited[start]=1;
                //System.out.println(start);
                Iterator<Integer> iterator=adjList.get(start).iterator();
                while(iterator.hasNext())
                {
                        int x=iterator.next();
                        if(visited[x]==0)
                                return DFS(x,visited);
                        else if(visited[x]==1)
                        {
                        	//System.out.println("cycle detected");
                        	return 1;
                        }
                }
                visited[start]=2;
                return 0;
        }
}
class CycleDetect{

        public static void main(String[] args)
        {

                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                Graph g=new Graph(n);
                g.addEdge(1,3);
		g.addEdge(1,2);              
                g.addEdge(3,2);
                g.addEdge(5,4);
                g.addEdge(4,5);
              
                int[] visited=new int[n+1];
		for(int i=1;i<=n;i++)
		{
		if(visited[i]==0)
		{
                int result=g.DFS(i,visited);
                if(result==1)
                {
		System.out.println("cycle detected");
		return;
		}
		}
		}
		 System.out.println("cycle not detected");
        }
}

