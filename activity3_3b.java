package javaActivity3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class activity3_3b {

	public static void main(String[] args) {
		
		Deque<String> dq = new LinkedList<String>();
		dq.add("rat");
		dq.add("dog");
		dq.add("cat");
		dq.add("horse");
		dq.add("ox");
		dq.add("goat");
		
        Iterator<String> iterator = dq.iterator();
    	
        while (iterator.hasNext()) {
	
            System.out.println(iterator.next());
	
        }
        
        String first = dq.peekFirst();
		
        String last = dq.peekLast();
		
        System.out.println("Peeking first element :" + first );
        System.out.println("Peeking last element :" + last );
        
        
        System.out.println("Is wolf in the list :" + dq.contains("wolf"));
        
        dq.removeFirst();
        dq.removeLast();
        
        System.out.println("Size of list is :" + dq.size());
        
        System.out.println("Peeking first element :" + dq.peekFirst() );
        
        
        
	}

}
