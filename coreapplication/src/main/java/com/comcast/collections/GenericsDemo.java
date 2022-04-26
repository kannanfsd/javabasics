package com.comcast.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	
	public static void printList() {
		List myList = new ArrayList();
		myList.add("India");
		myList.add("Australia");
		String[] myCountryList = new String[myList.size()];
		for(int i=0;i<myList.size();i++) {
			myCountryList[i] = (String)myList.get(i);
		}
		for(String country: myCountryList) {
			System.out.println(country);
		}
	}
	
	public static void printGenericList() {
		List<String> myList = new ArrayList<String>();
		myList.add("India");
		myList.add("Australia");
		String[] myCountryList = new String[myList.size()];
		for(int i=0;i<myList.size();i++) {
			myCountryList[i] = myList.get(i);
		}
		for(String country: myCountryList) {
			System.out.println(country);
		}
	}
	
	public static void main(String[] args) {
		printGenericList();
	}

}
