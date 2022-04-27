package com.comcast.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class BasicListDemo {
	public static void main(String[] args) {		
		//ArrayList myList = new ArrayList();
		//LinkedList myList = new LinkedList();
		//Vector myList = new Vector();
		List<String> myList = new ArrayList<String>();
		myList.add("gt");
		myList.add("srh");
		myList.add("rr");
		myList.add("lsg");
		//myList.add(1250);
		System.out.println("-----------direct display---------------");
		System.out.println(myList);
		System.out.println("-----------using index iteration---------------");
		for(int i=0;i<myList.size();i++) {		// index based iteration
			System.out.println(myList.get(i));
		}
		System.out.println("-----------using forEach iteration---------------");
		for(String team: myList) {
			System.out.println(team);
		}
		System.out.println("-----------using Iterator interface---------------");
		Iterator<String> it = myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
