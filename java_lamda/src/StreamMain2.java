import java.util.ArrayList;
import java.util.List;

public class StreamMain2 {

	public static void main(String[] args) {

		List<Student> sArr = new ArrayList<Student>();
		sArr.add(new Student(90, 80, 70, "홍길동"));
		sArr.add(new Student(80, 60, 70, "홍길순"));
		sArr.add(new Student(70, 60, 70, "홍말자"));
		sArr.add(new Student(50, 50, 50, "바둑이"));
		
		sArr.stream()
			.filter(student -> student.name.startsWith("홍"))
			.mapToDouble(student -> (student.kor + student.eng + student.math) / 3.0)
			.forEach(avg -> System.out.println(avg));

	}
}
