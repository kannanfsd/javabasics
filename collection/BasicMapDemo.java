package com.comcast.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BasicMapDemo {
	public static void main(String[] args) {		
		Map<String, String> country = new HashMap<String, String>();
		country.put("IND", "India");
		country.put("SA", "South Africa");
		country.put("SL", "SriLanka");		
		System.out.println(country);
		// Collection vs Map
		Set<String> keys = country.keySet();
		System.out.println(keys);
		
		for(String key: keys) {
			System.out.println(country.get(key));
		}
		
		System.out.println(country.containsKey("SL"));
		System.out.println(country.containsKey("PAK"));
		
		System.out.println(country.containsValue("India"));
		System.out.println(country.containsValue("Pakistan"));
		
		
		for(Map.Entry<String, String> myEntry: country.entrySet()) {
			System.out.println(myEntry.getKey()+"---->"+myEntry.getValue());
		}
		
		Map<String, String> sortCountry = new TreeMap<String, String>().descendingMap();
		sortCountry.putAll(country);
		sortCountry.put("AUS", "Australia");
		sortCountry.put("USA","United States");
		System.out.println(sortCountry);
	}
}
