package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Collection {

	public static void main(String args[]) {
		/*
		 * Example of Array List
		 */
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Ramesh");
		l1.add("Rohan");
		l1.add("Shikher");
		l1.add("Vineet");

		l1.add(1, "Zawed");

		ArrayList<String> li = new ArrayList<>();
		li.add("Abc");
		li.add("pqrst");
		li.add("xyzw");
		l1.addAll(li);// add all function

		l1.remove("Kunal");
		l1.removeAll(li);
		// l1.clear();
		l1.set(2, "lmnop");
		if (!l1.isEmpty()) {
			/*
	        interface iterator
	        {
	          public boolean hasNesxt();
	          public object next();
	          public void remove();
	        }
	      */ 
			//This is iterator interface
			Iterator it = l1.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} else {
			System.out.println("Empty");
		}

		/*
		 * Example of Linked List
		 */
		LinkedList<Integer> lt = new LinkedList<>();
		lt.addFirst(10);
		lt.addLast(20);
		lt.add(100);
		lt.add(1, 500);

		System.out.println(lt.getFirst());
		System.out.println(lt.getLast());

		lt.removeFirst();
		lt.removeLast();
		// lt.LinkedList(l1);
		for (int l = 0; l < lt.size(); l++) {
			System.out.println(lt.get(l));
		}

		/*
		 * Example of HashSet Store Unique value
		 */
		HashSet<String> h = new HashSet<String>();

		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India");

		System.out.println(h);

		/*
		 * Example of HashMap
		 */
		HashMap<String, Integer> map = new HashMap<>();
		map.put("vineet", 100);
		map.put("sachin", 200);
		map.put("Rohan", 300);

		for (Entry<String, Integer> mp : map.entrySet())
			System.out.println("Key = " + mp.getKey() + ", Value = " + mp.getValue());

		/*
		 * Example of TreeSet
		 */
		Set<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(3);
		set.add(1);

		// Duplicates will not get insert
		set.add(3);

		// Sorting Ascending Order
		System.out.println(set);
	}
}
