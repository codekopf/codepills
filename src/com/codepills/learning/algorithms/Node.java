package com.codepills.learning.algorithms;

public class Node {
	private int number;
	
	public Node(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return number + ", ";
	}
	
}
