import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaRemoveIfMain {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1, -2, 3, 4, 5);
		ls = new ArrayList<>(ls);

		Predicate<Number> p = n -> n.doubleValue() < 0.0;

		Predicate<Integer> p1 = i -> {
			return i > 0;
		};

		ls.removeIf(p1);
		System.out.println(ls);

		ls.removeIf(p);
		System.out.println(ls);

//		=======================================================
		List<Student> sArr = new ArrayList<Student>();
		sArr.add(new Student(90, 80, 70, "홍길동"));
		sArr.add(new Student(80, 60, 70, "홍길순"));
		sArr.add(new Student(70, 60, 70, "홍말자"));
		sArr.add(new Student(50, 50, 50, "바둑이"));

		Predicate<Student> g1 = s -> (s.kor + s.eng + s.math) / 3.0 < 60;
		Predicate<Student> g2 = s -> s.eng < 70;

		for (Student student : sArr) {
			System.out.print(student.name + ", ");
		}

		System.out.println();
		
		sArr.removeIf(g1);
		for (Student student : sArr) {
			System.out.print(student.name + ", ");
		}
		
		System.out.println();
		
		sArr.removeIf(g2);
		for (Student student : sArr) {
			System.out.print(student.name + ", ");
		}
		
		System.out.println();
		
	}

}
