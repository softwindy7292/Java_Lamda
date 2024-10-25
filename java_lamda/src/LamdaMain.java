
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
		Printable prn = new Printer();
		
		prn.print("냠냠");
		
		Printable prn2 = (s) -> System.out.println(s);
		
		prn2.print("람다란 이런 것 이다");
	}

}
