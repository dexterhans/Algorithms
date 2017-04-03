
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
        void DFS(int start,boolean[] visited,LinkedList<Integer> list)
        {
                visited[start]=true;
                //System.out.println(start);
                Iterator<Integer> iterator=adjList.get(start).iterator();
                while(iterator.hasNext())
                {
                        int x=iterator.next();
                        if(visited[x]==false)
                                DFS(x,visited,list);
                }
                list.addFirst(start);
        }
        void DFSOnTranspose(int start,ArrayList<LinkedList<Integer>> transpose,boolean[] visited)
        {
                visited[start]=true;
                System.out.print(start+" ");
                Iterator<Integer> iterator=transpose.get(start).iterator();
                while(iterator.hasNext())
                {
                        int x=iterator.next();
                        if(visited[x]==false)
                                DFSOnTranspose(x,transpose,visited);
                }
               
        }
        ArrayList<LinkedList<Integer>> constructTranspose()
        {
        	ArrayList<LinkedList<Integer>> transpose=new ArrayList<LinkedList<Integer>>();
        	for(int i=0;i<=vertices;i++)
        		transpose.add(i,new LinkedList<Integer>());
        	for(int i=1;i<=vertices;i++)
        	{	
        	Iterator<Integer> iterator=adjList.get(i).iterator();
        	while(iterator.hasNext())
        	{
        		transpose.get(iterator.next()).add(i);
        	}
        	}
			return transpose;
        }
}
class StronglyConnected{

        public static void main(String[] args)
        {

                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                Graph g=new Graph(n);
                g.addEdge(1,2);
                g.addEdge(2,3);
                g.addEdge(3,1);
                g.addEdge(5,1);
                g.addEdge(4,3);
                g.addEdge(3,5);
                boolean[] visited=new boolean[n+1];
                LinkedList<Integer> list=new LinkedList<Integer>();
                for(int i=1;i<=n;i++)
                {
                	if(visited[i]==false)
                		g.DFS(i,visited,list);
                }
                Iterator<Integer> iterator;
               
                visited=new boolean[n+1];
                ArrayList<LinkedList<Integer>> transpose=g.constructTranspose();
                iterator=list.iterator();
                while(iterator.hasNext())
                {
                	Integer i=iterator.next();
                	if(visited[i]==false)
                	{
                		g.DFSOnTranspose(i,transpose,visited);
                	
                	System.out.println();
                	}
                }
               
        }
}

