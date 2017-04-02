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
    void Dijkstra(int start)
        {
        int[] distance=new int[size+1];
        boolean[] check=new boolean[size+1];
        PriorityQueue<Node> queue=new PriorityQueue<Node>(1,new Comparator<Node>(){
           public int compare(Node a,Node b)
               {
               return a.getWeight().compareTo(b.getWeight());
           }
            
        });
        
        for(int i=1;i<=size;i++)
            distance[i]=Integer.MAX_VALUE;
        distance[start]=0;
        queue.add(new Node(start,0));
        while(!queue.isEmpty())
            {
            Node x=queue.poll();
            check[x.getVerticeNo()]=true;
            Iterator<Node> iterator=adjList.get(x.getVerticeNo()).iterator();
            while(iterator.hasNext())
                {
                Node node=iterator.next();
                    if(check[node.getVerticeNo()]==false && distance[node.getVerticeNo()]>distance[x.getVerticeNo()]+node.getWeight())
                    {
                    queue.remove(new Node(node.getVerticeNo(),distance[node.getVerticeNo()]));
                    distance[node.getVerticeNo()]=distance[x.getVerticeNo()]+node.getWeight();
                    queue.add(new Node(node.getVerticeNo(),distance[node.getVerticeNo()]));
                }
            }
        }
        for(int i=1;i<=size;i++)
            {
            if(i!=start)
                {
                if(distance[i]!=Integer.MAX_VALUE)
                System.out.print(distance[i]+" ");
                else
                System.out.print(-1+" ");
            }
        }
        System.out.println();
    }
}
public class Dijkstra{

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
                g.addEdge(x,y,r);
            }
            int s = Integer.parseInt(br.readLine());
            g.Dijkstra(s);
        }
    }
}

