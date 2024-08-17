package collectionInterface;

import java.util.PriorityQueue;

public class PriorityQueueInterface {
public static void main(String[] args) {
	PriorityQueue pqObject=new PriorityQueue();
	pqObject.offer(10);
	pqObject.offer(45);
	pqObject.offer(12);
	pqObject.add(23);
	pqObject.add(64);
	pqObject.offer(18);
	pqObject.offer(10);
	//pqObject.remove();//best element will be removed
	//pqObject.poll();//best in first out 
	pqObject.remove(18);
	pqObject.remove(10);
	pqObject.peek();
	System.out.println(pqObject.peek());//best element in the collection
	System.out.println(pqObject);
	System.out.println(pqObject.isEmpty());//is their any empty collection
	System.out.println(pqObject.size());//Size of the collection
}
}
