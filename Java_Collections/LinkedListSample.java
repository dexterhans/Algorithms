import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListSample{
public static void main(String[] args)
{
	List<Integer> list=new ArrayList<Integer>();
	list.add(34);
	list.add(31);
	
	LinkedList<Integer> list2=new LinkedList<Integer>(list);
	list2.add(0,19);
	list2.addFirst(91);
	
	LinkedList<Integer> list3=new LinkedList<Integer>(list2);
	System.out.println(list3);
	list2.removeFirst();
	list2.poll();
	System.out.println(list2);
	System.out.println(list2.peek());
	System.out.println(list3);
	list3.removeLast();
	list3.add(39);
	list3.addAll(list);
	System.out.println(list3);
	list3.removeFirstOccurrence(34);
	System.out.println(list3);
	Integer[] arr=list3.toArray(new Integer[list3.size()]);
	for(Integer a:arr)
	{
		System.out.print(a+" ");
	}
	
}
}

