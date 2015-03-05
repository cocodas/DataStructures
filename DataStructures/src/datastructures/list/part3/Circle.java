package datastructures.list.part3;

/**
 * Ư�� ��Ұ� ����Ʈ�� �����ϴ��� �˻��ϱ� ���� equal�޼ҵ带 ����Ѵ�.
 * ����Ʈ������ �� �̿ܿ� ���ĵ� �����ϱ� ������ ��� �񱳵� �ؾ��Ѵ�.
 * �ڹ� ���̺귯�������� �̸� ���� Comparable �������̽��� �����Ѵ�.
 * �� �޼ҵ�� ��ü�� ������ ��ü���� ������ -1, ������ 0, ũ�� 1�� ��ȯ�Ѵ�.
 * 
 * ��� �񱳸� �� �� �ִ� Main �޼ҵ带 ����� Test ����� ����϶�.
 * @author Administrator
 *
 */
public class Circle implements Comparable<Circle> {

	private float radius;
	private static final float PI = 3.14F;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	public boolean equals(Circle circle) {
		return (this.radius == circle.radius) ? true : false;
	}
	
	@Override
	public int compareTo(Circle circle) {
		if (this.radius < circle.radius) {
			return -1;
		} else if (this.radius == circle.radius) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public float perimeter() {
		return 2 * PI * radius;
	}
	
	public float area() {
		return PI * radius * radius;
	}

}
