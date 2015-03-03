package datastructures.list.part4;

public interface SortedInterface<T> extends ListInterface<T> {
	/**
	 * 리스트에 element를 추가한다.
	 * 리스트는 정렬되어 진다.
	 * @param element
	 */
	public void add(Comparable<T> element);
}
