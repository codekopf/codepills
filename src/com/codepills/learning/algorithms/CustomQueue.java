package com.codepills.learning.algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CustomQueue implements Collection {
	
	private List c = new ArrayList();
	
	public CustomQueue() {
		this.c = c;
	}

	@Override
	public int size() {
		return c.size();
	}

	@Override
	public boolean isEmpty() {
		return c.isEmpty() ? true : false;
	}

	@Override
	public boolean contains(Object o) {
		return c.contains(o) ? true : false;
	}

	@Override
	public Iterator iterator() {
		return c.iterator();
	}

	@Override
	public Object[] toArray() {
		return c.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		return c.toArray(a);
	}

	@Override
	public boolean add(Object e) {
		// c.add(e);
		//c.add(e);
		//c.addAll(e)
		return c.add(e) ? true : false; //c.add(e) ? true : false;
	}

	@Override
	public boolean remove(Object o) {
		return  false;
	}

	@Override
	public boolean containsAll(Collection c) {
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		return false;
	}

	@Override
	public void clear() {
	
	}


	public void dequeue() {
		Node temp = (Node) c.get(c.size() -1);
		System.out.println(temp.toString());
		c.remove(c.size() -1);
	}
	
	public void queue() {
		Node temp = (Node) c.get(0);
		System.out.println(temp.toString());
		c.remove(0);
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Object obj : c) {
			str.append(obj.toString());
		}
		return str.toString();
	}

	public static void main(String[] args) {
		CustomQueue FIFO = new CustomQueue();
		CustomQueue LIFO = new CustomQueue();
		
		for (int i = 0; i < 10; i++) {
			int newInt = new Random().nextInt();
			FIFO.add(new Node(newInt));
			LIFO.add(new Node(newInt));
		}
		
		System.out.println("FIFO: " + FIFO.toString());
		System.out.println("LIFO: " + LIFO.toString());
		
		// Incoming Red, Green, Yellow
		// FIFO - Outcome: Yellow, Green, Red - dequeu
		// LIFI - Outcome: Red, Green, Yellow - queue
		
		System.out.println("-----------------");
		System.out.println("FIFO: ");
		
		while (!FIFO.isEmpty()) {
			FIFO.dequeue();
		}
		
		System.out.println("-----------------");
		System.out.println("LIFO: ");
		
		while (!LIFO.isEmpty()) {
			LIFO.queue();
		}
	}
}
