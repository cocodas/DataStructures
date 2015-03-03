package datastructures.list.part2;

/**
 * equals() 메소드가 Object에서 확장되었다.
 * 확장됨은 우리에게 어떤 클래스에서 사용함에 적합하도록 재 정의를 할 수 있다.
 * 멤버 int scale을 넣어 equals메소드에서 비교 할 수 있도록 작성하라.
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
	 * circle이 같은 radius를 가지면 true를 반환하고
	 * 그렇지 않으면 false를 반환한다.
	 */
	
	public boolean equals(Circle circle) {
		return (this.radius == circle.radius) ? true : false;
	}
	
	@Override
	public String toString() {
		return "radius: " + getRadius();
	}
}
