package DaysofCode30;
import java.util.*;
import java.io.*;
import java.math.*;

class Calculator{
	int power(int n, int p) throws Exception {
		//return (int)(Math.pow(n, p));
		if(n<0 || p<0)
			throw new Exception("n and p should be non-negative");
		return (int)(Math.pow(n, p));
	}
}

public class Day17MoreExceptions {


    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
