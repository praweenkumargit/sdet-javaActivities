package javaActivity3;

import java.util.ArrayList;
import java.util.List;

public class activity3_1 {
	public static void main(String[] args) {

	ArrayList <String> myList = new ArrayList<String>();
	
	myList.add("pra1"); 
	myList.add("pra2");
	myList.add("pra3");
	myList.add("pra4");
	myList.add("pra5");
	

	for (int i =0; i < 5; i++) {
		
	String	value = myList.get(i) ;
	System.out.println((value));
	
	}
	
	System.out.println(myList.get(2));
	
	System.out.println(myList.contains("pra6"));

myList.remove("pra5");

System.out.println(myList.size());
}
	
}
