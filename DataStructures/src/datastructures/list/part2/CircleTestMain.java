package datastructures.list.part2;

public class CircleTestMain {

	public static void main(String[] args) {
		Circle circle1 = new Circle(150);
		Circle circle2 = new Circle(120);
		
		if (circle1.equals(circle2)) {
			System.out.println("circle1 - " + circle1);
			System.out.println("circle2 - " + circle2);
			System.out.println("같은 원입니다.");
		} else {
			System.out.println("circle1 - " + circle1);
			System.out.println("circle2 - " + circle2);
			System.out.println("다른 원입니다.");
		}
	}

}
