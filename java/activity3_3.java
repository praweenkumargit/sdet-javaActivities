package javaActivity3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import javax.management.Query;

public class activity3_3 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.add("1");
		q.add("2");
		q.add("3");
		q.add("4");
		q.add("5");
		
		System.out.println("Elements in queue are :" + q.toString());
		
		q.remove("1");
		
		System.out.println("Peek value " + q.peek());
		
		System.out.println("Size of queue after removal " + q.size());
		
		System.out.println("Elements in queue after removal of fist object are " + q.toString());
		
		

		
		
	}

}
