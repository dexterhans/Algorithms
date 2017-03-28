import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ArrayListSample{
public static void main(String[] args)
{
        List<Integer> list=new ArrayList<Integer>(); // list is the interface which extends collection and arraylist is a class which 
                                                                                             //implements list interface and there are two constructors void and single argument one

        list.add(30);// just add the number into list at last position.
        list.add(0,12);// adds number into the list at the index mentioned
        list.add(1,3);

        for(int i=0;i<list.size();i++)
                System.out.print(list.get(i)+" "); //gets the element of the list at the specified index.

        System.out.println();

        list.subList(0,2).clear();//clear the sublist in between that index.

        for(int i=0;i<list.size();i++)// .size() gets the size of the list.
                System.out.print(list.get(i)+" ");
        System.out.println();
        List<Integer> list2=new ArrayList<Integer>(list);// instantiates a arraylist with the elements in the colledction list.
        list2.add(12);
        list2.add(23);
        list2.addAll(2,list);

        ListIterator<Integer> listIterator=list2.listIterator();
        while(listIterator.hasNext())
        {
                System.out.printf("%d ",listIterator.next()); // gives the next element and increments the pointer
                if(listIterator.nextIndex()==2)
                        listIterator.add(2);        // adds a element mentioned before the element that would be returned by next().
        }
        System.out.println();

        ListIterator<Integer> listIterator1=list2.listIterator();
        while(listIterator1.hasNext())
        {
                System.out.printf("%d ",listIterator1.next());

        }
        System.out.println();
        Integer[] arr=new Integer[list2.size()];
        arr=list2.toArray(new Integer[0]);
        for(int i=0;i<arr.length;i++)
        {
                System.out.print(" "+arr[i]);
        }

        //few others to add are contains, containsAll, remove, removeAll, retailAll
}
}
