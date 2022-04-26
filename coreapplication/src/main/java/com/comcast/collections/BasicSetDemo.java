package com.comcast.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BasicSetDemo {
	public static void main(String[] args) {
		Set mySet = new HashSet();
		mySet.add("mi");
		mySet.add("csk");
		mySet.add("kkr");
		mySet.add("dc");
		mySet.add("csk");
		System.out.println("------------direct object display--------------");
		System.out.println(mySet);
		
		System.out.println("------------foreach iteration--------------");
		for(Object team: mySet) {
			System.out.println(team.toString());
		}
		System.out.println("------------Iterator display------------------");
		Iterator it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set mySortSet = new TreeSet();		// default treeset ascending order
		mySortSet.addAll(mySet);
		mySortSet.add("lsg");
		mySortSet.add("rcb");
		System.out.println("-------------display sorted set----------------");
		System.out.println(mySortSet);
		
		Set myDescSet = new TreeSet().descendingSet();
		myDescSet.addAll(mySet);
		myDescSet.add("lsg");
		myDescSet.add("rcb");
		myDescSet.add("srh");
		System.out.println("-------------display descending sorted set----------------");
		System.out.println(myDescSet);
	}

}
