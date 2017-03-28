import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;



class hashSetSample{
	public static void main(String[] args)
	{
		HashSet<Integer> hashSet=new HashSet<Integer>();
		System.out.println(hashSet.add(3));
		System.out.println(hashSet.add(3));
		System.out.println(hashSet.add(23));
		System.out.println(hashSet.add(31));
		List<Integer> list=new  ArrayList<Integer>();
		list.add(113);
		list.add(5);
		System.out.println(hashSet.addAll(list));
		System.out.println(hashSet.retainAll(list));
		System.out.println(hashSet);
		Integer[] arr=hashSet.toArray(new Integer[hashSet.size()]);
		System.out.println(arr.length);
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.hashCode());
		HashSet<Integer> hashSet1=new HashSet<Integer>();
		hashSet1.add(113);
		hashSet1.add(5);
		System.out.println(hashSet.hashCode());
		HashSet<HashSet<Integer>> hashSet2=new HashSet<HashSet<Integer>>();
		hashSet2.add(hashSet1);
		hashSet2.add(hashSet);
		System.out.println(hashSet2.size());
	}
}

