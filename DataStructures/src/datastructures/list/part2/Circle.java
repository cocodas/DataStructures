package datastructures.list.part2;

/**
 * equals() �޼ҵ尡 Object���� Ȯ��Ǿ���.
 * Ȯ����� �츮���� � Ŭ�������� ����Կ� �����ϵ��� �� ���Ǹ� �� �� �ִ�.
 * ��� int scale�� �־� equals�޼ҵ忡�� �� �� �� �ֵ��� �ۼ��϶�.
 * @author Administrator
 *
 */
public class Circle {
	private int radius;
	public Circle() {
		this.radius = 0;
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	/**
	 * circle�� ���� radius�� ������ true�� ��ȯ�ϰ�
	 * �׷��� ������ false�� ��ȯ�Ѵ�.
	 */
	
	public boolean equals(Circle circle) {
		return (this.radius == circle.radius) ? true : false;
	}
	
	@Override
	public String toString() {
		return "radius: " + getRadius();
	}
}
