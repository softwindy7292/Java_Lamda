import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaMain5 {

	public static boolean isEven(int num, Predicate<Integer> predicate) {
		return predicate.test(num);
	}

	public static int sum(Predicate<Integer> p, List<Integer> list) {
		int s = 0;

		for (int n : list) {
			if (p.test(n))
				s += n;
		}
		return s;
	}

	public static void main(String[] args) {

		Predicate<String> predicate = (s) -> {
			boolean tfString = false;

			tfString = s.equals("냠");

			return tfString;
		};

		if (predicate.test("냠"))
			System.out.println("냠을 입력했군요");
		else
			System.out.println("냠이 아니에요");

//		===================================================================
		Predicate<Integer> predicate2 = (i) -> {
			boolean tfInteger = false;

			tfInteger = i % 2 == 0;

			return tfInteger;
		};

		if (predicate2.test(10))
			System.out.println("짝수");
		else
			System.out.println("홀수");

//		===================================================================
		int[] arrNums = { 1, 2, 3, 4 };

		for (int num : arrNums) {
			System.out.println("숫자: " + num + " = " + predicate2.test(num));
		}

//		===================================================================
		System.out.println("isEven함수를 사용하기 -> " + isEven(10, predicate2));

		List<Integer> list = Arrays.asList(1, 5, 7, 9, 11);

		int s;
		s = sum(n -> n % 2 == 0, list);
		System.out.println("짝수 합 " + s);

		s = sum(n -> n % 2 != 0, list);
		System.out.println("홀수 합 " + s);

	}

}
