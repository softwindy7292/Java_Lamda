interface Calculator {
	int cal(int num1, int num2);
}

interface Calculator2<T> {
	T cal(T num1, T num2);
}


public class LamdaMain3 {

	public static void main(String[] args) {
		Calculator add = (x, y) -> x + y;
		Calculator sub = (x, y) -> x - y;
		Calculator mul = (x, y) -> x * y;
		Calculator div = (x, y) -> x / y;

		System.out.println(add.cal(2, 2));
		System.out.println(sub.cal(2, 2));
		System.out.println(mul.cal(2, 2));
		System.out.println(div.cal(2, 2));
		
		Calculator2<Integer> add2 = (x, y) -> x + y;
		Calculator2<Character> compare = (x, y) -> {
			char high;
			
			high = (x > y) ? x : y;
			
			return high;
		};
		
		System.out.println(add2.cal(3, 3));
		System.out.println(compare.cal('A', 'B'));
	}

}
