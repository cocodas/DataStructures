package datastructures.list.part1;

/**
 * 객체의 비교는 어떻게 할까?
 * 간단하게 연산자 중 비교 연산자가 있다.
 * 바로 '==' 연산자이다.
 * 이 연산자로 객체 비교을 할 수 있을까?
 * 
 * 없다. 그러면 어떤 방법으로 비교가 가능할까?
 * String 비교에서 사용했던 메소드 equals() 메소드가 있다.
 * 
 * 그런데 자료구조의 List의 지식을 알아야 되는데 왜 객체 비교를 할까?
 * List에 객체가 적든 많든 객체들이 있고 List에서 원하는 객체를 가져와 사용하기 위해
 * 원하는 객체를 찾기위해 비교를 통해 찾을 수 있다. 물론 다른 방법도 존재하기도 한다.
 * 우리가 시작하는 단계에서는 비교를 통해 객체를 얻는 과정부터 시작하는 것이 맞다.
 * 
 * equals()메소드는 Object클래스로부터 확장되었다.
 * 이 equals()메소드의 특징을 기술하라.
 * 
 * 
 * @author Administrator
 *
 */
public class UsingEquals {

	public static void main(String[] args) {
		// 초 간단한 객체 비교
		C1 c1 = new C1("Data Structure");
		C1 c2 = new C1("List");
		if (c1.equals(c2)) {
			System.out.println("두 객체는 같습니다.");
		} else {
			System.out.println("두 객체는 같지 않습니다.");
		}
		
		/*
		 * 결과를 보면 예상 외 결과를 나타낸다.
		 * 그러면 생성자의 문자를 같게 해보면 어떨까?
		 */
		
		C1 c3 = new C1("Data Structure");
		C1 c4 = new C1("Data Structure");
		
		if (c3.equals(c4)) {
			System.out.println("c3와 c4는 같은 객체입니다.");
		} else {
			System.out.println("c3와 c4는 다른 객체입니다.");
		}
		
		/*
		 * c3와 c5가 같은 객체라고 할려면 어떻게 해야하는가?
		 */
		
		C1 c5 = c3;
		if (c3.equals(c5)) {
			System.out.println("c3와 c5는 같은 객체입니다.");
		} else {
			System.out.println("c3와 c5는 다른 객체입니다.");
		}
		
		/*
		 * 왜 그럴까?
		 * 왜 이런 결과가 나오는지 기술하라.
		 */
		
	}

}
