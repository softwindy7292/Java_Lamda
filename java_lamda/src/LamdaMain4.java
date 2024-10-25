import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface
interface Generator {
	Set<Integer> randLotto();
}

public class LamdaMain4 {

	public static void main(String[] args) {
		Generator lotto = () -> {
			
			Set<Integer> lottoNum = new TreeSet<>();
			
			while(lottoNum.size() < 6)
				lottoNum.add((int)(Math.random() * 45) + 1);
			
			return lottoNum; 
		};
		
		System.out.println(lotto.randLotto());
	}

}
