interface Add {
	int add(int num1, int num2);
}

interface Sub {
	int sub(int num1, int num2);
}

interface Mul {
	int mul(int num1, int num2);
}

interface Div {
	int div(int num1, int num2);
}

public class LamdaMain2 {

	public static void main(String[] args) {
		Add add = (num1, num2) -> num1 + num2;
		Sub sub = (a, b) -> a - b;
		Mul mul = (x, y) -> x * y;
		Div div = (num1, num2) -> num1 / num2;

		System.out.println(add.add(2, 2));
		System.out.println(sub.sub(2, 2));
		System.out.println(mul.mul(2, 2));
		System.out.println(div.div(2, 2));
	}

}
