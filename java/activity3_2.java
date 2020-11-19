package javaActivity3;

import java.util.HashSet;
import java.util.Set;

public class activity3_2 {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		hs.add("xyz1");
		hs.add("xyz2");
		hs.add("xyz3");
		hs.add("xyz4");
		hs.add("xyz5");
		hs.add("xyz6");
		
		System.out.println("The number of elements in hashSet " + hs.size());
		
		hs.remove("xyz6");
		
		System.out.println(hs.remove("xyz7"));
		
		System.out.println(hs.contains("xyz4"));
		
		System.out.println("Elements in hashset now are :" + hs.toString() );
;
	}

}
