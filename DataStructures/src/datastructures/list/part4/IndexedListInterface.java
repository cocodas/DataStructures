package datastructures.list.part4;

public interface IndexedListInterface<T> extends ListInterface<T> {
	public void add(int index, T element);
	
	public T set(int index, T element);
	
	public T get(int index);
	
	public int indexOf(T element);
	
	public T remove(int index);
}
