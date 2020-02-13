package DaysofCode30;
import java.util.*;
public class Day29BitwiseAND {




    private static final Scanner scanner = new Scanner(System.in);

    private static void bitwiseAND(int n, int k) {
    	int max = 0;
    	for(int B=1; B<=n; B++) {
    		for(int A=1; A<B; A++) {
    			/*System.out.println("A = "+A+" B = "+B+
    					"  "+Integer.toBinaryString(A)+" | "+Integer.toBinaryString(B)+
    					"  "+Integer.toBinaryString((A&B))+ " "+(A&B));
    			*/
    			if(((A & B) > max) && ((A & B) < k))
    				max = A & B;
    		}
    	}
    	System.out.println(max);
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            bitwiseAND(n, k);
        }

        scanner.close();
    }
}

