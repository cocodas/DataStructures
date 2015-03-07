package chapter2.factorial;

public class FactorialMain {

	public static void main(String[] args) {

		Factorial factorial = new Factorial();
		
		System.out.println("팩토리얼 값 : " + factorial.Fact(4));
		
		System.out.print("팩토리얼 요소 : " );
	
		System.out.print(factorial.print(4));
		
	}

}
