package DaysofCode30;
import java.util.*;
public class Day26NestedLogic {
	private static int calculateFine(int dA, int mA, int yA, int dE, int mE, int yE){
		if(yA > yE)
			return 10000;
		else if(yA == yE){
			if(mA > mE)
				return 500 * (mA - mE);
			else if(mA == mE){
				if(dA > dE)
					return 15 * (dA - dE);
				else 
					return 0;
			}else
				return 0;
		}else 
			return 0;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dA = in.nextInt();
		int mA = in.nextInt();
		int yA = in.nextInt();
		int dE = in.nextInt();
		int mE = in.nextInt();
		int yE = in.nextInt();
		System.out.println(calculateFine(dA, mA, yA, dE, mE, yE));
	}

}
