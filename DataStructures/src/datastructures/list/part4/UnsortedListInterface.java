package datastructures.list.part4;
/**
 * ListInterface는 element를 추가하는 method가 없다.
 * 그 이유를 기술하라.
 * 
 * @author rolendSunq
 *
 */
public interface UnsortedListInterface<T> extends ListInterface<T> {
	/**
	 * 리스트에 element를 추가한다.
	 * @param element
	 */
	public void add(T element);
}
