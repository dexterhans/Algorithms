import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriQueueSample {
public static void main(String[] args)
{
	PriorityQueue<String> list=new PriorityQueue<String>(1,new Comparator<String>()
			{
		public int compare(String a,String b)
		{
			return a.compareTo(b);
		}
			});
	System.out.println(list.comparator());
	System.out.println(list.poll());// returns special value if fails unlike remove which throws exception.
	System.out.println(list.peek());//returns special value if fails unlike element which throws exception.
	list.add("look"); //Inserts the specified element into this queue if it is possible to do so immediately without violating capacity
			 // restrictions
			 //returning true upon success and throwing an IllegalStateException if no space is currently available.
	list.add("mean");
	list.add("gengar");// add throws an exception when there isn't enough space to insert unlike offer which return null as a special value
	list.add("pik");
	System.out.println(list);// no particular order followed during insertion.
	while(list.peek()!=null)
	{
		System.out.println(list.poll()); //sorted, when a priority queue gets sorted it's not visible when printed it's internally sor							//ted though
	}
}
}

