package datastructures.list.part2;

public class CircleTestMain {

	public static void main(String[] args) {
		Circle circle1 = new Circle(150);
		Circle circle2 = new Circle(120);
		
		if (circle1.equals(circle2)) {
			System.out.println("circle1 - " + circle1);
			System.out.println("circle2 - " + circle2);
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("circle1 - " + circle1);
			System.out.println("circle2 - " + circle2);
			System.out.println("�ٸ� ���Դϴ�.");
		}
	}

}
