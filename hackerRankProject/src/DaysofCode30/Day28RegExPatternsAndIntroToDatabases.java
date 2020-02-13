package DaysofCode30;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Day28RegExPatternsAndIntroToDatabases {

	private static final Scanner scanner = new Scanner(System.in);
	private static String myRegExString = "[a-z]@gmail.*";
	private static final Pattern p = Pattern.compile(myRegExString);
	private static Matcher m;
	private static List<String> lista = new ArrayList<String>();
	
	private static void emailMathcer (String name, String email) {
		m = p.matcher(email);
		if(m.find())
			lista.add(name);
	}
	private static void printList(){
		Collections.sort(lista);
		for(String name: lista){
			System.out.println(name);
		}
	} 
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            emailMathcer(firstName, emailID);
        }

        scanner.close();
        printList();
    }
}

