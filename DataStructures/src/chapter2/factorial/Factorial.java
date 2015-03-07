package chapter2.factorial;

public class Factorial {
	
	public int Fact(int n) {
		if (n == 1) {
			return 1;
		}else if (n == 0) {
			return 1;
		}else {
			return n*Fact(n-1);
		}
	}
	
	public int print(int n) {
		if (n == 0) {
			return 0;
		}else {
			System.out.print("[ " + n + " ], " );
			return print(n-1);
		}
	}
}
