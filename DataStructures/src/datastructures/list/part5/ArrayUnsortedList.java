package datastructures.list.part5;

import datastructures.list.part4.ListInterface;

public class ArrayUnsortedList<T> implements ListInterface<T>{
	private final int DEFAULT_CAPACITY = 100;
	private int originalCapacity;
	private T[] list;
	private int numberOfElements = 0;
	private int currentPosition;
	
	// found �޼ҵ忡 ���� ����
	private boolean found;
	private int location;
	
}
