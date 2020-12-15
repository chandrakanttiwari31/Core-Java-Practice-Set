package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	
	public static void main(String[] args) {
		
		// not synchronized  and null not allow in the  Prioroty queue
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(40);  // duplicate allow
		q.add(50);
		System.out.println(q);
		
		
		System.out.println(q.offer(60)); // add element at last
		System.out.println(q);
		q.add(90);      // add element at last
		System.out.println(q);
		
		
		
		Integer i=q.element();   // give the first element
		System.out.println(i);
		
		
		
		System.out.println("Prioroty Queue =");
		System.out.println(q.peek());  // give the First element
		System.out.println(q);
		
		
		
		
		
		Integer ii= q.remove();
		System.out.println("remove element"+ii);  //remove First Element
	    System.out.println(q);
	    
	    
	    
	    System.out.println("After poll="+q.poll());  // remove the first element
	    System.out.println(q);
	    
	    
	    
	    // display queue
	    
	    for(Integer qu:q)
	    {
	    	System.out.println(qu);
	    	
	    }
	    
	    System.out.println();
		
	    System.out.println("********************************************");
	    
	    
	    Iterator<Integer> it=q.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    	
	    }
	    
	    System.out.println("***********************************************");
	    System.out.println(q);
	}
}
