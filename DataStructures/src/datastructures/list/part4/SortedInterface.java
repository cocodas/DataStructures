package datastructures.list.part4;

public interface SortedInterface<T> extends ListInterface<T> {
	/**
	 * ����Ʈ�� element�� �߰��Ѵ�.
	 * ����Ʈ�� ���ĵǾ� ����.
	 * @param element
	 */
	public void add(Comparable<T> element);
}
