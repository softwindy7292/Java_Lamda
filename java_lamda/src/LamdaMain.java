
interface Printable{
	void print(String s);
}

class Printer implements Printable{
	public void print(String s) {
		System.out.println(s);
	}
}

public class LamdaMain {

	public static void main(String[] args) {
		System.out.println("hello");

	}

}
