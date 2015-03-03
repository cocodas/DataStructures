package datastructures.list.part4;

public interface ListInterface<T> {
	public int size();
	
	public boolean contains(T element);
	
	public boolean remove(T element);
	
	public T get(T element);
	
	public String toString();
	
	public void reset();
	
	public T getNext();
}
