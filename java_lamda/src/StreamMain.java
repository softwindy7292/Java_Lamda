import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };

//		IntStream stm1 = Arrays.stream(ar);
//
//		IntStream stm2 = stm1.filter(n -> n % 2 == 1);
//		int sum = stm2.sum();

		int sum = Arrays.stream(ar).filter(n -> n % 2 == 1).sum();

		System.out.println(sum);

		String[] names = { "봄", "여름", "가을", "겨울" };

		Arrays.stream(names).forEach(s -> System.out.println(s));

		double[] ds = { 1.1, 2.2, 3.3, 4.4 };
		Arrays.stream(ds).forEach(d -> System.out.println(d));

		List<String> names2 = Arrays.asList("Sehoon", "Songwoo", "Chan", "Youngsuk", "Dajung");

		names2.stream().filter(n -> n.startsWith("S")).forEach(name -> System.out.println(name));
		;

		List<String> startsWithS = names2.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
		System.out.println(startsWithS);

		System.out.println(names2.stream().filter(n -> n.startsWith("S")).collect(Collectors.joining(", ")));

		names2.stream().map((name) -> name.toUpperCase()).forEach(name -> System.out.println(name));
		names2.stream().map((name) -> name.length()).forEach(name -> System.out.println(name));

		// 중간연산

		// -필터링(distinct(), filter())
		// -매핑(map(), flatMap())
		// -정렬(sorted())
		// -연산 결과 확인(peek())

		// 최종연산
		// -연산 결과 확인(forEach())
		// - 매칭(match())
		// -기본 집계(sum(), count(), average(), max(), min())
		// -결과를 다른 종류로 반환(collect())

	}
}
