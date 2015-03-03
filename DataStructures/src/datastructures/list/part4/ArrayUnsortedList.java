package datastructures.list.part4;

public class ArrayUnsortedList<T> implements ListInterface<T>{
	private final int DEFAULT_CAPACITY = 100;
	private int originalCapacity;
	private T[] list;
	private int numberOfElements = 0;
	private int currentPosition;
	
	// 찾기 메소드에 의해 설정
	private boolean found;
	private int location;
	
	@SuppressWarnings("unchecked")
	public ArrayUnsortedList() {
		list = (T[]) new Object[DEFAULT_CAPACITY];
		originalCapacity = DEFAULT_CAPACITY;
	}
	
	

	@SuppressWarnings("unchecked")
	public ArrayUnsortedList(int originalCapacity) {
		list  = (T[]) new Object[originalCapacity];
		this.originalCapacity = originalCapacity;
	}


	@SuppressWarnings("unchecked")
	private void enLarge() {
		T[] larger = (T[]) new Object[list.length + originalCapacity];
		for (int i = 0; i < numberOfElements; i++) {
			larger[i] = list[i];
		}
		list = larger;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		return null;
	}
}
