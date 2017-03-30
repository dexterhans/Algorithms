import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



class Graph{
	private Integer vertices;
	private List<Integer>[] list;// create a handler of array of list
	@SuppressWarnings("unchecked")
	 Graph(int n) {
		this.vertices=n;
		list=(List<Integer>[])new List[n+1];// instantiate the array, done in such a way as parametrized array is not allowed
											//in java
		for(int i=1;i<=n;i++)
			list[i]=new ArrayList<Integer>();
	}
	 void addEdge(int v,int w)
	{
		list[v].add(w);
	}
	void DFS(int start,boolean[] visited)
	{
		visited[start]=true;// set the currently visited node to true.
		System.out.println(start);
		ListIterator<Integer> iterator=list[start].listIterator();// to go thru all the nodes connected to the current node.
		while(iterator.hasNext())
		{
			int x=iterator.next();
			if(visited[x]==false)
				DFS(x,visited);
		}
	}
	void DFSCall(boolean[] visited)
	{
		int i;
		for(i=1;i<vertices+1;i++)// need this as the graph could be disconnected, so have to check for every nodes.
		{
			//System.out.println("hi");
		
			
			if(visited[i]==false)
				DFS(i,visited);
		}
		
	}
}
class DepthFirstSearch{
	
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
		g.DFSCall(visited);
	}
}

