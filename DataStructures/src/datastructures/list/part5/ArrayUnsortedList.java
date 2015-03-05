package datastructures.list.part5;

import datastructures.list.part4.ListInterface;

public class ArrayUnsortedList<T> implements ListInterface<T>{
	private final int DEFAULT_CAPACITY = 100;
	private int originalCapacity;
	private T[] list;
	private int numberOfElements = 0;
	private int currentPosition;
	
	// found 메소드에 의해 설정
	private boolean found;
	private int location;
	
}
