package datastructures.list.part3;

/**
 * 특정 요소가 리스트에 존재하는지 검사하기 위해 equal메소드를 사용한다.
 * 리스트에서는 비교 이외에 정렬도 지원하기 때문에 대소 비교도 해야한다.
 * 자바 라이브러리에서는 이를 위해 Comparable 인터페이스를 제공한다.
 * 이 메소드는 객체가 지정한 객체보다 작으면 -1, 같으면 0, 크면 1을 반환한다.
 * 
 * 대소 비교를 할 수 있는 Main 메소드를 만들어 Test 결과를 출력하라.
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
